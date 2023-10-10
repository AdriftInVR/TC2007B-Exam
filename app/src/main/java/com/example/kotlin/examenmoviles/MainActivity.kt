package com.example.kotlin.examenmoviles

import android.app.Activity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlin.examenmoviles.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class MainActivity:Activity() {
    private lateinit var binding: ActivityMainBinding

    private val adapter : MovieAdapter = MovieAdapter()
    private lateinit var data:ArrayList<MovieBase>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initializeBinding()
        getMovieList()
    }

    private fun initializeBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun testData():ArrayList<MovieBase>{
        var result = ArrayList<MovieBase>()

        result.add(MovieBase("The Super Mario Bros. Movie",1))
        result.add(MovieBase("Super Mario Bros.",2))
        result.add(MovieBase("Super Mario Brothers: Great Mission to Rescue Princess Peach",3))

        return result
    }

    private fun getMovieList(){
        CoroutineScope(Dispatchers.IO).launch{
            val movieRepository = MovieRepository()
            val result:TheatreObject? = movieRepository.getMovieList(Constants.key)
            Log.d("Salida", result?.results.toString())
            CoroutineScope(Dispatchers.Main).launch {
                setUpRecyclerView(result?.results!!)
            }
        }
    }

    private fun setUpRecyclerView(dataForList:ArrayList<MovieBase>){
        binding.RVMovie.setHasFixedSize(true)
        val linearLayoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false)
        binding.RVMovie.layoutManager = linearLayoutManager
        adapter.MovieAdapter(dataForList)
        binding.RVMovie.adapter = adapter
    }


}