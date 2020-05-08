package com.nagygm.cryptowatcher.model

import com.google.gson.annotations.SerializedName

class MarketChart {
   @SerializedName("prices")
    private val prices: List<List<String>>? = null

   @SerializedName("market_caps")
    private val marketCaps: List<List<String>>? = null

   @SerializedName("total_volumes")
    private val totalVolumes: List<List<String>>? =
        null
}