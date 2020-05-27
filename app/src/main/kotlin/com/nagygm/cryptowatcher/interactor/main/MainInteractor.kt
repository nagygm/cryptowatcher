package com.nagygm.cryptowatcher.interactor.main

import android.util.Log
import com.nagygm.cryptowatcher.interactor.main.event.GetPinnedCryptoCurrencies
import com.nagygm.cryptowatcher.model.CoinWithAllAlerts
import com.nagygm.cryptowatcher.network.SimpleApi
import com.nagygm.cryptowatcher.persistence.Alert
import com.nagygm.cryptowatcher.persistence.AlertDao
import com.nagygm.cryptowatcher.persistence.Coin
import com.nagygm.cryptowatcher.persistence.CoinDao
import org.greenrobot.eventbus.EventBus
import retrofit2.Response
import java.lang.Exception
import java.util.concurrent.atomic.AtomicInteger
import javax.inject.Inject

class MainInteractor @Inject constructor(
    private var coinDao: CoinDao,
    private var simpleApi: SimpleApi,
    private var alertDao: AlertDao
) {
    private var mapOfCoins: List<CoinWithAllAlerts> = mutableListOf()


    init {
        mapOfCoins = mutableListOf(
            CoinWithAllAlerts(
                1,
                Coin(
                    1,
                    "bitcoin",
                    "btc",
                    "Bitcoin",
                    "usd",
                    "https://assets.coingecko.com/coins/images/1/small/bitcoin.png?1547033579",
                    9130.62
                ),
                mutableListOf(
                    Alert(1, 300.0, true, 1),
                    Alert(2, 200.0, false, 1)
                )
            ),
            CoinWithAllAlerts(
                2,
                Coin(
                    2,
                    "ethereum",
                    "eth",
                    "Ethereum",
                    "huf",
                    "https://assets.coingecko.com/coins/images/279/small/ethereum.png?1547034048",
                    182.2
                ),
                mutableListOf(
                    Alert(3, 100.0, true, 2),
                    Alert(4, 10.0, false, 2)
                )
            ),
            CoinWithAllAlerts(
                3,
                Coin(
                    3,
                    "ripple",
                    "xrp",
                    "XRP",
                    "huf",
                    "https://assets.coingecko.com/coins/images/44/small/xrp.png?1564480400",
                    9130.62
                ),
                mutableListOf(
                    Alert(5, 768.0, true, 3),
                    Alert(6, 12.0, false, 3)
                )
            ),
            CoinWithAllAlerts(
                4,
                Coin(
                    4,
                    "0cash",
                    "zch",
                    "0cash",
                    "huf",
                    "https://assets.coingecko.com/coins/images/10838/small/0cash.png?1584596732",
                    9130.62
                ),
                mutableListOf(
                    Alert(7, 772.0, true, 4),
                    Alert(8, 11.0, false, 4)
                )
            )
        )
    }

    fun getPinnedCryptoCurrencies() {
        val event = GetPinnedCryptoCurrencies()
        try {

            val coins = coinDao.loadAll()

            val coinsWithAllAlerts: MutableList<CoinWithAllAlerts> = mutableListOf()
            coins.forEach {
                val a = alertDao.loadAllAlertsForCoin(it.id)
                coinsWithAllAlerts.add(CoinWithAllAlerts(it.id, it, a))
            }

            val ids = coins.map { it.externalId }.reduce { a, b -> "$a,$b" }
            val vsCurrencies = coins.map { it.vsCurrency }.reduce { a, b -> "$a,$b" }

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
                it.lastValue =
                    data.body()?.get(it.externalId)?.get(it.vsCurrency)
                        ?: it.lastValue
            }

            coins.forEach { coinDao.updateCoin(it) }

            Log.d("DB", "Pinned coin count")
            event.coins = coinsWithAllAlerts
            EventBus.getDefault().post(event)
        } catch (e: Exception) {
            event.throwable = e
            EventBus.getDefault().post(event)
        }


    }

    var counter: AtomicInteger = AtomicInteger(0);

    fun pinCoin() {

        if (mapOfCoins.size > counter.get()) {
            val m = mapOfCoins[counter.getAndIncrement()]
            coinDao.insertCoin(m.coin)
            m.alerts.forEach {
                alertDao.insertAlert(it)
            }
        }
        getPinnedCryptoCurrencies()

    }
}