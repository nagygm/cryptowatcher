package com.nagygm.cryptowatcher.ui

import android.app.Application
import android.content.Context
import com.google.firebase.analytics.FirebaseAnalytics
import com.nagygm.cryptowatcher.interactor.main.MainInteractor
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
    open fun provideContext(application: Application?): Context? {
        return application
    }
    @Provides
    @Singleton
    fun mainPresenter(executor: Executor, mainInteractor: MainInteractor) = MainPresenter(executor, mainInteractor)

    @Provides
    @Singleton
    fun cryptoDetailsPresenter() = CryptoDetailsPresenter()

    @Provides
    @Singleton
    fun networkExecutor(): Executor = Executors.newFixedThreadPool(1)

    @Provides
    @Singleton
    fun firebaseAnalytics() = FirebaseAnalytics.getInstance(context)

}