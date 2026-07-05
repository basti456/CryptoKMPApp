package com.example.cryptokmpapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform