package com.vikskod.themovies.domain.repository

import com.vikskod.themovies.data.model.artist.Artist

interface ArtistRepository {
    suspend fun getArtists():List<Artist>?
    suspend fun updateArtists():List<Artist>?
}