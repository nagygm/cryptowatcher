package com.nagygm.cryptowatcher.mock

import okhttp3.Request
import okio.Timeout
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.IOException

open class MockCall<T>(val response: Response<T>) : Call<T> {
    
    override fun enqueue(callback: Callback<T>) {
    }

    override fun isExecuted(): Boolean {
        return false
    }

    override fun timeout(): Timeout {
        return Timeout()
    }

    override fun clone(): Call<T> {
        return MockCall(response)
    }

    override fun isCanceled(): Boolean {
        return false
    }

    override fun cancel() {
    }

    @Throws(IOException::class)
    override fun execute(): Response<T> {
        return response
    }

    override fun request(): Request? {
        return null
    }

}