package com.nagygm.cryptowatcher.test

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.nagygm.cryptowatcher.CryptoWatcherApplication
import com.nagygm.cryptowatcher.DaggerTestCryptoWatcherApplicationComponent
import com.nagygm.cryptowatcher.TestCryptoWatcherApplicationComponent
import com.nagygm.cryptowatcher.TestModule
import com.nagygm.cryptowatcher.ui.main.MainPresenter
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import javax.inject.Inject

@RunWith(
    RobolectricTestRunner::class)
class MainTest {
    var mainPresenter: MainPresenter? = null
    @Inject set

//    val context = ApplicationProvider.getApplicationContext<Context>()


    @Before
    fun setUp() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val component = DaggerTestCryptoWatcherApplicationComponent.
            builder().testModule(TestModule(context)).build()
        component.inject(this)
    }

    @Test
    fun addition_isCorrect() {
        Assert.assertEquals(4, 2 + 2)
    }
}

