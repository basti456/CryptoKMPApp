package com.example.data.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CoinMarketDto(
    val id: String,
    val symbol: String,
    val name: String,
    val image: String,
    @SerialName("current_price") val currentPrice: Double? = null,
    @SerialName("market_cap") val marketCap: Double? = null,
    @SerialName("market_cap_rank") val marketCapRank: Int? = null,
    @SerialName("total_volume") val totalVolume: Double? = null,
    @SerialName("price_change_percentage_24h") val priceChangePercentage24h: Double? = null,
    @SerialName("price_change_percentage_7d_in_currency") val priceChangePercentage7d: Double? = null,
    @SerialName("price_change_percentage_30d_in_currency") val priceChangePercentage30d: Double? = null,
    @SerialName("circulating_supply") val circulatingSupply: Double? = null,
    val ath: Double? = null,
    @SerialName("sparkline_in_7d") val sparklineIn7d: SparklineDto? = null
)

@Serializable
data class SparklineDto(
    val price: List<Double>? = null
)