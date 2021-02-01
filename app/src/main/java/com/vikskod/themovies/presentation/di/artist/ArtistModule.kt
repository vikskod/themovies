package com.vikskod.themovies.presentation.di.artist

import com.vikskod.themovies.domain.usecase.GetArtistsUseCase
import com.vikskod.themovies.domain.usecase.UpdateArtistsUseCase
import com.vikskod.themovies.presentation.artist.ArtistViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ArtistModule {
    @ArtistScope
    @Provides
    fun provideArtistViewModelFactory(
        getArtistsUseCase: GetArtistsUseCase,
        updateArtistsUseCase: UpdateArtistsUseCase
    ): ArtistViewModelFactory {
        return ArtistViewModelFactory(
            getArtistsUseCase,
            updateArtistsUseCase
        )
    }

}