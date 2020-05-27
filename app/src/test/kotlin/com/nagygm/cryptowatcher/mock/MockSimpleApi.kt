package com.nagygm.cryptowatcher.mock

import com.nagygm.cryptowatcher.network.SimpleApi
import retrofit2.Call
import retrofit2.Response

class MockSimpleApi : SimpleApi{
    override fun simplePriceGet(
        ids: String?,
        vsCurrencies: String?,
        includeMarketCap: String?,
        include24hrVol: String?,
        include24hrChange: String?,
        includeLastUpdatedAt: String?
    ): Call<Map<String, Map<String, Double>>> {
        val result = mapOf("01coin" to mapOf("eur" to 0.00102403)) as Map<String, Map<String, Double>>
        return MockCall(Response.success(result))
    }

    override fun simpleSupportedVsCurrenciesGet(): Call<List<String?>?>? {
        val result = listOf("btc", "eth", "ltc") as List<String?>?
        return MockCall(Response.success(result))
    }
}