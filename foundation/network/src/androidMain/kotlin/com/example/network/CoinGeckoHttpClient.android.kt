package com.example.network

import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp
import okhttp3.ConnectionPool
import java.util.concurrent.TimeUnit

actual fun createCoinGeckoHttpClient(): HttpClient = HttpClient(OkHttp) {
    engine {
        config {
            followRedirects(true)
            connectionPool(ConnectionPool(5, 5, TimeUnit.MINUTES))
        }
    }
}