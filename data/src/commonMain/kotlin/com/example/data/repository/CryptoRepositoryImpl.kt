package com.example.data.repository

import com.example.data.datasource.remote.CoinGeckoApiService
import com.example.domain.models.OverviewStats
import com.example.domain.repository.CryptoRepository
import com.example.storage.database.CryptoDatabase
import com.example.storage.models.Crypto
import kotlinx.coroutines.flow.Flow

class CryptoRepositoryImpl(
    private val api: CoinGeckoApiService,
    private val cryptoDatabase: CryptoDatabase
): CryptoRepository {
    override fun observeCryptoList(
        page: Int,
        perPage: Int
    ): Flow<List<Crypto>> {

    }

    override fun observeOverviewStats(limit: Int): Flow<OverviewStats> {

    }

    override fun observeLastUpdatedAt(): Flow<Long?> {

    }

    override suspend fun syncCryptoPage(
        page: Int,
        perPage: Int
    ): Result<Int> {

    }

    override fun observeSearchResult(query: String): Flow<List<Crypto>> {

    }

    override fun observeCryptoDetail(coinId: String): Flow<Crypto?> {

    }

    override suspend fun fetchChartData(
        coinId: String,
        vsCurrency: String,
        days: String
    ): Result<List<Double>> {
        TODO("Not yet implemented")
    }

    override suspend fun refreshCryptoList(
        page: Int,
        perPage: Int,
        vsCurrency: String?
    ): Result<Unit> {
        TODO("Not yet implemented")
    }

    override fun observeFavorites(): Flow<List<Crypto>> {
        TODO("Not yet implemented")
    }

    override fun observeIsFavorite(coinId: String): Flow<Boolean> {
        TODO("Not yet implemented")
    }

    override suspend fun addFavorite(coinId: String): Result<Unit> {
        TODO("Not yet implemented")
    }

    override suspend fun removeFavorite(coinId: String): Result<Unit> {
        TODO("Not yet implemented")
    }
}