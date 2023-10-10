package com.example.kotlin.examenmoviles

import com.google.gson.annotations.SerializedName

data class MovieBase(
    @SerializedName("title") val title: String,
    @SerializedName("id") val id: Int,
    @SerializedName("poster_path") val poster_path: String,
)
