package com.nagygm.cryptowatcher.interactor

import com.nagygm.cryptowatcher.interactor.cryptodetails.CryptoDetailsInteractor
import com.nagygm.cryptowatcher.interactor.main.MainInteractor
import com.nagygm.cryptowatcher.network.SimpleApi
import com.nagygm.cryptowatcher.persistence.CoinDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class InteractorModule {

    @Provides
    @Singleton
    fun provideMainInteractor(coinDao: CoinDao, simpleApi: SimpleApi) = MainInteractor(coinDao, simpleApi)

    @Provides
    @Singleton
    fun providesCryptoDetailsInteractor() = CryptoDetailsInteractor()
}
