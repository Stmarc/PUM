package com.example.rekacja

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rekacja.databinding.ActivityMainBinding
import com.example.rekacja.databinding.ActivitySecondBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.NextButton.setOnClickListener(){
            val explicitIntent = Intent(applicationContext,SecondActivity::class.java)
            startActivity(explicitIntent)

        }


    }
}