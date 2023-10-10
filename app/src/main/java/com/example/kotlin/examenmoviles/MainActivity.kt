package com.example.kotlin.examenmoviles

import android.app.Activity
import android.os.Bundle
import com.example.kotlin.examenmoviles.databinding.ActivityMainBinding


class MainActivity:Activity() {
    private lateinit var binding: ActivityMainBinding
    data class TheatreObject()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initializeBinding()
    }

    private fun initializeBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}