package com.nagygm.cryptowatcher.network

import com.nagygm.cryptowatcher.model.Ping
import retrofit2.Call
import retrofit2.http.GET

interface PingApi {
    /**
     * Check API server status
     * Check API server status
     * @return Call<Void>
    </Void> */
    @GET("ping")
    fun pingGet(): Call<Ping?>?
}