package com.vikskod.themovies.domain.repository

import com.vikskod.themovies.data.model.tvshow.TvShow

interface TvShowRepository {
    suspend fun getTvShows():List<TvShow>?
    suspend fun updateTvShows():List<TvShow>?
}