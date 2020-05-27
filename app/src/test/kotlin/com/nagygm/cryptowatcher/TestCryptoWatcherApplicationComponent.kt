package com.nagygm.cryptowatcher

import com.nagygm.cryptowatcher.interactor.InteractorModule
import com.nagygm.cryptowatcher.mock.MockNetworkModule
import com.nagygm.cryptowatcher.mock.MockPersitenceModule
import com.nagygm.cryptowatcher.test.CryptoDetailsTest
import com.nagygm.cryptowatcher.test.MainTest
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MockNetworkModule::class, TestModule::class, InteractorModule::class, MockPersitenceModule::class])
interface TestCryptoWatcherApplicationComponent : CryptoWatcherApplicationComponent{
    fun inject(mainTest: MainTest)
    fun inject(cryptoDetailsTest: CryptoDetailsTest)
}