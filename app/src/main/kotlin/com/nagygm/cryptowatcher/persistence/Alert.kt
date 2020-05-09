package com.nagygm.cryptowatcher.persistence

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "alerts")
data class Alert (
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id") var id : Long,
    @ColumnInfo(name ="border_value") var borderValue : Double,
    @ColumnInfo(name = "coin_id") var coin_id: Long
)