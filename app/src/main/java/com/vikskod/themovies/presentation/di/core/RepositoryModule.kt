package com.vikskod.themovies.presentation.di.core

import com.vikskod.themovies.data.repository.artist.ArtistRepositoryImpl
import com.vikskod.themovies.data.repository.artist.datasource.ArtistCacheDataSource
import com.vikskod.themovies.data.repository.artist.datasource.ArtistLocalDataSource
import com.vikskod.themovies.data.repository.artist.datasource.ArtistRemoteDatasource
import com.vikskod.themovies.data.repository.movie.MovieRepositoryImpl
import com.vikskod.themovies.data.repository.movie.datasource.MovieCacheDataSource
import com.vikskod.themovies.data.repository.movie.datasource.MovieLocalDataSource
import com.vikskod.themovies.data.repository.movie.datasource.MovieRemoteDatasource
import com.vikskod.themovies.data.repository.tvshow.TvShowRepositoryImpl
import com.vikskod.themovies.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.vikskod.themovies.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.vikskod.themovies.data.repository.tvshow.datasource.TvShowRemoteDatasource
import com.vikskod.themovies.domain.repository.ArtistRepository
import com.vikskod.themovies.domain.repository.MovieRepository
import com.vikskod.themovies.domain.repository.TvShowRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideMovieRepository(
        movieRemoteDatasource: MovieRemoteDatasource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ): MovieRepository {

        return MovieRepositoryImpl(
            movieRemoteDatasource,
            movieLocalDataSource,
            movieCacheDataSource
        )


    }

    @Provides
    @Singleton
    fun provideTvShowRepository(
        tvShowRemoteDatasource: TvShowRemoteDatasource,
        tvShowLocalDataSource: TvShowLocalDataSource,
        tvShowCacheDataSource: TvShowCacheDataSource
    ): TvShowRepository {

        return TvShowRepositoryImpl(
            tvShowRemoteDatasource,
            tvShowLocalDataSource,
            tvShowCacheDataSource
        )


    }

    @Provides
    @Singleton
    fun provideArtistRepository(
        artistRemoteDatasource: ArtistRemoteDatasource,
        artistLocalDataSource: ArtistLocalDataSource,
        artistCacheDataSource: ArtistCacheDataSource
    ): ArtistRepository {

        return ArtistRepositoryImpl(
            artistRemoteDatasource,
            artistLocalDataSource,
            artistCacheDataSource
        )


    }

}