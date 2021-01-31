package com.vikskod.themovies.data.repository.movie.datasourceimpl

import com.vikskod.themovies.data.api.ApiService
import com.vikskod.themovies.data.model.MovieData
import com.vikskod.themovies.data.repository.movie.datasource.MovieRemoteDataSource
import retrofit2.Response


/**
 * Created by Vikash Parajuli on 31/01/2021.
 * vparajuli819@gmail.com
 */

class MovieDataSourceImpl(
    private val apiService: ApiService,
    private val apiKey: String
) :
    MovieRemoteDataSource {
    override suspend fun getMovieFromRemote(): Response<MovieData> {
        return apiService.getPopularMovie(apiKey)
    }
}