package com.vikskod.themovies.data.repository.movie.datasource

import com.vikskod.themovies.data.model.Movie


/**
 * Created by Vikash Parajuli on 31/01/2021.
 * vparajuli819@gmail.com
 */
interface MovieLocalDataSource {

    suspend fun getMovieFromDb(): List<Movie>

    suspend fun saveMoviesToDb(movieList: List<Movie>)

    suspend fun clearAll()
}