package com.nagygm.cryptowatcher.interactor.main.event

import com.nagygm.cryptowatcher.persistence.CoinDao


data class GetPinnedCryptoCurrencies (
    var coins: List<CoinDao.CoinWithAlerts> = emptyList(),
    var throwable: Throwable? = null,
    var code: Int? = null,
    var networkData: Map<String, Map<String, Double>> = emptyMap()
)