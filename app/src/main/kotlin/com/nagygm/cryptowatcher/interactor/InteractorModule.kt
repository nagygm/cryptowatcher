package com.nagygm.cryptowatcher.interactor

import com.nagygm.cryptowatcher.interactor.cryptodetails.CryptoDetailsInteractor
import com.nagygm.cryptowatcher.interactor.main.MainInteractor
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class InteractorModule {

    @Provides
    @Singleton
    fun provideMainInteractor() = MainInteractor()

    @Provides
    @Singleton
    fun providesCryptoDetailsInteractor() = CryptoDetailsInteractor()
}
