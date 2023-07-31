package com.example.rekacja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rekacja.databinding.ActivitySecondBinding
import com.example.rekacja.databinding.ActivityThridBinding

class ThridActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThridBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThridBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.test.setText(intent.getStringExtra("wynik"))

    }
}