package com.example.kotlin.examenmoviles

import com.example.kotlin.examenmoviles.movies.Movie
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieAPIService {

    //https://api.themoviedb.org/3/movie/popular?api_key=######
    @GET("movie/popular")
    suspend fun getMovieList(
        @Query("api_key") api_key:String
    ): TheatreObject

    //https://api.themoviedb.org/3/movie/{movie_id}?api_key=######
    @GET("movie")
    suspend fun getMovieInfo(
        @Path("movie_id") movie_id: Int,
        @Query("api_key") api_key:String
    ): Movie
}