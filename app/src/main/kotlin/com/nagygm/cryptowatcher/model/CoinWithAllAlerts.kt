package com.nagygm.cryptowatcher.model

import com.nagygm.cryptowatcher.persistence.Alert
import com.nagygm.cryptowatcher.persistence.Coin

data class CoinWithAllAlerts(var id: Long, var coin: Coin, var alerts: List<Alert>)
