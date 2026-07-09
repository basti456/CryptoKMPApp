package com.example.domain.models

data class OverviewStats(
    val totalMarketCap: Long,
    val avgChange: Double,
    val gainers: Int,
    val losers: Int
) {
    val isEmpty: Boolean get() = totalMarketCap == 0L && gainers == 0 && losers == 0

    companion object {
        val Empty = OverviewStats(0L, 0.0, 0, 0)
    }
}
