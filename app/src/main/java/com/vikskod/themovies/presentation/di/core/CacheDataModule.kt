package com.vikskod.themovies.presentation.di.core

import com.vikskod.themovies.data.repository.artist.datasource.ArtistCacheDataSource
import com.vikskod.themovies.data.repository.artist.datasourceImpl.ArtistCacheDataSourceImpl
import com.vikskod.themovies.data.repository.artist.datasourceImpl.ArtistLocalDataSourceImpl
import com.vikskod.themovies.data.repository.movie.datasource.MovieCacheDataSource
import com.vikskod.themovies.data.repository.movie.datasourceImpl.MovieCacheDataSourceImpl
import com.vikskod.themovies.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.vikskod.themovies.data.repository.tvshow.datasourceImpl.TvShowCacheDataSourceImpl
import com.vikskod.themovies.data.repository.tvshow.datasourceImpl.TvShowLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {
    @Singleton
    @Provides
    fun provideMovieCacheDataSource(): MovieCacheDataSource {
        return MovieCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideTvShowCacheDataSource(): TvShowCacheDataSource {
        return TvShowCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideArtistCacheDataSource(): ArtistCacheDataSource {
        return ArtistCacheDataSourceImpl()
    }


}