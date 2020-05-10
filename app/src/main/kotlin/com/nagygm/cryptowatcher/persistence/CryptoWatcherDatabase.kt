package com.nagygm.cryptowatcher.persistence

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Coin::class, Alert::class], version = 1)
abstract class CryptoWatcherDatabase : RoomDatabase(){

    abstract fun alertDao(): AlertDao
    abstract fun coinDao(): CoinDao

    companion object {

        @Volatile private var INSTANCE: CryptoWatcherDatabase? = null

        fun getInstance(context: Context): CryptoWatcherDatabase =
            INSTANCE
                ?: synchronized(this) {
                INSTANCE
                    ?: buildDatabase(
                        context
                    )
                        .also { INSTANCE = it }
            }

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(context.applicationContext,
                CryptoWatcherDatabase::class.java, "cryptowatcher.db")
                .build()
    }
}