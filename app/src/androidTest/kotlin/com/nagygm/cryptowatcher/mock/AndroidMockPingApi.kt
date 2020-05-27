package com.nagygm.cryptowatcher.mock

import com.nagygm.cryptowatcher.model.Ping
import com.nagygm.cryptowatcher.network.PingApi
import retrofit2.Call

class AndroidMockPingApi : PingApi{
    override fun pingGet(): Call<Ping?>? {
        TODO("Not yet implemented")
    }
}