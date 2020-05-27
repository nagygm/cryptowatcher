package com.nagygm.cryptowatcher.interactor.main

import android.util.Log
import com.nagygm.cryptowatcher.interactor.main.event.GetPinnedCryptoCurrencies
import com.nagygm.cryptowatcher.network.SimpleApi
import com.nagygm.cryptowatcher.persistence.Coin
import com.nagygm.cryptowatcher.persistence.CoinDao
import org.greenrobot.eventbus.EventBus
import retrofit2.Call
import retrofit2.Response
import java.lang.Exception
import javax.inject.Inject

class MainInteractor @Inject constructor(
    private var coinDao: CoinDao,
    private var simpleApi: SimpleApi
) {
    fun getPinnedCryptoCurrencies() {
        val event = GetPinnedCryptoCurrencies()
        try {
            coinDao.insertCoin(
                Coin(
                    1,
                    "bitcoin",
                    "btc",
                    "Bitcoin",
                    "eur",
                    "https://assets.coingecko.com/coins/images/1/small/bitcoin.png?1547033579",
                    9130.62
                )
            )
            coinDao.insertCoin(
                Coin(
                    2,
                    "ethereum",
                    "eth",
                    "Ethereum",
                    "eur",
                    "https://assets.coingecko.com/coins/images/279/small/ethereum.png?1547034048",
                    182.2
                )
            )
            val coins = coinDao.loadCoinsWithAlerts()

            val idsList = coins.map { it.coin.externalId }
            val ids = idsList.reduce { a, b -> "$a,$b" }
            val vsCurrencies = coins.map { it.coin.vsCurrency }.reduce { a, b -> "$a,$b" }

            val data: Response<Map<String, Map<String, Double>>> = simpleApi.simplePriceGet(
                ids, vsCurrencies,
                "false", "false",
                "false", "false"
            ).execute()

            if (data.code() != 200) {
                throw  Exception("Result code is not 200")
            }
            event.code = data.code()
            event.networkData = data.body()

            coins.forEach {
                it.coin.lastValue =
                    data.body()?.get(it.coin.externalId)?.get(it.coin.vsCurrency)
                        ?: it.coin.lastValue
            }

            Log.d("DB", "Pinned coin count")
            event.coins = coins
            EventBus.getDefault().post(event)
        } catch (e: Exception) {
            event.throwable = e
            EventBus.getDefault().post(event)
        }


    }
}