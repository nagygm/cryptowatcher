package com.nagygm.cryptowatcher.ui.main

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
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

    private var mainAdapter: MainAdapter? = null
    private var coins: MutableList<CoinDao.CoinWithAlerts> = mutableListOf()

    private val injector: CryptoWatcherApplicationComponent
        get() {
            return (this.applicationContext as CryptoWatcherApplication).injector
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        injector.inject(this)

        mainPresenter.showPinnedCryptoCurrencies()

        floatingActionButton.setOnClickListener { view ->
            Snackbar.make(
                view,
                "Replace with your own action",
                Snackbar.LENGTH_LONG
            ).setAction("Action", null).show()
        }
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onStop() {
        super.onStop()
        mainPresenter.detachScreen()
    }

    override fun onResume() {
        super.onResume()
        mainPresenter.attachScreen(this)
        val llm = LinearLayoutManager(this.applicationContext)
        llm.orientation = LinearLayoutManager.VERTICAL
        recyclerViewPinnedCryptoCurrencies.layoutManager = llm
        mainAdapter = MainAdapter(this.applicationContext, coins)
        recyclerViewPinnedCryptoCurrencies.adapter = mainAdapter
    }

    override fun onPause() {
        mainPresenter.detachScreen()
        super.onPause()
    }

    override fun showPinnedCryptoCurrencies(coins: MutableList<CoinDao.CoinWithAlerts>) {
        swipeRefreshLayoutMain.isRefreshing = false
        this.coins.clear()
        this.coins.addAll(coins)

        mainAdapter?.updateData(coins)

        if (this.coins.isEmpty()) {
            recyclerViewPinnedCryptoCurrencies.visibility = View.GONE
            emptyTextView.visibility = View.VISIBLE
        } else {
            recyclerViewPinnedCryptoCurrencies.visibility = View.VISIBLE
            emptyTextView.visibility = View.GONE
        }
    }

    override fun showCryptoCurrencyDetails(position: Int, id: Long) {
        TODO("Not yet implemented")
    }

    override fun showError(errorMsg: String) {
        Toast.makeText(this.applicationContext, errorMsg, Toast.LENGTH_LONG).show()
    }
}
