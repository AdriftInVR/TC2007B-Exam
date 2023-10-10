package com.example.kotlin.examenmoviles.data

import com.example.kotlin.examenmoviles.data.network.MovieAPIClient
import com.example.kotlin.examenmoviles.data.network.MovieAPIService
import com.example.kotlin.examenmoviles.data.network.NetworkModuleDI
import com.example.kotlin.examenmoviles.data.network.model.TheatreObject
import com.example.kotlin.examenmoviles.data.network.model.movies.Movie
import com.example.kotlin.examenmoviles.util.Constants

class MovieRepository() {
    private val apiMovie = MovieAPIClient()

    suspend fun getMovieList(api_key:String): TheatreObject? = apiMovie.getMovieList(Constants.key)

    suspend fun getMovieInfo(movie_id:Int, api_key:String): Movie? = apiMovie.getMovieInfo(movie_id, Constants.key)
}