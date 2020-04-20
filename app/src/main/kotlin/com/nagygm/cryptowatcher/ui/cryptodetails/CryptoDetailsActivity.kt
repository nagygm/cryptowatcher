package com.nagygm.cryptowatcher.ui.cryptodetails

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nagygm.cryptowatcher.R
import com.nagygm.cryptowatcher.injector
import javax.inject.Inject

class CryptoDetailsActivity : AppCompatActivity() {

    @Inject
    lateinit var cryptoDetailsPresenter: CryptoDetailsPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}