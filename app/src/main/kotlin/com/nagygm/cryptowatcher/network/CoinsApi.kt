package com.nagygm.cryptowatcher.network

import com.nagygm.cryptowatcher.model.CoinFullData
import com.nagygm.cryptowatcher.model.CoinHistoryById
import com.nagygm.cryptowatcher.model.CoinList
import com.nagygm.cryptowatcher.model.MarketChart
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CoinsApi {
    /**
     * List all supported coins id, name and symbol (no pagination required)
     * Use this to obtain all the coins&#39; id in order to make API calls
     * @return Call<CoinList>
    </Void> */
    @GET("coins/list")
    fun coinsListGet(): Call<CoinList?>?

    /**
     * Get current data (name, price, market, ... including exchange tickers) for a coin
     * Get current data (name, price, market, ... including exchange tickers) for a coin.&lt;br&gt;&lt;br&gt; **IMPORTANT**:\n Ticker object is limited to 100 items, to get more tickers, use `/coins/{id}/tickers`\n Ticker `is_stale` is true when ticker that has not been updated/unchanged from the exchange for a while.\n Ticker `is_anomaly` is true if ticker&#39;s price is outliered by our system.\n You are responsible for managing how you want to display these information (e.g. footnote, different background, change opacity, hide)
     * @param id pass the coin id (can be obtained from /coins) eg. bitcoin
     * @param localization Include all localized languages in response (true/false) &lt;b&gt;[default: true]&lt;/b&gt;
     * @param tickers Include tickers data (true/false) &lt;b&gt;[default: true]&lt;/b&gt;
     * @param marketData Include market_data (true/false) &lt;b&gt;[default: true]&lt;/b&gt;
     * @param communityData Include community_data data (true/false) &lt;b&gt;[default: true]&lt;/b&gt;
     * @param developerData Include developer_data data (true/false) &lt;b&gt;[default: true]&lt;/b&gt;
     * @param sparkline Include sparkline 7 days data (eg. true, false) &lt;b&gt;[default: false]&lt;/b&gt;
     * @return Call<CoinFullData>
    </Void> */
    @GET("coins/{id}")
    fun coinsIdGet(
        @Path("id") id: String?,
        @Query("localization") localization: String?,
        @Query("tickers") tickers: Boolean?,
        @Query("market_data") marketData: Boolean?,
        @Query("community_data") communityData: Boolean?,
        @Query("developer_data") developerData: Boolean?,
        @Query("sparkline") sparkline: Boolean?
    ): Call<CoinFullData?>?

    /**
     * Get historical data (name, price, market, stats) at a given date for a coin
     * Get historical data (name, price, market, stats) at a given date for a coin
     * @param id pass the coin id (can be obtained from /coins) eg. bitcoin
     * @param date The date of data snapshot in dd-mm-yyyy eg. 30-12-2017
     * @param localization Set to false to exclude localized languages in response
     * @return Call<CoinHistoryById>
    </Void> */
    @GET("coins/{id}/history")
    fun coinsIdHistoryGet(
        @Path("id") id: String?,
        @Query("date") date: String?,
        @Query("localization") localization: String?
    ): Call<CoinHistoryById?>?

    /**
     * Get historical market data include price, market cap, and 24h volume (granularity auto)
     * Get historical market data include price, market cap, and 24h volume (granularity auto)\n &lt;b&gt;Minutely data will be used for duration within 1 day, Hourly data will be used for duration between 1 day and 90 days, Daily data will be used for duration above 90 days.&lt;/b&gt;
     * @param id pass the coin id (can be obtained from /coins) eg. bitcoin
     * @param vsCurrency The target currency of market data (usd, eur, jpy, etc.)
     * @param days Data up to number of days ago (eg. 1,14,30,max)
     * @return Call<MarketChart>
    </Void> */
    @GET("coins/{id}/market_chart")
    fun coinsIdMarketChartGet(
        @Path("id") id: String?,
        @Query("vs_currency") vsCurrency: String?,
        @Query("days") days: String?
    ): Call<MarketChart?>?
}