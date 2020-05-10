package com.nagygm.cryptowatcher.network

import com.nagygm.cryptowatcher.model.CoinFullData
import com.nagygm.cryptowatcher.model.CoinList
import com.nagygm.cryptowatcher.model.MarketChart
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CoinsApi {
    /**
     * Get current data (name, price, market, ... including exchange tickers) for a coin
     * Get current data (name, price, market, ... including exchange tickers) for a coin.&lt;br&gt;&lt;br&gt; **IMPORTANT**:  Ticker object is limited to 100 items, to get more tickers, use &#x60;/coins/{id}/tickers&#x60;  Ticker &#x60;is_stale&#x60; is true when ticker that has not been updated/unchanged from the exchange for a while.  Ticker &#x60;is_anomaly&#x60; is true if ticker&#x27;s price is outliered by our system.  You are responsible for managing how you want to display these information (e.g. footnote, different background, change opacity, hide)
     * @param id pass the coin id (can be obtained from /coins) eg. bitcoin (required)
     * @param localization Include all localized languages in response (true/false) &lt;b&gt;[default: true]&lt;/b&gt; (optional)
     * @param tickers Include tickers data (true/false) &lt;b&gt;[default: true]&lt;/b&gt; (optional)
     * @param marketData Include market_data (true/false) &lt;b&gt;[default: true]&lt;/b&gt; (optional)
     * @param communityData Include community_data data (true/false) &lt;b&gt;[default: true]&lt;/b&gt; (optional)
     * @param developerData Include developer_data data (true/false) &lt;b&gt;[default: true]&lt;/b&gt; (optional)
     * @param sparkline Include sparkline 7 days data (eg. true, false) &lt;b&gt;[default: false]&lt;/b&gt; (optional)
     * @return Call&lt;CoinFullData&gt;
     */
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
     * Get historical market data include price, market cap, and 24h volume (granularity auto)
     * Get historical market data include price, market cap, and 24h volume (granularity auto)  &lt;b&gt;Minutely data will be used for duration within 1 day, Hourly data will be used for duration between 1 day and 90 days, Daily data will be used for duration above 90 days.&lt;/b&gt;
     * @param id pass the coin id (can be obtained from /coins) eg. bitcoin (required)
     * @param vsCurrency The target currency of market data (usd, eur, jpy, etc.) (required)
     * @param days Data up to number of days ago (eg. 1,14,30,max) (required)
     * @return Call&lt;MarketChart&gt;
     */
    @GET("coins/{id}/market_chart")
    fun coinsIdMarketChartGet(
        @Path("id") id: String?,
        @Query("vs_currency") vsCurrency: String?,
        @Query("days") days: String?
    ): Call<MarketChart?>?

    /**
     * List all supported coins id, name and symbol (no pagination required)
     * Use this to obtain all the coins&#x27; id in order to make API calls
     * @return Call&lt;List&lt;CoinList&gt;&gt;
     */
    @GET("coins/list")
    fun coinsListGet(): Call<List<CoinList?>?>?
}