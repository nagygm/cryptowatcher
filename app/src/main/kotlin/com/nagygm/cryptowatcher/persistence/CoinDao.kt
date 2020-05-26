package com.nagygm.cryptowatcher.persistence

import androidx.room.*

@Dao
interface CoinDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCoin(coin: Coin)

    @Update
    fun updateCoin(coin: Coin)

    @Delete
    fun deleteCoin(coin: Coin)

    @Query("select * from coins where coins.id = :coinsId ")
    fun getOnebyId(coinsId: Long) : Coin

    @Query("select * from coins left join alerts on coins.id = alerts.coin_id where coins.id = :coinsId ")
    @Transaction
    fun loadCoinWithAlertsById(coinsId : Long) : List<CoinWithAlerts>

    @Query("select * from coins left join alerts on coins.id = alerts.coin_id ")
    @Transaction
    fun loadCoinsWithAlerts() : List<CoinWithAlerts>

    data class CoinWithAlerts (
        @Embedded var coin: Coin,
        @Relation(
            parentColumn = "id",
            entityColumn = "coin_id"
        )
        val alerts: List<Alert>
    )

}