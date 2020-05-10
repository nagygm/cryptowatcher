package com.nagygm.cryptowatcher.mock

import com.nagygm.cryptowatcher.persistence.Alert
import com.nagygm.cryptowatcher.persistence.Coin
import com.nagygm.cryptowatcher.persistence.CoinDao

class MockCoinDao : CoinDao{
    override fun insertCoin(coin: Coin) {
        TODO("Not yet implemented")
    }

    override fun updateCoin(alert: Alert) {
        TODO("Not yet implemented")
    }

    override fun deleteCoin(alert: Alert) {
        TODO("Not yet implemented")
    }

    override fun loadCoinWithAlertsById(coinsId: Long): List<CoinDao.CoinWithAlerts> {
        TODO("Not yet implemented")
    }
}