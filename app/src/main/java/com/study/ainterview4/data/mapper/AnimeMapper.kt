package com.study.ainterview4.data.mapper

import com.study.ainterview4.data.local.AnimeEntity
import com.study.ainterview4.data.remote.AnimeDto
import com.study.ainterview4.domain.model.Anime

fun AnimeDto.toDomain() : Anime {
    return Anime(
        name = this.name,
        image = getAnimeImage(this.url)
    )
}


fun AnimeDto.toEntity() : AnimeEntity {
    return AnimeEntity(
        name = this.name,
        image = getAnimeImage(this.url)
    )
}


fun AnimeEntity.toDomain() : Anime {
    return Anime(
        name = this.name,
        image = this.image
    )
}


private fun getAnimeImage(url: String): String {
    val animeId = url.replace("/", "").removePrefix("https:pokeapi.coapiv2pokemon")
    return "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/$animeId.png"
}