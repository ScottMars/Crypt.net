package com.scott_mars.cryptocurrency.domain.repository

import com.scott_mars.cryptocurrency.data.remote.dto.CoinDetailDto
import com.scott_mars.cryptocurrency.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}