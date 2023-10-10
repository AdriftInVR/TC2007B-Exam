package com.example.kotlin.examenmoviles.data.network.model

import com.google.gson.annotations.SerializedName

data class TheatreObject (
    @SerializedName("results") val results: ArrayList<MovieBase>,
)