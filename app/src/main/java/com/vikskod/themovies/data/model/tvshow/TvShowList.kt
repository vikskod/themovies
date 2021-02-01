package com.vikskod.themovies.data.model.tvshow


import com.vikskod.themovies.data.model.tvshow.TvShow
import com.google.gson.annotations.SerializedName

data class TvShowList(

    @SerializedName("results")
    val tvShows: List<TvShow>
)