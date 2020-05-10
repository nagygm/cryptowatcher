package com.nagygm.cryptowatcher.mock

import com.nagygm.cryptowatcher.model.*
import com.nagygm.cryptowatcher.network.CoinsApi
import retrofit2.Call
import retrofit2.Response

class MockCoinsApi : CoinsApi{
    override fun coinsIdGet(
        id: String?,
        localization: String?,
        tickers: Boolean?,
        marketData: Boolean?,
        communityData: Boolean?,
        developerData: Boolean?,
        sparkline: Boolean?
    ): Call<CoinFullData?>? {
        val result = CoinFullData()
        return MockCall(Response.success(result))
    }

    override fun coinsIdMarketChartGet(
        id: String?,
        vsCurrency: String?,
        days: String?
    ): Call<MarketChart?>? {
        val result = MarketChart()
        with(result) {
            prices(mutableListOf(listOf("1588964976605", "0.0012535175162226733")))
            marketCaps(mutableListOf(listOf("1588964976605","13765.521041834398")))
            totalVolumes(mutableListOf(listOf("1588964976605", "1432.529773809611")))
        }
        return MockCall(Response.success(result))
    }

    override fun coinsListGet(): Call<List<CoinList?>?>? {
        val coinListResult = listOf(CoinList().id("01coin").name("zoc").symbol("01coin")) as List<CoinList?>?
        return MockCall(Response.success(coinListResult))
    }
}