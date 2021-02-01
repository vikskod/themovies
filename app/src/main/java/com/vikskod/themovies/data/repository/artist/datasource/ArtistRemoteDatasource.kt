package com.vikskod.themovies.data.repository.artist.datasource

import com.vikskod.themovies.data.model.artist.ArtistList
import com.vikskod.themovies.data.model.movie.MovieList
import retrofit2.Response

interface ArtistRemoteDatasource {
   suspend fun getArtists(): Response<ArtistList>
}