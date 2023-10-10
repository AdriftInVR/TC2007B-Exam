package com.example.kotlin.examenmoviles

import com.google.gson.annotations.SerializedName

data class TheatreObject (
    @SerializedName("count") val count: Int,
    @SerializedName("results") val results: ArrayList<MovieBase>,
)