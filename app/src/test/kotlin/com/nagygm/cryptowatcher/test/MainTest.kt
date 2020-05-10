package com.nagygm.cryptowatcher.test

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.nagygm.cryptowatcher.*
import com.nagygm.cryptowatcher.mock.MockSimpleApi
import com.nagygm.cryptowatcher.network.CoinsApi
import com.nagygm.cryptowatcher.network.SimpleApi
import com.nagygm.cryptowatcher.ui.main.MainPresenter
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import javax.inject.Inject

@RunWith(
    RobolectricTestRunner::class
)
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
}

