package com.study.ainterview4.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface AnimeDao {

    @Query("SELECT * FROM anime_table")
    fun getAllAnime() : List<AnimeEntity>

    @Insert
    fun insertAllAnime(vararg animeList: AnimeEntity)
}