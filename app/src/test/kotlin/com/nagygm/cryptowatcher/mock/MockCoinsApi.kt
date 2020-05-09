package com.nagygm.cryptowatcher.mock

import com.nagygm.cryptowatcher.model.CoinFullData
import com.nagygm.cryptowatcher.model.CoinHistoryById
import com.nagygm.cryptowatcher.model.CoinList
import com.nagygm.cryptowatcher.model.MarketChart
import com.nagygm.cryptowatcher.network.CoinsApi
import retrofit2.Call

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
        TODO("Not yet implemented")
    }

    override fun coinsIdHistoryGet(
        id: String?,
        date: String?,
        localization: String?
    ): Call<CoinHistoryById?>? {
        TODO("Not yet implemented")
    }

    override fun coinsIdMarketChartGet(
        id: String?,
        vsCurrency: String?,
        days: String?
    ): Call<MarketChart?>? {
        TODO("Not yet implemented")
    }

    override fun coinsListGet(): Call<List<CoinList?>?>? {
        TODO("Not yet implemented")
    }
}