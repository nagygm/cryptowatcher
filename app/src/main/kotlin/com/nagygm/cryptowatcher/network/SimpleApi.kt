package com.nagygm.cryptowatcher.network

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface SimpleApi {
    /**
     * Get the current price of any cryptocurrencies in any other supported currencies that you need.
     *
     * @param ids id of coins, comma-separated if querying more than 1 coin  *refers to &lt;b&gt;&#x60;coins/list&#x60;&lt;/b&gt; (required)
     * @param vsCurrencies vs_currency of coins, comma-separated if querying more than 1 vs_currency  *refers to &lt;b&gt;&#x60;simple/supported_vs_currencies&#x60;&lt;/b&gt; (required)
     * @param includeMarketCap &lt;b&gt;true/false&lt;/b&gt; to include market_cap, &lt;b&gt;default: false&lt;/b&gt; (optional)
     * @param include24hrVol &lt;b&gt;true/false&lt;/b&gt; to include 24hr_vol, &lt;b&gt;default: false&lt;/b&gt; (optional)
     * @param include24hrChange &lt;b&gt;true/false&lt;/b&gt; to include 24hr_change, &lt;b&gt;default: false&lt;/b&gt; (optional)
     * @param includeLastUpdatedAt &lt;b&gt;true/false&lt;/b&gt; to include last_updated_at of price, &lt;b&gt;default: false&lt;/b&gt; (optional)
     * @return Call&lt;Map&lt;String, Map&lt;String, Double&gt;&gt;&gt;
     */
    @GET("simple/price")
    fun simplePriceGet(
        @Query("ids") ids: String?,
        @Query("vs_currencies") vsCurrencies: String?,
        @Query("include_market_cap") includeMarketCap: String?,
        @Query("include_24hr_vol") include24hrVol: String?,
        @Query("include_24hr_change") include24hrChange: String?,
        @Query("include_last_updated_at") includeLastUpdatedAt: String?
    ): Call<Map<String?, Map<String?, Double?>?>?>?

    /**
     * Get list of supported_vs_currencies.
     *
     * @return Call&lt;List&lt;String&gt;&gt;
     */
    @GET("simple/supported_vs_currencies")
    fun simpleSupportedVsCurrenciesGet(): Call<List<String?>?>?
}