package com.example.network

import io.ktor.http.Url

data class NetworkConfig(
    val baseUrl: String,
    val headers: Map<String, String> = emptyMap()
)
