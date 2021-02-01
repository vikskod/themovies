package com.vikskod.themovies.data.repository.movie.datasource

import com.vikskod.themovies.data.model.movie.Movie

interface MovieLocalDataSource {
  suspend fun getMoviesFromDB():List<Movie>
  suspend fun saveMoviesToDB(movies:List<Movie>)
  suspend fun clearAll()
}