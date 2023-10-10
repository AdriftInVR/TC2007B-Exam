package com.example.kotlin.examenmoviles

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlin.examenmoviles.databinding.ActivityMainBinding


class MainActivity:Activity() {
    private lateinit var binding: ActivityMainBinding

    private val adapter : MovieAdapter = MovieAdapter()
    private lateinit var data:ArrayList<MovieBase>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initializeBinding()
        setUpRecyclerView(testData())
    }

    private fun initializeBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun testData():ArrayList<MovieBase>{
        var result = ArrayList<MovieBase>()

        result.add(MovieBase("The Super Mario Bros. Movie",""))
        result.add(MovieBase("Super Mario Bros.",""))
        result.add(MovieBase("Super Mario Brothers: Great Mission to Rescue Princess Peach",""))

        return result
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