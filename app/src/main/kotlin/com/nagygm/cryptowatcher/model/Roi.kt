package com.nagygm.cryptowatcher.model

import com.google.gson.annotations.SerializedName

class Roi {
   @SerializedName("times")
    private val times = 0f

   @SerializedName("currency")
    private val currency: String? = null

   @SerializedName("percentage")
    private val percentage = 0f
}