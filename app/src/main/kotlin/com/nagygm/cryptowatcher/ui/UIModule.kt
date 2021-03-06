package com.nagygm.cryptowatcher.ui

import android.content.Context
import com.nagygm.cryptowatcher.ui.cryptodetails.CryptoDetailsPresenter
import com.nagygm.cryptowatcher.ui.main.MainPresenter
import dagger.Module
import dagger.Provides
import java.util.concurrent.Executor
import java.util.concurrent.Executors
import javax.inject.Singleton


@Module
open class UIModule(private val context: Context) {

    @Provides
    fun context() = context

    @Provides
    @Singleton
    fun mainPresenter() = MainPresenter()

    @Provides
    @Singleton
    fun cryptoDetailsPresenter() = CryptoDetailsPresenter()

    @Provides
    @Singleton
    fun networkExecutor(): Executor = Executors.newFixedThreadPool(1)
}