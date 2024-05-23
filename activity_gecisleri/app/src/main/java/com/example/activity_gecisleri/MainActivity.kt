package com.example.activity_gecisleri

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.activity_gecisleri.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)


    }

     fun degistir(view: View){
         var veri = binding.editText.text.toString()
         var intent = Intent(this,MainActivity2::class.java)
         intent.putExtra("anahtar",veri)

         startActivity(intent)

    }

}