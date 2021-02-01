package com.vikskod.themovies.data.repository.tvshow.datasource

import com.vikskod.themovies.data.model.movie.MovieList
import com.vikskod.themovies.data.model.tvshow.TvShowList
import retrofit2.Response

interface TvShowRemoteDatasource {
   suspend fun getTvShows(): Response<TvShowList>
}