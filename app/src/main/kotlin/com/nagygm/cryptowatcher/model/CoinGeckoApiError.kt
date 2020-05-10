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

/**
 * CoinGeckoApiError
 */
class CoinGeckoApiError {
    /**
     * Get code
     * @return code
     */
    @SerializedName("code")
    var code: Int? = null

    /**
     * Get message
     * @return message
     */
    @SerializedName("message")
    var message: String? = null
    fun code(code: Int?): CoinGeckoApiError {
        this.code = code
        return this
    }

    fun message(message: String?): CoinGeckoApiError {
        this.message = message
        return this
    }

    override fun equals(o: Any?): Boolean {
        if (this === o) {
            return true
        }
        if (o == null || javaClass != o.javaClass) {
            return false
        }
        val coinGeckoApiError = o as CoinGeckoApiError
        return code == coinGeckoApiError.code &&
                message == coinGeckoApiError.message
    }

    override fun hashCode(): Int {
        return Objects.hash(code, message)
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class CoinGeckoApiError {\n")
        sb.append("    code: ").append(toIndentedString(code)).append("\n")
        sb.append("    message: ").append(toIndentedString(message)).append("\n")
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