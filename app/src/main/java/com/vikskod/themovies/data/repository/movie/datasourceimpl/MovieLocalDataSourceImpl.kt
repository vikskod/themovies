package com.vikskod.themovies.data.repository.movie.datasourceimpl

import com.vikskod.themovies.data.db.MovieDao
import com.vikskod.themovies.data.model.Movie
import com.vikskod.themovies.data.repository.movie.datasource.MovieLocalDataSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


/**
 * Created by Vikash Parajuli on 31/01/2021.
 * vparajuli819@gmail.com
 */
class MovieLocalDataSourceImpl(private val movieDao: MovieDao) : MovieLocalDataSource {

    override suspend fun getMovieFromDb(): List<Movie> {
        return movieDao.getAllMovies()
    }

    override suspend fun saveMoviesToDb(movieList: List<Movie>) {
        CoroutineScope(Dispatchers.IO).launch {
            movieDao.saveMovies(movieList)
        }
    }

    override suspend fun clearAll() {
        CoroutineScope(Dispatchers.IO).launch {
            movieDao.deleteAllMovies()
        }
    }
}