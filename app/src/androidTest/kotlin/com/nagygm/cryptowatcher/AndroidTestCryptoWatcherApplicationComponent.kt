package com.nagygm.cryptowatcher

import com.nagygm.cryptowatcher.interactor.InteractorModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MockNetworkModule::class, TestModule::class, InteractorModule::class])
interface AndroidTestCryptoWatcherApplicationComponent : CryptoWatcherApplicationComponent{
    fun inject(mainTest: MainTest)
    fun inject(cryptoDetailsTest: CryptoDetailsTest)
}