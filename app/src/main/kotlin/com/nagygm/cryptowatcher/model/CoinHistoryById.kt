package com.nagygm.cryptowatcher.model

import com.google.gson.annotations.SerializedName

class CoinHistoryById {
   @SerializedName("id")
    private val id: String? = null

   @SerializedName("symbol")
    private val symbol: String? = null

   @SerializedName("name")
    private val name: String? = null

   @SerializedName("localization")
    private val localization: Map<String, String>? = null

   @SerializedName("image")
    private val image: Image? = null

   @SerializedName("market_data")
    private val marketData: MarketData? = null

   @SerializedName("community_data")
    private val communityData: CommunityData? = null

   @SerializedName("developer_data")
    private val developerData: DeveloperData? = null

   @SerializedName("public_interest_stats")
    private val publicInterestStats: PublicInterestStats? = null
}