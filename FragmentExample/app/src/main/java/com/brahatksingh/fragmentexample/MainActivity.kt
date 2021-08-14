package com.brahatksingh.fragmentexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val nc = (NavHostFragment) fragmentContainerView2.findNavController()

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView2) as NavHostFragment
        val nc = navHostFragment.navController

        button.setOnClickListener {
            nc.navigate(R.id.fragmentHome)
        }

        button2.setOnClickListener {
            nc.navigate(R.id.fragmentChat)
        }
    }
}