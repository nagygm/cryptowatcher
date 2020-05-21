package com.nagygm.cryptowatcher.ui.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore
import com.nagygm.cryptowatcher.R
import com.nagygm.cryptowatcher.injector
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.RuntimeException
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


        crash_btn.setOnClickListener { throw RuntimeException("I said it will crush!") }
        analytics_btn.setOnClickListener {
            val bundle = Bundle()
            with(bundle) {
                putString(FirebaseAnalytics.Param.ITEM_ID, "1")
                putString(FirebaseAnalytics.Param.ITEM_NAME, "An achievement.")
                putString(FirebaseAnalytics.Param.CONTENT_TYPE, "You successfully reached the google analytics page!")
            }
            firebaseAnalytics.logEvent(FirebaseAnalytics.Event.UNLOCK_ACHIEVEMENT, bundle)
        }
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
