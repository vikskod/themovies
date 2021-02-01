package com.vikskod.themovies.data.repository.movie.datasource

import com.vikskod.themovies.data.model.movie.Movie

interface MovieCacheDataSource {
    suspend fun getMoviesFromCache():List<Movie>
    suspend fun saveMoviesToCache(movies:List<Movie>)

}