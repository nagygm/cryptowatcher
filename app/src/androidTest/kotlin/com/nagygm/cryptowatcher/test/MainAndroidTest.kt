package com.nagygm.cryptowatcher.test

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.matcher.ViewMatchers.assertThat
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.nagygm.cryptowatcher.persistence.*
import org.hamcrest.CoreMatchers.equalTo
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.io.IOException

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

    @After
    @Throws(IOException::class)
    fun closeDb() {
        db.close()
    }



    @Test
    @Throws(Exception::class)
    fun useAppContext() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        Assert.assertEquals("com.nagygm.cryptowatcher", appContext.packageName)
    }

    @Test
    @Throws(Exception::class)
    fun insertCoin() {
        val coin: Coin =Coin(1, "eth", "eth", "Etherum", "eur", "anuuid", 111.0)
        coinDao.insertCoin(coin)
        val byId = coinDao.getOnebyId(1)
        assertThat(byId, equalTo(coin))

    }

    @Test
    @Throws(Exception::class)
    fun updateCoin() {
        val coin: Coin = Coin(1, "eth", "eth", "Etherum", "eur", "anuuid", 111.0)
        coinDao.insertCoin(coin)
        val byId = coinDao.getOnebyId(1).apply { vsCurrency = "usd" }
        assertThat(byId.id, equalTo(coin.id))
        assertThat(byId.vsCurrency, equalTo("usd"))
        coinDao.updateCoin(byId)
        val afterUpdate = coinDao.getOnebyId(1)
        assertThat(afterUpdate.vsCurrency, equalTo("usd"))

    }

    @Test
    @Throws(Exception::class)
    fun getCoinWithAlerts() {
        val coin: Coin = Coin(1, "eth", "eth", "Etherum", "eur", "anuuid", 111.0)
        val alert : Alert = Alert(1, 1.0, true, coin.id)
        coinDao.insertCoin(coin)
        alertDao.insertAlert(alert)
        val coinWithAlerts = coinDao.loadCoinWithAlertsById(coin.id)
        assertThat(coinWithAlerts[0].coin, equalTo(coin))
        assertThat(coinWithAlerts[0].alerts[0], equalTo(alert))

    }
}