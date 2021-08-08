package com.brahatksingh.uicomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv = findViewById<TextView>(R.id.mactivity_tv_1)
        val btn = findViewById<Button>(R.id.mactivity_btn)
        val etv = findViewById<EditText>(R.id.mactivity_etv)

        btn.setOnClickListener {
            Toast.makeText(this,"BUTTON WAS CLICKED",Toast.LENGTH_SHORT).show()
            if(etv.text != null) {
                val tobetext : String = etv.text.toString()
                etv.text.clear()
                tv.text = tobetext
            }
        }

    }
}