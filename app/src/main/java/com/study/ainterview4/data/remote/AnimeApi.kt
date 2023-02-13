package com.study.ainterview4.data.remote

import retrofit2.Response
import retrofit2.http.GET

interface AnimeApi {

    @GET("/api/v2/pokemon/")
    suspend fun fetchAnimeFromApi(): Response<AnimeResponseWrapper<List<AnimeDto>>>

}