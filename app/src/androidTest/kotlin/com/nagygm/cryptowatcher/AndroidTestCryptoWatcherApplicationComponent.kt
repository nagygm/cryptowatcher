package com.nagygm.cryptowatcher

import com.nagygm.cryptowatcher.interactor.InteractorModule
import com.nagygm.cryptowatcher.mock.AndroidTestPersistenceModule
import com.nagygm.cryptowatcher.persistence.PersitenceModule
import com.nagygm.cryptowatcher.test.MainAndroidTest
import com.nagygm.cryptowatcher.ui.UIModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidTestModule::class, InteractorModule::class, AndroidTestPersistenceModule::class])
interface AndroidTestCryptoWatcherApplicationComponent : CryptoWatcherApplicationComponent{
    fun inject(mainTest: MainAndroidTest)
}