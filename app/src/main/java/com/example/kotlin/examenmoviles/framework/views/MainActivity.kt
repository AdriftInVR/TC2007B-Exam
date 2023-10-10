package com.example.kotlin.examenmoviles.framework.views

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlin.examenmoviles.framework.adapters.MovieAdapter
import com.example.kotlin.examenmoviles.databinding.ActivityMainBinding
import com.example.kotlin.examenmoviles.data.network.model.MovieBase
import com.example.kotlin.examenmoviles.framework.viewmodel.MainViewModel


class MainActivity: AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val adapter : MovieAdapter = MovieAdapter()
    private lateinit var data:ArrayList<MovieBase>

    private val viewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initializeBinding()
        initializeObservers()
        viewModel.getMovieList()
    }

    private fun initializeBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun initializeObservers(){
        viewModel.theatreObjectLiveData.observe(this){ theatreObject ->
            setUpRecyclerView(theatreObject.results)
        }
    }

    private fun setUpRecyclerView(dataForList:ArrayList<MovieBase>){
        binding.RVMovie.setHasFixedSize(true)
        val linearLayoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false)
        binding.RVMovie.layoutManager = linearLayoutManager
        adapter.MovieAdapter(this, dataForList)
        binding.RVMovie.adapter = adapter
    }

}