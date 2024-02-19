package com.example.toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.toast.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonToast.setOnClickListener {
            Toast.makeText(this,"Hi  I am a Toast ❤",Toast.LENGTH_SHORT).show()

            // Sortcut toa
            // Sortcut  ❤ window+>
        }

    }
}