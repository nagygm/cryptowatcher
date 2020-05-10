package com.nagygm.cryptowatcher

import android.content.Context
import com.nagygm.cryptowatcher.ui.UIModule
import dagger.Module
import dagger.Provides
import java.util.concurrent.Executor
import javax.inject.Singleton

@Module
class AndroidTestModule(private val context: Context) {

    private val uiModule: UIModule = UIModule(context)

    @Provides
    fun provideContext() = uiModule.context()

    @Provides
    @Singleton
    fun provideMainPresenter() = uiModule.mainPresenter()

    @Provides
    @Singleton
    fun provideCryptoDetailsPresenter() = uiModule.cryptoDetailsPresenter()

    @Provides
    @Singleton
    fun provideNetworkExecutor(): Executor = uiModule.networkExecutor()
}