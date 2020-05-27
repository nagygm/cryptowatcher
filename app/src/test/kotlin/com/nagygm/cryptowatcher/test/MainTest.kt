package com.nagygm.cryptowatcher.test

import android.os.Build
import com.nagygm.cryptowatcher.*
import com.nagygm.cryptowatcher.network.CoinsApi
import com.nagygm.cryptowatcher.network.SimpleApi
import com.nagygm.cryptowatcher.ui.main.MainPresenter
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import javax.inject.Inject

@RunWith(
    RobolectricTestRunner::class
)
@Config(sdk = [Build.VERSION_CODES.O_MR1])
class MainTest {
    var mainPresenter: MainPresenter? = null
        @Inject set

    lateinit var coinsApi: CoinsApi
        @Inject set
    lateinit var simpleApi: SimpleApi
        @Inject set


    @Before
    fun setUp() {
        testInjector.inject(this)
    }

    @Test
    fun callCoinListGetMock() {
        val result = coinsApi.coinsListGet()
        Assert.assertNotNull(result)
    }

    @Test
    fun callcoinsIdGetMock() {
        val result = coinsApi.coinsIdGet("", "",
            tickers = false,
            marketData = false,
            communityData = false,
            developerData = false,
            sparkline = false
        )
        Assert.assertNotNull(result)
    }

    @Test
    fun callCoinsIdMarketChartGetMock() {
        val result = coinsApi.coinsIdMarketChartGet("", "", "")
        Assert.assertNotNull(result)
    }

    @Test
    fun callSimplePriceGetMock() {
        val result = simpleApi.simplePriceGet("", "", "", "",
        "", "")
        Assert.assertNotNull(result)
    }

    @Test
    fun callSimpleSupportedVsCurrenciesGetMock() {
        val result = simpleApi.simpleSupportedVsCurrenciesGet()
        Assert.assertNotNull(result)
    }

    @Test
    fun callInteractor() {

    }
}

