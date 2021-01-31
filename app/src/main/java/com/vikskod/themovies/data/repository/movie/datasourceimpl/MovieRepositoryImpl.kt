package com.vikskod.themovies.data.repository.movie.datasourceimpl

import com.vikskod.themovies.data.model.Movie
import com.vikskod.themovies.data.repository.movie.datasource.MovieCacheDataSource
import com.vikskod.themovies.data.repository.movie.datasource.MovieLocalDataSource
import com.vikskod.themovies.data.repository.movie.datasource.MovieRemoteDataSource
import com.vikskod.themovies.domain.repository.MovieRepository
import java.lang.Exception


/**
 * Created by Vikash Parajuli on 31/01/2021.
 * vparajuli819@gmail.com
 */
class MovieRepositoryImpl(
    private val movieRemoteDataSource: MovieRemoteDataSource,
    private val movieLocalDataSource: MovieLocalDataSource,
    private val movieCacheDataSource: MovieCacheDataSource
) : MovieRepository {


    override suspend fun getMovies(): List<Movie>? {
        return getMoviesFromCache()
    }

    override suspend fun updateMovies(): List<Movie>? {
        val newMovieList = getMoviesFromApi()
        movieLocalDataSource.clearAll()
        movieLocalDataSource.saveMoviesToDb(newMovieList)
        movieCacheDataSource.saveMovieToCache(newMovieList)
        return newMovieList
    }

    suspend fun getMoviesFromApi(): List<Movie> {
        lateinit var movieList: List<Movie>

        try {
            val response = movieRemoteDataSource.getMovieFromRemote()
            val body = response.body()
            if (body != null) {
                movieList = body.results
            }
        } catch (ex: Exception) {
            ex.printStackTrace()
        }

        return movieList
    }

    suspend fun getMovieFromDb():List<Movie>{
        lateinit var movieList: List<Movie>

        try {
            movieList = movieLocalDataSource.getMovieFromDb()

        } catch (ex: Exception) {
            ex.printStackTrace()
        }

        if (movieList.isNotEmpty()){
            return movieList
        } else{
            movieList = getMoviesFromApi()
            movieLocalDataSource.saveMoviesToDb(movieList)
        }

        return movieList
    }

    suspend fun getMoviesFromCache():List<Movie>{
        lateinit var movieList: List<Movie>

        try {
            movieList = movieCacheDataSource.getMovieFromCache()

        } catch (ex: Exception) {
            ex.printStackTrace()
        }

        if (movieList.isNotEmpty()){
            return movieList
        } else{
            movieList = getMovieFromDb()
            movieCacheDataSource.saveMovieToCache(movieList)
        }

        return movieList
    }
}