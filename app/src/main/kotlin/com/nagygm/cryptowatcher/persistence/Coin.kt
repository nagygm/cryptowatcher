package com.nagygm.cryptowatcher.persistence

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "coins")
data class Coin (
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id") var id : Long,
    @ColumnInfo(name = "external_id") var externalId : String,
    @ColumnInfo(name = "coin_symbol") var symbol : String,
    @ColumnInfo(name = "coin_name") var name : String,
    @ColumnInfo(name = "vsCurrency") var vsCurrency :String,
    @ColumnInfo(name = "image") var image : String,
    @ColumnInfo(name = "last_value") var lastValue : Double
)