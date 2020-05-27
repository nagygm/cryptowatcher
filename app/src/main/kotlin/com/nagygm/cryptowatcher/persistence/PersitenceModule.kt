package com.nagygm.cryptowatcher.persistence

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class PersitenceModule(application: Application) {
    var db: CryptoWatcherDatabase = CryptoWatcherDatabase.getInstance(application.applicationContext)

    @Singleton
    @Provides
    fun providesCryptoWatcherDatabase(): CryptoWatcherDatabase {
        return db
    }

    @Singleton
    @Provides
    fun providesAlertDao(database: CryptoWatcherDatabase): AlertDao {
        return database.alertDao()
    }

    @Singleton
    @Provides
    fun providesCoinDao(database: CryptoWatcherDatabase): CoinDao {
        return database.coinDao()
    }

}