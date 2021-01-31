package com.vikskod.themovies.data.repository.movie.datasource

import com.vikskod.themovies.data.model.MovieData
import retrofit2.Response


/**
 * Created by Vikash Parajuli on 31/01/2021.
 * vparajuli819@gmail.com
 */
interface MovieRemoteDataSource {

    suspend fun getMovieFromRemote(): Response<MovieData>
}