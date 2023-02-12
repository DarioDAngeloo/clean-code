package com.study.ainterview4.data.remote

import retrofit2.Response
import retrofit2.http.GET

interface AnimeApi {

    @GET
    suspend fun fetchAnimeFromApi(): Response<AnimeResponseWrapper<List<AnimeDto>>>

}