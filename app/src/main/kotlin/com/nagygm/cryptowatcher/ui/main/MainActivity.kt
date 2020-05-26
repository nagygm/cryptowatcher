package com.nagygm.cryptowatcher.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.analytics.FirebaseAnalytics
import com.nagygm.cryptowatcher.R
import com.nagygm.cryptowatcher.injector
import com.nagygm.cryptowatcher.persistence.CoinDao
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainScreen {

    @Inject
    lateinit var mainPresenter: MainPresenter

    @Inject
    lateinit var firebaseAnalytics: FirebaseAnalytics

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        injector.inject(this)

        showPinnedCryptoCurrencies(mutableListOf())
    }

    override fun onStart() {
        super.onStart()
        mainPresenter.attachScreen(this)
    }

    override fun onStop() {
        super.onStop()
        mainPresenter.detachScreen()
    }

    override fun showPinnedCryptoCurrencies(coins: MutableList<CoinDao.CoinWithAlerts>) {
        mainPresenter.showPinnedCryptoCurrencies()
    }

    override fun showCryptoCurrencyDetails(position: Int, id: Long) {
        TODO("Not yet implemented")
    }

    override fun showError(errorMsg: String) {
        TODO("Not yet implemented")
    }
}
