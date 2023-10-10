package com.example.kotlin.examenmoviles.data.network

import com.example.kotlin.examenmoviles.data.network.model.TheatreObject
import com.example.kotlin.examenmoviles.data.network.model.movies.Movie

class MovieAPIClient {
    private lateinit var api: MovieAPIService

    suspend fun getMovieList(api_key: String): TheatreObject?{
        api = NetworkModuleDI()
        return try{
            api.getMovieList(api_key)
        }catch (e:java.lang.Exception){
            e.printStackTrace()
            null
        }
    }

    suspend fun getMovieInfo(movieID:Int, api_key:String): Movie? {
        api = NetworkModuleDI()
        return try{
            api.getMovieInfo(movieID, api_key)
        }catch (e:java.lang.Exception){
            e.printStackTrace()
            null
        }
    }
}