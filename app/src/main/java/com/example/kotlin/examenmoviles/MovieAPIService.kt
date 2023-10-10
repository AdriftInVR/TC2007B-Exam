package com.example.kotlin.examenmoviles

interface MovieAPIService {
    @GET("movies")
    suspend fun getPokemonList(
        @Query("limit") limit:Int
}