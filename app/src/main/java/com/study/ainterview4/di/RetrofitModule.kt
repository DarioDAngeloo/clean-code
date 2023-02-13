package com.study.ainterview4.di

import com.study.ainterview4.data.remote.AnimeApi
import com.study.ainterview4.domain.util.Constants.ANIME_BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RetrofitModule {


    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .build()
    }

    @Provides
    @Singleton
    fun provideMoshiConverterFactory(): MoshiConverterFactory {
        return MoshiConverterFactory.create()
    }

    @Provides
    @Singleton
    fun provideAnimeApi(
        client: OkHttpClient,
        converterFactory: MoshiConverterFactory,
    ): AnimeApi {
        return Retrofit.Builder()
            .baseUrl(ANIME_BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create()

    }

}