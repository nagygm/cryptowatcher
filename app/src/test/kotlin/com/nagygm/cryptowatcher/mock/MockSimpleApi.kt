package com.nagygm.cryptowatcher.mock

import com.nagygm.cryptowatcher.network.SimpleApi
import retrofit2.Call

class MockSimpleApi : SimpleApi{
    override fun simplePriceGet(
        ids: String?,
        vsCurrencies: String?,
        includeMarketCap: String?,
        include24hrVol: String?,
        include24hrChange: String?,
        includeLastUpdatedAt: String?
    ): Call<Map<String?, Map<String?, Double?>?>?>? {
        TODO("Not yet implemented")
    }

    override fun simpleSupportedVsCurrenciesGet(): Call<List<String?>?>? {
        TODO("Not yet implemented")
    }
}