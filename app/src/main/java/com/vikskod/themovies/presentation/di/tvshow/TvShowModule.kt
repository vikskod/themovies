package com.vikskod.themovies.presentation.di.tvshow

import com.vikskod.themovies.domain.usecase.GetTvShowsUseCase
import com.vikskod.themovies.domain.usecase.UpdateTvShowsUseCase
import com.vikskod.themovies.presentation.tv.TvShowViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {
    @TvShowScope
    @Provides
    fun provideTvShowViewModelFactory(
        getTvShowsUseCase: GetTvShowsUseCase,
        updateTvShowsUseCase: UpdateTvShowsUseCase
    ): TvShowViewModelFactory {
        return TvShowViewModelFactory(
            getTvShowsUseCase,
            updateTvShowsUseCase
        )
    }

}