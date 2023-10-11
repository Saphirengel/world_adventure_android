package com.example.worldadventure

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.worldadventure.Charakter.Charaktererstellung
import com.example.worldadventure.databinding.CharaktererstellenBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: CharaktererstellenBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CharaktererstellenBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}