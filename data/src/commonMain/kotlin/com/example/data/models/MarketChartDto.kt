package com.example.data.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MarketChartDto(
    val prices: List<List<Double>> = emptyList(),
    @SerialName("market_caps") val marketCaps: List<List<Double>> = emptyList(),
    @SerialName("total_volumes") val totalVolumes: List<List<Double>> = emptyList()
)
