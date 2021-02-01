package com.vikskod.themovies.domain.usecase

import com.vikskod.themovies.data.model.movie.Movie
import com.vikskod.themovies.domain.repository.MovieRepository

class UpdateMoviesUsecase(private val movieRepository: MovieRepository) {
    suspend fun execute():List<Movie>? = movieRepository.updateMovies()
}