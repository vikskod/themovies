package com.vikskod.themovies.data.repository.movie.datasourceimpl

import com.vikskod.themovies.data.model.Movie
import com.vikskod.themovies.data.repository.movie.datasource.MovieCacheDataSource


/**
 * Created by Vikash Parajuli on 31/01/2021.
 * vparajuli819@gmail.com
 */
class MovieCacheDataSourceImpl() : MovieCacheDataSource {

    private var movieList = ArrayList<Movie>()

    override suspend fun getMovieFromCache(): List<Movie> {
        return movieList
    }

    override suspend fun saveMovieToCache(movieList: List<Movie>) {
        this.movieList.clear()
        this.movieList = ArrayList(movieList)
    }
}