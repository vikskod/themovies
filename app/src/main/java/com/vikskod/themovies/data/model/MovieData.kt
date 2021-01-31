package com.vikskod.themovies.data.model


import com.google.gson.annotations.SerializedName

data class MovieData(
    @SerializedName("results")
    val results: List<Movie>
)