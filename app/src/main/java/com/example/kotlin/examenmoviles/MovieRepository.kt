package com.example.kotlin.examenmoviles

import com.example.kotlin.examenmoviles.movies.Movie

class MovieRepository() {
    private lateinit var api:MovieAPIService

    suspend fun getMovieList(api_key:String):TheatreObject?{
        //todo: Inicializar variable api
        return try{
            api.getMovieList(api_key)
        }catch (e:java.lang.Exception){
            e.printStackTrace()
            null
        }
    }

    suspend fun getMovieInfo(movie_id:Int, api_key:String): Movie?{
        //todo: Inicializar variable api
        return try{
            api.getMovieInfo(movie_id, api_key)
        }catch (e:java.lang.Exception){
            e.printStackTrace()
            null
        }
    }
}