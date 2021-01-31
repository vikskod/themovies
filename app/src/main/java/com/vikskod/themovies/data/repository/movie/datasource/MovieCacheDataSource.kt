package com.vikskod.themovies.data.repository.movie.datasource

import com.vikskod.themovies.data.model.Movie


/**
 * Created by Vikash Parajuli on 31/01/2021.
 * vparajuli819@gmail.com
 */
interface MovieCacheDataSource {

    suspend fun getMovieFromCache(): List<Movie>

    suspend fun saveMovieToCache(movieList: List<Movie>)
}