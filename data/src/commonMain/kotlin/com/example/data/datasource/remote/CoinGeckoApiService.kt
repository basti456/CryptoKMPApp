package com.example.data.datasource.remote

import com.example.data.models.CoinDetailDto
import com.example.data.models.CoinMarketDto
import com.example.data.models.MarketChartDto
import com.example.data.models.SearchResponseDto

interface CoinGeckoApiService {
    suspend fun getCoinsMarkets(
        vsCurrency: String = "usd",
        ids: String? = null,
        order: String = "market_cap_desc",
        perPage: Int = 100,
        page: Int = 1,
        sparkline: Boolean = true,
        priceChangePercentage: String = "24h,7d,30d"
    ): List<CoinMarketDto>

    suspend fun search(query: String): SearchResponseDto

    suspend fun getCoinById(id: String): CoinDetailDto

    suspend fun getMarketChart(id: String, vsCurrency: String = "usd", days: String = "7"): MarketChartDto
}