package com.nagygm.cryptowatcher

import android.content.Context
import androidx.test.core.app.ApplicationProvider

val testInjector: TestCryptoWatcherApplicationComponent
    get() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val component: TestCryptoWatcherApplicationComponent =
            DaggerTestCryptoWatcherApplicationComponent.builder().testModule(TestModule(context))
                .build()
        return component
    }
