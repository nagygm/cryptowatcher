package com.nagygm.cryptowatcher.model

import com.google.gson.annotations.SerializedName

class Ticker {
   @SerializedName("base")
    private val base: String? = null

   @SerializedName("target")
    private val target: String? = null

   @SerializedName("market")
    private val market: Market? = null

   @SerializedName("last")
    private val last = 0.0

   @SerializedName("volume")
    private val volume = 0.0

   @SerializedName("converted_last")
    private val convertedLast: Map<String, String>? = null

   @SerializedName("converted_volume")
    private val convertedVolume: Map<String, String>? = null

   @SerializedName("trust_score")
    private val trustScore: String? = null

   @SerializedName("bid_ask_spread_percentage")
    private val bidAskSpreadPercentage = 0.0

   @SerializedName("timestamp")
    private val timestamp: String? = null

   @SerializedName("last_traded_at")
    private val lastTradedAt: String? = null

   @SerializedName("last_fetch_at")
    private val lastFetchAt: String? = null

   @SerializedName("is_anomaly")
    private val isAnomaly = false

   @SerializedName("is_stale")
    private val isStale = false

   @SerializedName("trade_url")
    private val tradeUrl: String? = null

   @SerializedName("coin_id")
    private val coinId: String? = null
}