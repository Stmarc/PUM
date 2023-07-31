package com.example.rekacja
import android.content.Intent
import android.graphics.Color
import kotlin.random.Random

import java.time.Instant;
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rekacja.databinding.ActivitySecondBinding
import java.time.LocalTime
import kotlin.concurrent.thread


class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    private val Nick="Nick"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fun generateRandomNumber() {
            val random = Random.Default

            Thread.sleep(random.nextInt(3000, 7001).toLong())

        }

        fun ChangeColor()
        {


            binding.button.setBackgroundColor(Color.RED)
            var x = Instant.now()
            binding.button.setOnClickListener(){
                var y = Instant.now()
                val difrence = y.toEpochMilli() - x.toEpochMilli()



                val explicitIntent = Intent(applicationContext,ThridActivity::class.java)
                explicitIntent.putExtra("wynik",difrence.toString() + "ms")
                startActivity(explicitIntent)

            }



        }
        generateRandomNumber()
        ChangeColor()
















    }
}