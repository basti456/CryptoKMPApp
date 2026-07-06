package com.example.data.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SearchResponseDto(
    val coins: List<SearchCoinDto> = emptyList(),
    val exchanges: List<SearchExchangeDto> = emptyList(),
    val categories: List<SearchCategoryDto> = emptyList(),
    val nfts: List<SearchNftDto> = emptyList()
)

@Serializable
data class SearchCoinDto(
    val id: String,
    val name: String,
    @SerialName("api_symbol") val apiSymbol: String? = null,
    val symbol: String,
    @SerialName("market_cap_rank") val marketCapRank: Int? = null,
    val thumb: String? = null,
    val large: String? = null
)

@Serializable
data class SearchExchangeDto(
    val id: String,
    val name: String,
    @SerialName("market_type") val marketType: String? = null,
    val thumb: String? = null,
    val large: String? = null
)

@Serializable
data class SearchCategoryDto(
    val id: String,
    val name: String
)

@Serializable
data class SearchNftDto(
    val id: String,
    val name: String,
    val symbol: String,
    val thumb: String? = null
)
