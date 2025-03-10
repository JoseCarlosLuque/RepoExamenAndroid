package com.example.examenjosecarlos

import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.examenjosecarlos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //lateinit var binding:
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Vista principal del proyecto:
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        initComponents()
        initRecycler()

        }

    private fun initRecycler() {

    }

    private fun initComponents() {

    }
}
