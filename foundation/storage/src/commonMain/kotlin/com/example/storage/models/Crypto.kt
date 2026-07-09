package com.example.storage.models

data class Crypto(
    val id: String,
    val name: String,
    val symbol: String,
    val icon: String,
    val price: Double,
    val change24h: Double,
    val change7d: Double,
    val change30d: Double,
    val marketCap: Long,
    val volume24h: Long,
    val circulatingSupply: Long,
    val rank: Int,
    val ath: Double,
    val description: String,
    val sparkline: List<Double>,
    val chartData: List<Double>
)
