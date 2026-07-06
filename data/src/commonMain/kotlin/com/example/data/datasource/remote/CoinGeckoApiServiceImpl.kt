package com.example.data.datasource.remote

import com.example.data.models.CoinDetailDto
import com.example.data.models.CoinMarketDto
import com.example.data.models.MarketChartDto
import com.example.data.models.SearchResponseDto
import com.example.network.NetworkConfig
import com.example.network.buildHttpClient
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get


class CoinGeckoApiServiceImpl(
    private val httpClient: HttpClient = buildHttpClient(networkConfig)
) : CoinGeckoApiService {
    override suspend fun getCoinsMarkets(
        vsCurrency: String,
        ids: String?,
        order: String,
        perPage: Int,
        page: Int,
        sparkline: Boolean,
        priceChangePercentage: String
    ): List<CoinMarketDto> {
        return httpClient.get("coins/markets") {
            url {
                parameters.append("vs_currency", vsCurrency)
                ids?.let { parameters.append("ids", it) }
                parameters.append("order", order)
                parameters.append("per_page", perPage.toString())
                parameters.append("page", page.toString())
                parameters.append("sparkline", sparkline.toString())
                parameters.append("price_change_percentage", priceChangePercentage)
            }
        }.body()
    }

    override suspend fun search(query: String): SearchResponseDto {
        return httpClient.get("search") {
            url {
                parameters.append("query", query)
            }
        }.body()
    }

    override suspend fun getCoinById(id: String): CoinDetailDto {
        return httpClient.get("coins/$id") {
            url {
                parameters.append("localization", false.toString())
                parameters.append("tickers", false.toString())
                parameters.append("market_data", true.toString())
                parameters.append("community_data", false.toString())
                parameters.append("developer_data", false.toString())
            }

        }.body()
    }

    override suspend fun getMarketChart(
        id: String,
        vsCurrency: String,
        days: String
    ): MarketChartDto {
        return httpClient.get("coins/$id/market_chart") {
            url {
                parameters.append("vs_currency", vsCurrency)
                parameters.append("days", days)

            }
        }.body()
    }

    companion object {
        val apiKey = "CG-ZEK2CDuETHj9UFvRC4Lrvx8x"
        val networkConfig =
            NetworkConfig(
                baseUrl = "https://api.coingecko.com/api/v3/",
                headers = mapOf("x-cg-demo-api-key" to apiKey)
            )
    }
}