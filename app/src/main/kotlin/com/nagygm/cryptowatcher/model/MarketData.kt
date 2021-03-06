/*
 * CoinGecko CryptoWatcher
 * CoinGecko API for CryptoWatcher, defines the necessary endpoints for the app to work
 *
 * OpenAPI spec version: 0.0.2
 * Contact: nagygm17@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package com.nagygm.cryptowatcher.model

import com.google.gson.annotations.SerializedName
import java.util.*
import javax.annotation.Generated

/**
 * MarketData
 */
@Generated(
    value = ["io.swagger.codegen.v3.generators.java.JavaClientCodegen"],
    date = "2020-05-09T13:04:15.904459+02:00[Europe/Budapest]"
)
class MarketData {
    @SerializedName("current_price")
    private var currentPrice: MutableMap<String, Double>? = null

    @SerializedName("price_change_percentage_1h_in_currency")
    private var priceChangePercentage1hInCurrency: MutableMap<String, Double>? =
        null

    @SerializedName("price_change_percentage_24h_in_currency")
    private var priceChangePercentage24hInCurrency: MutableMap<String, Double>? =
        null

    @SerializedName("price_change_percentage_7d_in_currency")
    private var priceChangePercentage7dInCurrency: MutableMap<String, Double>? =
        null

    @SerializedName("price_change_percentage_14d_in_currency")
    private var priceChangePercentage14dInCurrency: MutableMap<String, Double>? =
        null

    fun currentPrice(currentPrice: MutableMap<String, Double>?): MarketData {
        this.currentPrice = currentPrice
        return this
    }

    fun putCurrentPriceItem(key: String, currentPriceItem: Double): MarketData {
        if (currentPrice == null) {
            currentPrice = HashMap()
        }
        currentPrice!![key] = currentPriceItem
        return this
    }

    /**
     * Get currentPrice
     * @return currentPrice
     */
    fun getCurrentPrice(): Map<String, Double>? {
        return currentPrice
    }

    fun setCurrentPrice(currentPrice: MutableMap<String, Double>?) {
        this.currentPrice = currentPrice
    }

    fun priceChangePercentage1hInCurrency(priceChangePercentage1hInCurrency: MutableMap<String, Double>?): MarketData {
        this.priceChangePercentage1hInCurrency = priceChangePercentage1hInCurrency
        return this
    }

    fun putPriceChangePercentage1hInCurrencyItem(
        key: String,
        priceChangePercentage1hInCurrencyItem: Double
    ): MarketData {
        if (priceChangePercentage1hInCurrency == null) {
            priceChangePercentage1hInCurrency =
                HashMap()
        }
        priceChangePercentage1hInCurrency!![key] = priceChangePercentage1hInCurrencyItem
        return this
    }

    /**
     * Get priceChangePercentage1hInCurrency
     * @return priceChangePercentage1hInCurrency
     */
    fun getPriceChangePercentage1hInCurrency(): Map<String, Double>? {
        return priceChangePercentage1hInCurrency
    }

    fun setPriceChangePercentage1hInCurrency(priceChangePercentage1hInCurrency: MutableMap<String, Double>?) {
        this.priceChangePercentage1hInCurrency = priceChangePercentage1hInCurrency
    }

    fun priceChangePercentage24hInCurrency(priceChangePercentage24hInCurrency: MutableMap<String, Double>?): MarketData {
        this.priceChangePercentage24hInCurrency = priceChangePercentage24hInCurrency
        return this
    }

    fun putPriceChangePercentage24hInCurrencyItem(
        key: String,
        priceChangePercentage24hInCurrencyItem: Double
    ): MarketData {
        if (priceChangePercentage24hInCurrency == null) {
            priceChangePercentage24hInCurrency =
                HashMap()
        }
        priceChangePercentage24hInCurrency!![key] = priceChangePercentage24hInCurrencyItem
        return this
    }

    /**
     * Get priceChangePercentage24hInCurrency
     * @return priceChangePercentage24hInCurrency
     */
    fun getPriceChangePercentage24hInCurrency(): Map<String, Double>? {
        return priceChangePercentage24hInCurrency
    }

