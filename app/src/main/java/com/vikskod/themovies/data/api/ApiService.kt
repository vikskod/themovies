package com.vikskod.themovies.data.api

import com.vikskod.themovies.data.model.MovieData
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


/**
 * Created by Vikash Parajuli on 31/01/2021.
 * vparajuli819@gmail.com
 */
interface ApiService {

    @GET("movie/popular")
    suspend fun getPopularMovie(@Query("api_key") apiKey: String): Response<MovieData>
}