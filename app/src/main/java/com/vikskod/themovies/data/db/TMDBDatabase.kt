package com.vikskod.themovies.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.vikskod.themovies.data.model.artist.Artist
import com.vikskod.themovies.data.model.movie.Movie
import com.vikskod.themovies.data.model.tvshow.TvShow


@Database(entities = [Movie::class, TvShow::class, Artist::class],
version = 1,
exportSchema = false
)
abstract class TMDBDatabase : RoomDatabase(){
abstract fun movieDao(): MovieDao
abstract fun tvDao(): TvShowDao
abstract fun artistDao(): ArtistDao

}