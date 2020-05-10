package com.nagygm.cryptowatcher

import com.nagygm.cryptowatcher.interactor.InteractorModule
import com.nagygm.cryptowatcher.network.NetworkModule
import com.nagygm.cryptowatcher.persistence.PersitenceModule
import com.nagygm.cryptowatcher.ui.UIModule
import com.nagygm.cryptowatcher.ui.main.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [UIModule::class, NetworkModule::class, InteractorModule::class, PersitenceModule::class])
interface CryptoWatcherApplicationComponent {
    fun inject(mainActivity: MainActivity)
}