package com.nagygm.cryptowatcher.model

import com.google.gson.annotations.SerializedName

class MarketData {
   @SerializedName("current_price")
    private val currentPrice: Map<String, Double>? = null

   @SerializedName("roi")
    private val roi: Roi? = null

   @SerializedName("ath")
    private val ath: Map<String, Double>? = null

   @SerializedName("ath_change_percentage")
    private val athChangePercentage: Map<String, Double>? = null

   @SerializedName("ath_date")
    private val athDate: Map<String, String>? = null

   @SerializedName("market_cap")
    private val marketCap: Map<String, Double>? = null

   @SerializedName("market_cap_rank")
    private val marketCapRank: Long = 0

   @SerializedName("total_volume")
    private val totalVolume: Map<String, Double>? = null

   @SerializedName("high_24h")
    private val high24h: Map<String, Double>? = null

   @SerializedName("low_24h")
    private val low24h: Map<String, Double>? = null

   @SerializedName("price_change_24h")
    private val priceChange24h = 0.0

   @SerializedName("price_change_percentage_24h")
    private val priceChangePercentage24h = 0.0

   @SerializedName("price_change_percentage_7d")
    private val priceChangePercentage7d = 0.0

   @SerializedName("price_change_percentage_14d")
    private val priceChangePercentage14d = 0.0

   @SerializedName("price_change_percentage_30d")
    private val priceChangePercentage30d = 0.0

   @SerializedName("price_change_percentage_60d")
    private val priceChangePercentage60d = 0.0

   @SerializedName("price_change_percentage_200d")
    private val priceChangePercentage200d = 0.0

   @SerializedName("price_change_percentage_1y")
    private val priceChangePercentage1y = 0.0

   @SerializedName("market_cap_change_24h")
    private val marketCapChange24h = 0.0

   @SerializedName("market_cap_change_percentage_24h")
    private val marketCapChangePercentage24h = 0.0

   @SerializedName("price_change_24h_in_currency")
    private val priceChange24hInCurrency: Map<String, Double>? =
        null

   @SerializedName("price_change_percentage_1h_in_currency")
    private val priceChangePercentage1hInCurrency: Map<String, Double>? =
        null

   @SerializedName("price_change_percentage_24h_in_currency")
    private val priceChangePercentage24hInCurrency: Map<String, Double>? =
        null

   @SerializedName("price_change_percentage_7d_in_currency")
    private val priceChangePercentage7dInCurrency: Map<String, Double>? =
        null

   @SerializedName("price_change_percentage_14d_in_currency")
    private val priceChangePercentage14dInCurrency: Map<String, Double>? =
        null

   @SerializedName("price_change_percentage_30d_in_currency")
    private val priceChangePercentage30dInCurrency: Map<String, Double>? =
        null

   @SerializedName("price_change_percentage_60d_in_currency")
    private val priceChangePercentage60dInCurrency: Map<String, Double>? =
        null

   @SerializedName("price_change_percentage_200d_in_currency")
    private val priceChangePercentage200dInCurrency: Map<String, Double>? =
        null

   @SerializedName("price_change_percentage_1y_in_currency")
    private val priceChangePercentage1yInCurrency: Map<String, Double>? =
        null

   @SerializedName("market_cap_change_24h_in_currency")
    private val marketCapChange24hInCurrency: Map<String, Double>? =
        null

   @SerializedName("market_cap_change_percentage_24h_in_currency")
    private val marketCapChangePercentage24hInCurrency: Map<String, Double>? =
        null

   @SerializedName("total_supply")
    private val totalSupply: Long = 0

   @SerializedName("circulating_supply")
    private val circulatingSupply = 0.0

   @SerializedName("last_updated")
    private val lastUpdated: String? = null
}