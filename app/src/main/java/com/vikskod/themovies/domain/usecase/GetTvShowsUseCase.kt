package com.vikskod.themovies.domain.usecase

import com.vikskod.themovies.data.model.tvshow.TvShow
import com.vikskod.themovies.domain.repository.TvShowRepository

class GetTvShowsUseCase(private val tvShowRepository: TvShowRepository) {
    suspend fun execute():List<TvShow>?=tvShowRepository.getTvShows()
}