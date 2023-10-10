package com.example.kotlin.examenmoviles


import android.content.Context
import android.util.Log
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.Priority
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.example.kotlin.examenmoviles.databinding.ItemMovieBinding
import com.example.kotlin.examenmoviles.movies.Movie
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MovieViewHolder (private val binding: ItemMovieBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(context:Context, item: MovieBase) {
        val urlImage = "https://image.tmdb.org/t/p/original" + item.poster_path?.toString()
        val requestOptions =  RequestOptions()
            .centerCrop()
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .fitCenter()
            .priority(Priority.HIGH)

        Glide.with(context).load(urlImage)
            .apply(requestOptions)
            .into(binding.IVPhoto)
        binding.TVName.text = item.title
    }

}