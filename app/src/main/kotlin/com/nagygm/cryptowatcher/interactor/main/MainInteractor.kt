package com.nagygm.cryptowatcher.interactor.main

import android.util.Log
import com.nagygm.cryptowatcher.interactor.main.event.GetPinnedCryptoCurrencies
import com.nagygm.cryptowatcher.network.SimpleApi
import com.nagygm.cryptowatcher.persistence.CoinDao
import org.greenrobot.eventbus.EventBus
import retrofit2.Call
import retrofit2.Response
import java.lang.Exception
import javax.inject.Inject

class MainInteractor @Inject constructor(private var coinDao: CoinDao, private var simpleApi: SimpleApi){
    fun getPinnedCryptoCurrencies() {
        val event = GetPinnedCryptoCurrencies()
        try {
            val coins = coinDao.loadCoinsWithAlerts()

            val idsList = coins.map { it.coin.externalId }
            val ids = idsList.reduce {a, b -> "$a,$b" }

            val data: Response<Map<String, Map<String, Double>>> = simpleApi.simplePriceGet(ids, "eur",
                "false", "false",
                "false", "false").execute()

            if(data.code() != 200) {
                throw  Exception("Result code is not 200")
            }
            event.code = data.code()
            event.networkData = data.body()

            Log.d("DB", "Pinned coin count")
            event.coins = coins
            EventBus.getDefault().post(event)
        } catch (e: Exception) {
            event.throwable = e
            EventBus.getDefault().post(event)
        }


    }
}