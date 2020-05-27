package com.nagygm.cryptowatcher.interactor.main.event

import com.nagygm.cryptowatcher.model.CoinWithAllAlerts


data class GetPinnedCryptoCurrencies (
    var coins: List<CoinWithAllAlerts> = emptyList(),
    var throwable: Throwable? = null,
    var code: Int? = null,
    var networkData: Map<String, Map<String, Double>>? = emptyMap()
)