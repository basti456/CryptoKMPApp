package com.example.domain.repository

import com.example.domain.models.OverviewStats
import com.example.storage.models.Crypto
import kotlinx.coroutines.flow.Flow

interface CryptoRepository {

    fun observeCryptoList(page: Int, perPage: Int): Flow<List<Crypto>>

    fun observeOverviewStats(limit: Int): Flow<OverviewStats>

    fun observeLastUpdatedAt(): Flow<Long?>

    suspend fun syncCryptoPage(page: Int, perPage: Int): Result<Int>

    fun observeSearchResult(query: String): Flow<List<Crypto>>

    fun observeCryptoDetail(coinId: String): Flow<Crypto?>

    suspend fun fetchChartData(
        coinId: String,
        vsCurrency: String,
        days: String
    ): Result<List<Double>>

    suspend fun refreshCryptoList(page: Int, perPage: Int, vsCurrency: String? = null): Result<Unit>

    fun observeFavorites(): Flow<List<Crypto>>

    fun observeIsFavorite(coinId: String): Flow<Boolean>

    suspend fun addFavorite(coinId: String): Result<Unit>

    suspend fun removeFavorite(coinId: String): Result<Unit>


}