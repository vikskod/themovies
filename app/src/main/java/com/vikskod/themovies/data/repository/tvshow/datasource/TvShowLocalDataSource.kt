package com.vikskod.themovies.data.repository.tvshow.datasource

import com.vikskod.themovies.data.model.movie.Movie
import com.vikskod.themovies.data.model.tvshow.TvShow

interface TvShowLocalDataSource {
  suspend fun getTvShowsFromDB():List<TvShow>
  suspend fun saveTvShowsToDB(tvShows:List<TvShow>)
  suspend fun clearAll()
}