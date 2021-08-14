package com.brahatksingh.recyclerv

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class NewsAdapter(val context : Context,val datalist : List<NewsResponse>) : RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val tempview = LayoutInflater.from(context).inflate(R.layout.item_news,parent,false)
        return NewsViewHolder(tempview)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.title.text = datalist[position].title
        holder.body.text = datalist[position].body

        holder.itemView.setOnClickListener {
            Toast.makeText(context,"Clicked ${datalist[position].title}",Toast.LENGTH_SHORT).show()
        }

    }

    override fun getItemCount(): Int {
        return datalist.size
    }

    inner class NewsViewHolder(itemview : View) : RecyclerView.ViewHolder(itemview){
        val title = itemview.findViewById<TextView>(R.id.item_title)
        val body = itemview.findViewById<TextView>(R.id.item_body)
    }

}