package com.nagygm.cryptowatcher.mock

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import com.nagygm.cryptowatcher.persistence.AlertDao
import com.nagygm.cryptowatcher.persistence.CoinDao
import com.nagygm.cryptowatcher.persistence.CryptoWatcherDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AndroidTestPersistenceModule {
    lateinit var db: CryptoWatcherDatabase

    fun AndroidTestPersistenceModule() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        db = Room.inMemoryDatabaseBuilder(
            context, CryptoWatcherDatabase::class.java
        ).build()
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