package com.vikskod.themovies.data.repository.artist.datasourceImpl

import com.vikskod.themovies.data.api.TMDBService
import com.vikskod.themovies.data.model.artist.ArtistList
import com.vikskod.themovies.data.repository.artist.datasource.ArtistRemoteDatasource
import retrofit2.Response

class ArtistRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): ArtistRemoteDatasource {
    override suspend fun getArtists()
            : Response<ArtistList> = tmdbService.getPopularArtists(apiKey)

}

