package com.vikskod.themovies.presentation.di.movie

import com.vikskod.themovies.domain.usecase.GetMoviesUseCase
import com.vikskod.themovies.domain.usecase.UpdateMoviesUsecase
import com.vikskod.themovies.presentation.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {
    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUsecase: UpdateMoviesUsecase
    ): MovieViewModelFactory {
        return MovieViewModelFactory(
            getMoviesUseCase,
            updateMoviesUsecase
        )
    }

}