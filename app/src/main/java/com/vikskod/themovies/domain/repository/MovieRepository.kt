package com.vikskod.themovies.domain.repository

import com.vikskod.themovies.data.model.movie.Movie

interface MovieRepository {

    suspend fun getMovies():List<Movie>?
    suspend fun updateMovies():List<Movie>?

}