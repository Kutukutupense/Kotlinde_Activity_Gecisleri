package com.example.activity_gecisleri

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.activity_gecisleri.databinding.ActivityMain2Binding
import com.example.activity_gecisleri.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
       var gelenVeri = intent.getStringExtra("anahtar")
        binding.textView2.text = gelenVeri

    }
}