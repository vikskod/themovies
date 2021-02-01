package com.vikskod.themovies.presentation.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.vikskod.themovies.domain.usecase.GetMoviesUseCase
import com.vikskod.themovies.domain.usecase.UpdateMoviesUsecase

class MovieViewModel(
    private val getMoviesUseCase: GetMoviesUseCase,
    private val updateMoviesUsecase: UpdateMoviesUsecase
): ViewModel() {

    fun getMovies() = liveData {
        val movieList = getMoviesUseCase.execute()
        emit(movieList)
    }

    fun updateMovies() = liveData {
        val movieList = updateMoviesUsecase.execute()
        emit(movieList)
    }

    }