    fun setPriceChangePercentage24hInCurrency(priceChangePercentage24hInCurrency: MutableMap<String, Double>?) {
        this.priceChangePercentage24hInCurrency = priceChangePercentage24hInCurrency
    }

    fun priceChangePercentage7dInCurrency(priceChangePercentage7dInCurrency: MutableMap<String, Double>?): MarketData {
        this.priceChangePercentage7dInCurrency = priceChangePercentage7dInCurrency
        return this
    }

    fun putPriceChangePercentage7dInCurrencyItem(
        key: String,
        priceChangePercentage7dInCurrencyItem: Double
    ): MarketData {
        if (priceChangePercentage7dInCurrency == null) {
            priceChangePercentage7dInCurrency =
                HashMap()
        }
        priceChangePercentage7dInCurrency!![key] = priceChangePercentage7dInCurrencyItem
        return this
    }

    /**
     * Get priceChangePercentage7dInCurrency
     * @return priceChangePercentage7dInCurrency
     */
    fun getPriceChangePercentage7dInCurrency(): Map<String, Double>? {
        return priceChangePercentage7dInCurrency
    }

    fun setPriceChangePercentage7dInCurrency(priceChangePercentage7dInCurrency: MutableMap<String, Double>?) {
        this.priceChangePercentage7dInCurrency = priceChangePercentage7dInCurrency
    }

    fun priceChangePercentage14dInCurrency(priceChangePercentage14dInCurrency: MutableMap<String, Double>?): MarketData {
        this.priceChangePercentage14dInCurrency = priceChangePercentage14dInCurrency
        return this
    }

    fun putPriceChangePercentage14dInCurrencyItem(
        key: String,
        priceChangePercentage14dInCurrencyItem: Double
    ): MarketData {
        if (priceChangePercentage14dInCurrency == null) {
            priceChangePercentage14dInCurrency =
                HashMap()
        }
        priceChangePercentage14dInCurrency!![key] = priceChangePercentage14dInCurrencyItem
        return this
    }

    /**
     * Get priceChangePercentage14dInCurrency
     * @return priceChangePercentage14dInCurrency
     */
    fun getPriceChangePercentage14dInCurrency(): Map<String, Double>? {
        return priceChangePercentage14dInCurrency
    }

    fun setPriceChangePercentage14dInCurrency(priceChangePercentage14dInCurrency: MutableMap<String, Double>?) {
        this.priceChangePercentage14dInCurrency = priceChangePercentage14dInCurrency
    }

    override fun equals(o: Any?): Boolean {
        if (this === o) {
            return true
        }
        if (o == null || javaClass != o.javaClass) {
            return false
        }
        val marketData = o as MarketData
        return currentPrice == marketData.currentPrice &&
                priceChangePercentage1hInCurrency == marketData.priceChangePercentage1hInCurrency &&
                priceChangePercentage24hInCurrency == marketData.priceChangePercentage24hInCurrency &&
                priceChangePercentage7dInCurrency == marketData.priceChangePercentage7dInCurrency &&
                priceChangePercentage14dInCurrency == marketData.priceChangePercentage14dInCurrency
    }

    override fun hashCode(): Int {
        return Objects.hash(
            currentPrice,
            priceChangePercentage1hInCurrency,
            priceChangePercentage24hInCurrency,
            priceChangePercentage7dInCurrency,
            priceChangePercentage14dInCurrency
        )
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class MarketData {\n")
        sb.append("    currentPrice: ").append(toIndentedString(currentPrice)).append("\n")
        sb.append("    priceChangePercentage1hInCurrency: ")
            .append(toIndentedString(priceChangePercentage1hInCurrency)).append("\n")
        sb.append("    priceChangePercentage24hInCurrency: ")
            .append(toIndentedString(priceChangePercentage24hInCurrency)).append("\n")
        sb.append("    priceChangePercentage7dInCurrency: ")
            .append(toIndentedString(priceChangePercentage7dInCurrency)).append("\n")
        sb.append("    priceChangePercentage14dInCurrency: ")
            .append(toIndentedString(priceChangePercentage14dInCurrency)).append("\n")
        sb.append("}")
        return sb.toString()
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private fun toIndentedString(o: Any?): String {
        return o?.toString()?.replace("\n", "\n    ") ?: "null"
    }
}