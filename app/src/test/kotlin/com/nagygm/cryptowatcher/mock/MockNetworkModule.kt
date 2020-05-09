package com.nagygm.cryptowatcher.mock

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
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        return OkHttpClient.Builder().addInterceptor(interceptor).build()
    }

    @Provides
    @Singleton
    fun providePingApi(client: OkHttpClient) = MockPingApi()

    @Provides
    @Singleton
    fun provideSimpleApi(client: OkHttpClient) = MockSimpleApi()

    @Provides
    @Singleton
    fun provideCoinsApi(client: OkHttpClient) = MockCoinsApi()
}