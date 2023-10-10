package com.example.kotlin.examenmoviles

import com.google.gson.annotations.SerializedName

data class TheatreObject (
    @SerializedName("page") val page: Int,
    @SerializedName("results") val results: ArrayList<MovieBase>,
)