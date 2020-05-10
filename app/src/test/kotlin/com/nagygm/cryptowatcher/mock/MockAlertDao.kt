package com.nagygm.cryptowatcher.mock

import com.nagygm.cryptowatcher.persistence.Alert
import com.nagygm.cryptowatcher.persistence.AlertDao

class MockAlertDao : AlertDao{
    override fun insertAlert(alert: Alert) {
        TODO("Not yet implemented")
    }

    override fun updateAlert(alert: Alert) {
        TODO("Not yet implemented")
    }

    override fun deleteAlert(alert: Alert) {
        TODO("Not yet implemented")
    }

    override fun loadAllAlertsForCoin(coinId: Long): List<Alert> {
        TODO("Not yet implemented")
    }
}