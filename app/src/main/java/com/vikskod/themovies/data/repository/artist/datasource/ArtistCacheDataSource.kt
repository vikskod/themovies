package com.vikskod.themovies.data.repository.artist.datasource

import com.vikskod.themovies.data.model.artist.Artist
import com.vikskod.themovies.data.model.movie.Movie

interface ArtistCacheDataSource {
    suspend fun getArtistsFromCache():List<Artist>
    suspend fun saveArtistsToCache(artists:List<Artist>)

}