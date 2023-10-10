package com.example.kotlin.examenmoviles.domain

import com.example.kotlin.examenmoviles.data.MovieRepository
import com.example.kotlin.examenmoviles.data.network.model.TheatreObject


class MovieListRequirement {
    private val repository = MovieRepository()

    suspend operator fun invoke(
        api_key:String
    ): TheatreObject? = repository.getMovieList(api_key)
}