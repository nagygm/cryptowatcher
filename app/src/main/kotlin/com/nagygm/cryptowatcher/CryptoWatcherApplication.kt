package com.nagygm.cryptowatcher

import android.app.Application
import com.nagygm.cryptowatcher.ui.UIModule

class CryptoWatcherApplication : Application() {
    lateinit var injector: CryptoWatcherApplicationComponent

    override fun onCreate() {
        super.onCreate()
        //TODO add workamanger periodic request
        injector = DaggerCryptoWatcherApplicationComponent.builder().uIModule(UIModule(this)).build()
    }
}
