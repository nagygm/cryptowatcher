package com.nagygm.cryptowatcher.ui.main

import com.nagygm.cryptowatcher.model.CoinWithAllAlerts
import com.nagygm.cryptowatcher.persistence.CoinDao

interface MainScreen {
    fun showCryptoCurrencyDetails(position: Int, id: Long)
    fun showError(errorMsg: String)
    fun showPinnedCryptoCurrencies(coins: MutableList<CoinWithAllAlerts>)
}
