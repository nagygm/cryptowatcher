package com.nagygm.cryptowatcher.test

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.nagygm.cryptowatcher.*
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
        testInjector.inject(this)
    }

    @Test
    fun addition_isCorrect() {
        Assert.assertNotNull(mainPresenter)
    }
}

