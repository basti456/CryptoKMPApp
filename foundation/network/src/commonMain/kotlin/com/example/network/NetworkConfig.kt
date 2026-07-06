package com.example.network

data class NetworkConfig(
    val baseUrl: String,
    val headers: Map<String, String> = emptyMap()
)
