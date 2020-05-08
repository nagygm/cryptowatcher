package com.nagygm.cryptowatcher.model

import com.google.gson.annotations.SerializedName

class CoinGeckoApiError {
    @SerializedName("code")
    private val code = 0

    @SerializedName("error")
    private val message: String? = null
}