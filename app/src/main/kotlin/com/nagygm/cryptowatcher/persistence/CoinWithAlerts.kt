package com.nagygm.cryptowatcher.persistence

import androidx.room.Embedded
import androidx.room.Relation
import com.nagygm.cryptowatcher.persistence.Alert
import com.nagygm.cryptowatcher.persistence.Coin

data class CoinWithAlerts (
    @Embedded val coin: Coin,
    @Relation(
        parentColumn = "id",
        entityColumn = "coin_id"
    )
    val alerts: List<Alert>
)
