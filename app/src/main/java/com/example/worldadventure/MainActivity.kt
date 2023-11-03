package com.example.worldadventure

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner

import com.example.worldadventure.databinding.CharaktererstellenBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: CharaktererstellenBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CharaktererstellenBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}