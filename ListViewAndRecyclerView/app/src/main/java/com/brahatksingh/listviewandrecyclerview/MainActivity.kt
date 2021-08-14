package com.brahatksingh.listviewandrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val countryList = List<String>(30) { i -> "Country ${i+1}"}

        val arradapter = ArrayAdapter(this,R.layout.item_country,R.id.itemc_country,countryList)

        val lvlv = findViewById<ListView>(R.id.mactivity_listview)

        lvlv.adapter = arradapter

        lvlv.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this,"CLICKED ${adapterView.getItemAtPosition(i)}",Toast.LENGTH_SHORT).show()
        }

    }
}