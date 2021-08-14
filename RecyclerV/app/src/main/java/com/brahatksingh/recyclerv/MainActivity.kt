package com.brahatksingh.recyclerv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val newsdatalist = List<NewsResponse>(50){i-> NewsResponse("Title$i","Body${i}")}

        val adapter = NewsAdapter(this,newsdatalist)
        val rvrv = findViewById<RecyclerView>(R.id.mactivity_rv)

        rvrv.adapter = adapter
        rvrv.layoutManager = LinearLayoutManager(this)
        
    }
}