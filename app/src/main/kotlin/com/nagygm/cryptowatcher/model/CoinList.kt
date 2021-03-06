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
 * CoinList
 */
@Generated(
    value = ["io.swagger.codegen.v3.generators.java.JavaClientCodegen"],
    date = "2020-05-09T13:04:15.904459+02:00[Europe/Budapest]"
)
class CoinList {
    /**
     * Get id
     * @return id
     */
    @SerializedName("id")
    var id: String? = null

    /**
     * Get symbol
     * @return symbol
     */
    @SerializedName("symbol")
    var symbol: String? = null

    /**
     * Get name
     * @return name
     */
    @SerializedName("name")
    var name: String? = null
    fun id(id: String?): CoinList {
        this.id = id
        return this
    }

    fun symbol(symbol: String?): CoinList {
        this.symbol = symbol
        return this
    }

    fun name(name: String?): CoinList {
        this.name = name
        return this
    }

    override fun equals(o: Any?): Boolean {
        if (this === o) {
            return true
        }
        if (o == null || javaClass != o.javaClass) {
            return false
        }
        val coinList = o as CoinList
        return id == coinList.id &&
                symbol == coinList.symbol &&
                name == coinList.name
    }

    override fun hashCode(): Int {
        return Objects.hash(id, symbol, name)
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class CoinList {\n")
        sb.append("    id: ").append(toIndentedString(id)).append("\n")
        sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n")
        sb.append("    name: ").append(toIndentedString(name)).append("\n")
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