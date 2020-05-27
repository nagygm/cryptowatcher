package com.nagygm.cryptowatcher.mock

import android.app.Application
import androidx.room.Room
import com.nagygm.cryptowatcher.persistence.AlertDao
import com.nagygm.cryptowatcher.persistence.CoinDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class MockPersitenceModule {

    @Singleton
    @Provides
    fun providesAlertDao(): AlertDao {
        return MockAlertDao()
    }

    @Singleton
    @Provides
    fun providesCoinDao(): CoinDao {
        return MockCoinDao()
    }

}