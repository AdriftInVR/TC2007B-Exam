package com.example.kotlin.examenmoviles


import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin.examenmoviles.databinding.ItemMovieBinding

class MovieViewHolder (private val binding: ItemMovieBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: MovieBase) {
        binding.TVName.text = item.title
    }
}