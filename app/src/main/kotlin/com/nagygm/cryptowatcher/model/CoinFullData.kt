package com.nagygm.cryptowatcher.model

import com.google.gson.annotations.SerializedName


class CoinFullData {
   @SerializedName("id")
    private val id: String? = null

   @SerializedName("symbol")
    private val symbol: String? = null

   @SerializedName("name")
    private val name: String? = null

   @SerializedName("block_time_in_minutes")
    private val blockTimeInMinutes: Long = 0

   @SerializedName("categories")
    private val categories: List<Any>? = null

   @SerializedName("localization")
    private val localization: Map<String, String>? = null

   @SerializedName("description")
    private val description: Map<String, String>? = null

   @SerializedName("links")
    private val links: Links? = null

   @SerializedName("image")
    private val image: Image? = null

   @SerializedName("country_origin")
    private val countryOrigin: String? = null

   @SerializedName("genesis_date")
    private val genesisDate: String? = null

   @SerializedName("contract_address")
    private val contractAddress: String? = null

   @SerializedName("ico_data")
    private val icoData: IcoData? = null

   @SerializedName("market_cap_rank")
    private val marketCapRank: Long = 0

   @SerializedName("coingecko_rank")
    private val coingeckoRank: Long = 0

   @SerializedName("coingecko_score")
    private val coingeckoScore = 0.0

   @SerializedName("developer_score")
    private val developerScore = 0.0

   @SerializedName("community_score")
    private val communityScore = 0.0

   @SerializedName("liquidity_score")
    private val liquidityScore = 0.0

   @SerializedName("public_interest_score")
    private val publicInterestScore = 0.0

   @SerializedName("market_data")
    private val marketData: MarketData? = null

   @SerializedName("community_data")
    private val communityData: CommunityData? = null

   @SerializedName("developer_data")
    private val developerData: DeveloperData? = null

   @SerializedName("public_interest_stats")
    private val publicInterestStats: PublicInterestStats? = null

   @SerializedName("status_updates")
    private val statusUpdates: List<Any>? = null

   @SerializedName("last_updated")
    private val lastUpdated: String? = null

   @SerializedName("tickers")
    private val tickers: List<Ticker>? = null
}