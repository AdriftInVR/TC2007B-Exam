package com.example.kotlin.examenmoviles.framework.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotlin.examenmoviles.data.network.model.TheatreObject
import com.example.kotlin.examenmoviles.domain.MovieInfoRequirement
import com.example.kotlin.examenmoviles.domain.MovieListRequirement
import com.example.kotlin.examenmoviles.util.Constants
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {
    val theatreObjectLiveData = MutableLiveData<TheatreObject>()
    private val movieListRequirement = MovieListRequirement()

    fun getMovieList() {
        viewModelScope.launch(Dispatchers.IO){
            val result: TheatreObject? = movieListRequirement(Constants.key)
            Log.d("Salida", result?.results.toString())
            CoroutineScope(Dispatchers.Main).launch {
                theatreObjectLiveData.postValue(result!!)
            }
        }
    }
}