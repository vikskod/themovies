package com.vikskod.themovies.presentation.tv

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.vikskod.themovies.domain.usecase.GetTvShowsUseCase
import com.vikskod.themovies.domain.usecase.UpdateTvShowsUseCase

class TvShowViewModelFactory(
    private val getTvShowsUseCase: GetTvShowsUseCase,
    private val updateTvShowsUseCase: UpdateTvShowsUseCase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return TvShowViewModel(
            getTvShowsUseCase,
            updateTvShowsUseCase
        ) as T
    }
}