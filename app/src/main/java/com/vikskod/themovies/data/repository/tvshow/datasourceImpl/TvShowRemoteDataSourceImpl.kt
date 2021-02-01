package com.vikskod.themovies.data.repository.tvshow.datasourceImpl

import com.vikskod.themovies.data.api.TMDBService
import com.vikskod.themovies.data.model.tvshow.TvShowList
import com.vikskod.themovies.data.repository.tvshow.datasource.TvShowRemoteDatasource
import retrofit2.Response

class TvShowRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): TvShowRemoteDatasource {
    override suspend fun getTvShows()
            : Response<TvShowList> = tmdbService.getPopularTvShows(apiKey)

}

