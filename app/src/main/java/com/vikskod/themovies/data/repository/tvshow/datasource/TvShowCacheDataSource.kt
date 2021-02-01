package com.vikskod.themovies.data.repository.tvshow.datasource

import com.vikskod.themovies.data.model.movie.Movie
import com.vikskod.themovies.data.model.tvshow.TvShow

interface TvShowCacheDataSource {
    suspend fun getTvShowsFromCache():List<TvShow>
    suspend fun saveTvShowsToCache(tvShows:List<TvShow>)

}