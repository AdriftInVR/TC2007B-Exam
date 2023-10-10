package com.example.kotlin.examenmoviles

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin.examenmoviles.databinding.ItemMovieBinding

class MovieAdapter: RecyclerView.Adapter<MovieViewHolder>() {
    lateinit var context: Context
    var data:ArrayList<MovieBase> = ArrayList()
    fun MovieAdapter(context: Context, basicData : ArrayList<MovieBase>){
        this.context = context
        this.data = basicData
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val item = data[position]
        holder.bind(context, item)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val binding = ItemMovieBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MovieViewHolder(binding)
    }
    override fun getItemCount(): Int {
        return data.size
    }
}