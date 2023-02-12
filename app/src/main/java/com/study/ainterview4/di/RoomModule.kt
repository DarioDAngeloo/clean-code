package com.study.ainterview4.di

import android.content.Context
import androidx.room.Room
import com.study.ainterview4.data.local.AnimeDatabase
import com.study.ainterview4.domain.util.Constants.ANIME_DATABASE
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    @Provides
    @Singleton
    fun provideAnimeDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(context, AnimeDatabase::class.java, ANIME_DATABASE)

    @Provides
    @Singleton
    fun provideAnimeDao(db: AnimeDatabase) = db.animeDao()


}