package com.nagygm.cryptowatcher.persistence

import androidx.room.*

@Dao
interface CoinDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCoin(coin: Coin)

    @Update
    fun updateCoin(alert: Alert)

    @Delete
    fun deleteCoin(alert: Alert)

    @Query("select * from coins inner join alerts on coins.id = alerts.coin_id where coins.id = :coinsId ")
    @Transaction
    fun loadCoinWithAlertsById(coinsId : Long) : List<CoinWithAlerts>

    data class CoinWithAlerts (
        @Embedded var coin: Coin,
        @Relation(
            parentColumn = "id",
            entityColumn = "coin_id"
        )
        val alerts: List<Alert>
    )

}