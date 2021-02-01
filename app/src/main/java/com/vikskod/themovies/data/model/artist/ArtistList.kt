package com.vikskod.themovies.data.model.artist


import com.vikskod.themovies.data.model.artist.Artist
import com.google.gson.annotations.SerializedName

data class ArtistList(

    @SerializedName("results")
    val artists: List<Artist>

)