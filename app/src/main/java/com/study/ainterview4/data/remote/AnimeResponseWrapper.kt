package com.study.ainterview4.data.remote

data class AnimeResponseWrapper<out T>(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: T
)