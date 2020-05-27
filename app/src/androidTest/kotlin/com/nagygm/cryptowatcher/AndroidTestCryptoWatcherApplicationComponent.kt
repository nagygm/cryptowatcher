package com.nagygm.cryptowatcher

import com.nagygm.cryptowatcher.interactor.InteractorModule
import com.nagygm.cryptowatcher.mock.AndroidTestPersistenceModule
import com.nagygm.cryptowatcher.mock.AndroidMockNetworkModule
import com.nagygm.cryptowatcher.test.MainAndroidTest
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidTestModule::class, InteractorModule::class, AndroidTestPersistenceModule::class, AndroidMockNetworkModule::class])
interface AndroidTestCryptoWatcherApplicationComponent : CryptoWatcherApplicationComponent{
    fun inject(mainTest: MainAndroidTest)
}