package com.nagygm.cryptowatcher.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.nagygm.cryptowatcher.CryptoWatcherApplication
import com.nagygm.cryptowatcher.CryptoWatcherApplicationComponent
import com.nagygm.cryptowatcher.R
import com.nagygm.cryptowatcher.persistence.CoinDao
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainScreen {
    @Inject
    lateinit var mainPresenter: MainPresenter

    private var artistsAdapter: MainAdapter? = null

    private val injector: CryptoWatcherApplicationComponent
        get() {
            return (this.applicationContext as CryptoWatcherApplication).injector
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        injector.inject(this)

        showPinnedCryptoCurrencies(mutableListOf())

        floatingActionButton.setOnClickListener { view -> Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show() }
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
//        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show()
    }
}
