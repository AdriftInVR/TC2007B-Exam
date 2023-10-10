package com.example.kotlin.examenmoviles.domain

import com.example.kotlin.examenmoviles.data.MovieRepository
import com.example.kotlin.examenmoviles.data.network.model.movies.Movie


class MovieInfoRequirement {
    private val repository = MovieRepository()

    suspend operator fun invoke(
        api_key:String,
        movie_id:Int
    ): Movie? = repository.getMovieInfo(movie_id, api_key)
}