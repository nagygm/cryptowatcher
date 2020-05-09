package com.nagygm.cryptowatcher.persistence

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "coins")
data class Coin (
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id : Long
)