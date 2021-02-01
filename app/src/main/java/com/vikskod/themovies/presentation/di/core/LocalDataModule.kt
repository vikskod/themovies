package com.vikskod.themovies.presentation.di.core

import com.vikskod.themovies.data.db.ArtistDao
import com.vikskod.themovies.data.db.MovieDao
import com.vikskod.themovies.data.db.TvShowDao
import com.vikskod.themovies.data.repository.artist.datasource.ArtistLocalDataSource
import com.vikskod.themovies.data.repository.artist.datasourceImpl.ArtistLocalDataSourceImpl
import com.vikskod.themovies.data.repository.movie.datasource.MovieLocalDataSource
import com.vikskod.themovies.data.repository.movie.datasourceImpl.MovieLocalDataSourceImpl
import com.vikskod.themovies.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.vikskod.themovies.data.repository.tvshow.datasourceImpl.TvShowLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao):MovieLocalDataSource{
        return MovieLocalDataSourceImpl(movieDao)
    }

    @Singleton
    @Provides
    fun provideTvShowLocalDataSource(tvShowDao: TvShowDao):TvShowLocalDataSource{
        return TvShowLocalDataSourceImpl(tvShowDao)
    }

    @Singleton
    @Provides
    fun provideArtistLocalDataSource(artistDao : ArtistDao):ArtistLocalDataSource{
        return ArtistLocalDataSourceImpl(artistDao)
    }


}