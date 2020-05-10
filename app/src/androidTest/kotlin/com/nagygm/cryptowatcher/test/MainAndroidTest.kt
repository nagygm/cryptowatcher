package com.nagygm.cryptowatcher.test

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.nagygm.cryptowatcher.persistence.AlertDao
import com.nagygm.cryptowatcher.persistence.CoinDao
import com.nagygm.cryptowatcher.persistence.CryptoWatcherDatabase
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainAndroidTest {
    private lateinit var coinDao: CoinDao
    private lateinit var alertDao: AlertDao
    private lateinit var db: CryptoWatcherDatabase


    @Before
    fun createDb() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        db = Room.inMemoryDatabaseBuilder(
            context, CryptoWatcherDatabase::class.java
        ).build()
        coinDao = db.coinDao()
        alertDao = db.alertDao()
    }


    @Test
    fun useAppContext() {
        //
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        Assert.assertEquals("com.nagygm.cryptowatcher", appContext.packageName)
    }
}