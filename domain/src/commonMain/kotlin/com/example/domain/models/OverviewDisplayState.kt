package com.example.domain.models

data class OverviewDisplayState(
    val formattedMarketCap: String,
    val formattedAvgChange: String,
    val formattedGainersLosers: String,
    val gainers: Int,
    val losers: Int,
    val isEmpty: Boolean
) {
    companion object {
        val Empty = OverviewDisplayState(
            formattedMarketCap = "$0.0B",
            formattedAvgChange = "0.00%",
            formattedGainersLosers = "0/0",
            gainers = 0,
            losers = 0,
            isEmpty = true
        )
    }
}