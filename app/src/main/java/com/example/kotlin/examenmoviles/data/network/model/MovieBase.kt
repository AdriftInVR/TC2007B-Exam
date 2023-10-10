package com.example.kotlin.examenmoviles.data.network.model

import com.google.gson.annotations.SerializedName

data class MovieBase(
    @SerializedName("title") val title: String,
    @SerializedName("vote_average") val vote_average: Double,
    @SerializedName("overview") val overview: String,
    @SerializedName("id") val id: Int,
    @SerializedName("poster_path") val poster_path: String,
)
