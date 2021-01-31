package com.vikskod.themovies.domain.usecase

import com.vikskod.themovies.data.model.Movie
import com.vikskod.themovies.domain.repository.MovieRepository


/**
 * Created by Vikash Parajuli on 31/01/2021.
 * vparajuli819@gmail.com
 */
class GetMovieUseCase(private val repository: MovieRepository) {

    suspend fun execute(): List<Movie>? = repository.getMovies()
}