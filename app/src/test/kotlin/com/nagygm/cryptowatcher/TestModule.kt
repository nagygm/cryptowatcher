package com.nagygm.cryptowatcher

import android.content.Context
import com.nagygm.cryptowatcher.ui.cryptodetails.CryptoDetailsPresenter
import com.nagygm.cryptowatcher.ui.main.MainPresenter
import com.nagygm.cryptowatcher.utils.UiExecutor
import dagger.Module
import dagger.Provides
import java.util.concurrent.Executor
import javax.inject.Singleton

@Module
class TestModule(private val context: Context) {
    @Provides
    fun provideContext() = context

    @Provides
    @Singleton
    fun provideMainPresenter() = MainPresenter()

    @Provides
    @Singleton
    fun provideCryptoDetailsPresenter() = CryptoDetailsPresenter()

    @Provides
    @Singleton
    fun provideNetworkExecutor(): Executor = UiExecutor()
}