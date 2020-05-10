package com.nagygm.cryptowatcher.ui.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nagygm.cryptowatcher.R
import com.nagygm.cryptowatcher.injector
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainScreen {

    @Inject
    lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        injector.inject(this)
    }

    override fun onStart() {
        super.onStart()
        mainPresenter.attachScreen(this)
    }

    override fun onStop() {
        super.onStop()
        mainPresenter.detachScreen()
    }

    override fun showPinnedCryptoCurrencies() {
        TODO("Not yet implemented")
    }

    override fun showNetworkError(errorMsg: String) {
        TODO("Not yet implemented")
    }
}
