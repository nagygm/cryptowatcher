package com.nagygm.cryptowatcher.ui.main

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.nagygm.cryptowatcher.CryptoWatcherApplication
import com.nagygm.cryptowatcher.CryptoWatcherApplicationComponent
import com.nagygm.cryptowatcher.R
import com.nagygm.cryptowatcher.model.CoinWithAllAlerts
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainScreen, AdapterView.OnItemSelectedListener,
    SwipeRefreshLayout.OnRefreshListener {
    @Inject
    lateinit var mainPresenter: MainPresenter

    private var mainAdapter: MainAdapter? = null
    private var coins: MutableList<CoinWithAllAlerts> = mutableListOf()

    private val injector: CryptoWatcherApplicationComponent
        get() {
            return (this.applicationContext as CryptoWatcherApplication).injector
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        injector.inject(this)


        val spinner: Spinner = findViewById(R.id.currency_spinner)
        ArrayAdapter.createFromResource(
            this,
            R.array.crypto_curr_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner.adapter = adapter
        }

        val refreshLayout: SwipeRefreshLayout = findViewById(R.id.swipeRefreshLayoutMain)
        refreshLayout.setOnRefreshListener(this)

        mainPresenter.showPinnedCryptoCurrencies()
        floatingActionButton.setOnClickListener { view ->
            mainPresenter.pinCoin()
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

    override fun showPinnedCryptoCurrencies(coins: MutableList<CoinWithAllAlerts>) {
        swipeRefreshLayoutMain.isRefreshing = false
        this.coins.clear()
        this.coins.addAll(coins)

        mainAdapter?.updateData(this.coins)

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

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("Not yet implemented")
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        TODO("Not yet implemented")
    }

    override fun onRefresh() {
        mainPresenter.showPinnedCryptoCurrencies()
    }
}
