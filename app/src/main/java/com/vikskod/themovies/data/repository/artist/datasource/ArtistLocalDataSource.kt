package com.vikskod.themovies.data.repository.artist.datasource

import com.vikskod.themovies.data.model.artist.Artist
import com.vikskod.themovies.data.model.movie.Movie

interface ArtistLocalDataSource {
  suspend fun getArtistsFromDB():List<Artist>
  suspend fun saveArtistsToDB(artists:List<Artist>)
  suspend fun clearAll()
}