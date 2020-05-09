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
    fun loadCoinWithAlertsById(coinsId : Long) : List<CoinAlerts>

    data class CoinAlerts(val coin : Coin, val alerts : List<Alert>)

}