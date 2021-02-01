package com.vikskod.themovies.presentation.di

import com.vikskod.themovies.presentation.di.artist.ArtistSubComponent
import com.vikskod.themovies.presentation.di.movie.MovieSubComponent
import com.vikskod.themovies.presentation.di.tvshow.TvShowSubComponent

interface Injector {
    fun createMovieSubComponent(): MovieSubComponent
    fun createTvShowSubComponent(): TvShowSubComponent
    fun createArtistSubComponent(): ArtistSubComponent
}