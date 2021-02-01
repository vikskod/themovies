package com.vikskod.themovies.domain.usecase

import com.vikskod.themovies.data.model.artist.Artist
import com.vikskod.themovies.domain.repository.ArtistRepository

class UpdateArtistsUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute():List<Artist>? = artistRepository.updateArtists()
}