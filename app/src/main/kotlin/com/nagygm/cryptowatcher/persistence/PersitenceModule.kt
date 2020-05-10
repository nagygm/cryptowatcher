package com.nagygm.cryptowatcher.persistence

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class PersitenceModule {
    lateinit var db: CryptoWatcherDatabase

    fun PersitenceModule(application: Application) {
        CryptoWatcherDatabase.getInstance(application.applicationContext)
    }

    @Singleton
    @Provides
    fun providesCryptoWatcherDatabase(): CryptoWatcherDatabase {
        return db
    }

    @Singleton
    @Provides
    fun providesProductDao(database: CryptoWatcherDatabase): CoinDao {
        return database.coinDao()
    }

    @Singleton
    @Provides
    fun productCoinDao(database: CryptoWatcherDatabase): AlertDao {
        return database.alertDao()
    }

}