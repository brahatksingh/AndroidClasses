package com.brahatksingh.sharedpreferencesapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.edit

class MainActivity : AppCompatActivity() {
    val KEY_COUNT = "open_app_count"
    val KEY_DATA = "app_data_string"
    var appcounter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ps = getPreferences(Context.MODE_PRIVATE)
        appcounter = ps.getInt(KEY_COUNT,0)
        appcounter++

        ps.edit {
            putInt(KEY_COUNT,appcounter)
        }



        val tv_count = findViewById<TextView>(R.id.tv_count)

        tv_count.text = appcounter.toString()

        val btn_save = findViewById<Button>(R.id.button)
        val btn_reflect = findViewById<Button>(R.id.button2)

        val etb_data = findViewById<EditText>(R.id.etv_stringdata)
        val tv_data = findViewById<TextView>(R.id.textView)


        btn_save.setOnClickListener {
            if(etb_data.text.toString().isEmpty()) {
                // Nothing to do here
                return@setOnClickListener
            }
            ps.edit {
                putString(KEY_DATA,etb_data.text.toString())
            }
        }

        val tempstring = ps.getString(KEY_DATA,"NULL_STRING")
        tv_data.text = tempstring

        btn_reflect.setOnClickListener {
            val tempstring = ps.getString(KEY_DATA,"NULL_STRING")
            tv_data.text = tempstring
        }

    }
}