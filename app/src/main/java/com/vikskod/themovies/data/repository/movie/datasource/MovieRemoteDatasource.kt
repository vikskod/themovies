package com.vikskod.themovies.data.repository.movie.datasource

import com.vikskod.themovies.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDatasource {
   suspend fun getMovies(): Response<MovieList>
}