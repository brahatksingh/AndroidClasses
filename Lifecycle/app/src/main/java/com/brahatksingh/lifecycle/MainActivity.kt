package com.brahatksingh.lifecycle

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val btn = findViewById<Button>(R.id.button_1)

        button_1.setOnClickListener {
            val uriobj = Uri.parse("tel:8377048167")
            val intent = Intent(Intent.ACTION_DIAL,uriobj)
            startActivity(intent)
        }
    }

}