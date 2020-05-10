package com.nagygm.cryptowatcher.service

import android.content.Context
import android.content.Intent
import androidx.work.Worker
import androidx.work.WorkerParameters


class AlertWorker(appContext: Context, workerParams: WorkerParameters)
: Worker(appContext, workerParams) {

    override fun doWork(): Result {

        checkAllAlerts()
        // Indicate whether the task finished successfully with the Result
        return Result.success()
    }


    fun checkAllAlerts() {
        TODO("Not yet implemented")
        // Get all pinned coins with alerts
        // Chekc if coingecko for coin data
        // create status bar notification if alert treshold reached, and last notification for alert
        // was at least one hour before
        // nofitfy user if anything happened
    }

}