package com.nagygm.cryptowatcher.model

import com.google.gson.annotations.SerializedName

class IcoData {
   @SerializedName("ico_start_date")
    private val icoStartDate: String? = null

   @SerializedName("ico_end_date")
    private val icoEndDate: String? = null

   @SerializedName("short_desc")
    private val shortDesc: String? = null

   @SerializedName("description")
    private val description: String? = null

   @SerializedName("links")
    private val links: Links_? = null

   @SerializedName("softcap_currency")
    private val softcapCurrency: String? = null

   @SerializedName("hardcap_currency")
    private val hardcapCurrency: String? = null

   @SerializedName("total_raised_currency")
    private val totalRaisedCurrency: String? = null

   @SerializedName("softcap_amount")
    private val softcapAmount: Any? = null

   @SerializedName("hardcap_amount")
    private val hardcapAmount: Any? = null

   @SerializedName("total_raised")
    private val totalRaised: Any? = null

   @SerializedName("quote_pre_sale_currency")
    private val quotePreSaleCurrency: String? = null

   @SerializedName("base_pre_sale_amount")
    private val basePreSaleAmount: Any? = null

   @SerializedName("quote_pre_sale_amount")
    private val quotePreSaleAmount: Any? = null

   @SerializedName("quote_public_sale_currency")
    private val quotePublicSaleCurrency: String? = null

   @SerializedName("base_public_sale_amount")
    private val basePublicSaleAmount: String? = null

   @SerializedName("quote_public_sale_amount")
    private val quotePublicSaleAmount: String? = null

   @SerializedName("accepting_currencies")
    private val acceptingCurrencies: String? = null

   @SerializedName("country_origin")
    private val countryOrigin: String? = null

   @SerializedName("pre_sale_start_date")
    private val preSaleStartDate: Any? = null

   @SerializedName("pre_sale_end_date")
    private val preSaleEndDate: Any? = null

   @SerializedName("whitelist_url")
    private val whitelistUrl: String? = null

   @SerializedName("whitelist_start_date")
    private val whitelistStartDate: Any? = null

   @SerializedName("whitelist_end_date")
    private val whitelistEndDate: Any? = null

   @SerializedName("bounty_detail_url")
    private val bountyDetailUrl: String? = null

   @SerializedName("amount_for_sale")
    private val amountForSale: Any? = null

   @SerializedName("kyc_required")
    private val kycRequired = false

   @SerializedName("whitelist_available")
    private val whitelistAvailable: Any? = null

   @SerializedName("pre_sale_available")
    private val preSaleAvailable: Any? = null

   @SerializedName("pre_sale_ended")
    private val preSaleEnded = false
}