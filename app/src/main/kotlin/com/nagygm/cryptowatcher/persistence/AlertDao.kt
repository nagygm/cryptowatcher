package com.nagygm.cryptowatcher.persistence

import androidx.room.*
import com.nagygm.cryptowatcher.persistence.Alert

@Dao
interface AlertDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAlert(alert: Alert)

    @Update
    fun updateAlert(alert: Alert)

    @Delete
    fun deleteAlert(alert: Alert)

    @Query("select * from alerts where alerts.coin_id = :coinId ")
    fun loadAllAlertsForCoin(coinId : Long) : List<Alert>
}