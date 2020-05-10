package com.nagygm.cryptowatcher.mock

import com.nagygm.cryptowatcher.network.CoinsApi
import com.nagygm.cryptowatcher.network.PingApi
import com.nagygm.cryptowatcher.network.SimpleApi
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import javax.inject.Singleton

@Module
class MockNetworkModule {
    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient {
        System.setProperty("javax.net.ssl.trustStore", "NONE")
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        return OkHttpClient.Builder().addInterceptor(interceptor).build()
    }

    @Provides
    @Singleton
    fun providePingApi(client: OkHttpClient):PingApi = MockPingApi()

    @Provides
    @Singleton
    fun provideSimpleApi(client: OkHttpClient):SimpleApi = MockSimpleApi()

    @Provides
    @Singleton
    fun provideCoinsApi(client: OkHttpClient):CoinsApi = MockCoinsApi()
}