package com.example.network

import io.ktor.client.HttpClient
import io.ktor.client.engine.darwin.Darwin

actual fun createCoinGeckoHttpClient(): HttpClient = HttpClient(Darwin) {
    engine {
        configureRequest {
            setAllowsCellularAccess(true)
        }
    }
}