package com.nagygm.cryptowatcher

import android.app.Application
import com.nagygm.cryptowatcher.ui.UIModule

class CryptoWatcherApplication : Application() {
    lateinit var injector: Injector

    override fun onCreate() {
        super.onCreate()
        injector = DaggerInjector.builder().uIModule(UIModule(this)).build()
    }
}
