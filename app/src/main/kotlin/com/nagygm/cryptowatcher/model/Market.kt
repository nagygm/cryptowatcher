package com.nagygm.cryptowatcher.model

import com.google.gson.annotations.SerializedName

class Market {
   @SerializedName("name")
    private val name: String? = null

   @SerializedName("identifier")
    private val identifier: String? = null

   @SerializedName("has_trading_incentive")
    private val hasTradingIncentive = false
}