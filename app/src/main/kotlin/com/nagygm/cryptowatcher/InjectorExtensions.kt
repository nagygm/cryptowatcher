package com.nagygm.cryptowatcher

import android.app.Activity
import androidx.fragment.app.Fragment

val Activity.injector: CryptoWatcherApplicationComponent
    get() {
        return (this.applicationContext as CryptoWatcherApplication).injector
    }

val Fragment.injector:  CryptoWatcherApplicationComponent
    get() {
        return (this.context!!.applicationContext as CryptoWatcherApplication).injector
    }
