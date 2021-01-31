package com.vikskod.themovies.data.db

import androidx.room.*
import com.vikskod.themovies.data.model.Movie


/**
 * Created by Vikash Parajuli on 31/01/2021.
 * vparajuli819@gmail.com
 */

@Dao
interface MovieDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveMovies(movieList: List<Movie>)

    @Query("DELETE FROM table_movie")
    suspend fun deleteAllMovies()

    @Query("SELECT * FROM table_movie")
    suspend fun getAllMovies(): List<Movie>
}