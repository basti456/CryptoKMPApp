package com.example.data.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CoinDetailDto(
    val id: String,
    val symbol: String,
    val name: String,
    val image: CoinImageDto? = null,
    val description: Map<String, String>? = null,
    @SerialName("market_cap_rank") val marketCapRank: Int? = null,
    @SerialName("market_data") val marketData: MarketDataDto? = null
)

@Serializable
data class CoinImageDto(
    val thumb: String? = null,
    val small: String? = null,
    val large: String? = null
)

/** Picks description for locale; falls back to "en" if locale not available. */
fun Map<String, String>?.getDescriptionForLocale(locale: String): String =
    this?.get(locale)?.takeIf { it.isNotBlank() }
        ?: this?.get("en")?.takeIf { it.isNotBlank() }
        ?: ""

@Serializable
data class MarketDataDto(
    @SerialName("current_price") val currentPrice: Map<String, Double>? = null,
    @SerialName("market_cap") val marketCap: Map<String, Double>? = null,
    @SerialName("total_volume") val totalVolume: Map<String, Double>? = null,
    @SerialName("price_change_percentage_24h") val priceChangePercentage24h: Double? = null,
    @SerialName("price_change_percentage_7d") val priceChangePercentage7d: Double? = null,
    @SerialName("price_change_percentage_30d") val priceChangePercentage30d: Double? = null,
    @SerialName("circulating_supply") val circulatingSupply: Double? = null,
    val ath: Map<String, Double>? = null
)
