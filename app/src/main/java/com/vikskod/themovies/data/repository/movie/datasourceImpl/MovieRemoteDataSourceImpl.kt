package com.vikskod.themovies.data.repository.movie.datasourceImpl

import com.vikskod.themovies.data.api.TMDBService
import com.vikskod.themovies.data.model.movie.MovieList
import com.vikskod.themovies.data.repository.movie.datasource.MovieRemoteDatasource
import retrofit2.Response

class MovieRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): MovieRemoteDatasource {
    override suspend fun getMovies(): Response<MovieList> = tmdbService.getPopularMovies(apiKey)

}

