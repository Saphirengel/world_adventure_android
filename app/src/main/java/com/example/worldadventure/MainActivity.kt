package com.example.worldadventure

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.example.worldadventure.Charakter.Charaktererstellung
import com.example.worldadventure.databinding.CharaktererstellenBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: CharaktererstellenBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CharaktererstellenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var spinner:Spinner = findViewById(R.id.sp_oberrasse)
       var adapter = ArrayAdapter.createFromResource(this, R.array.oberrassen,android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter
    }
}