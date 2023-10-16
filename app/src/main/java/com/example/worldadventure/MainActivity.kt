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

        val spinner:Spinner = findViewById(R.id.sp_oberrasse)
        var spinner2: Spinner = findViewById(R.id.sp_unterrasse)
        val adapter1 = ArrayAdapter.createFromResource(this,R.array.oberrassen, android.R.layout.simple_spinner_item)
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter1
try{
        spinner.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?,view: View?, position: Int, id: Long) {
                val selectedItem = parent?.getItemAtPosition(position).toString()
                val adapter2: ArrayAdapter<CharSequence> = when(selectedItem){
                    "Goblinoiden" -> ArrayAdapter.createFromResource(this@MainActivity, R.array.Goblinoiden,android.R.layout.simple_spinner_item)
                    "Elfen" -> ArrayAdapter.createFromResource(this@MainActivity, R.array.Elfen,android.R.layout.simple_spinner_item)
                    "Zwerge" -> ArrayAdapter.createFromResource(this@MainActivity, R.array.Zwerge,android.R.layout.simple_spinner_item)
                    "Gnome" -> ArrayAdapter.createFromResource(this@MainActivity, R.array.Gnome,android.R.layout.simple_spinner_item)
                    "Tiermenschen" -> ArrayAdapter.createFromResource(this@MainActivity, R.array.Tiermenschen,android.R.layout.simple_spinner_item)
                    "Humanoide" -> ArrayAdapter.createFromResource(this@MainActivity, R.array.Humanoide,android.R.layout.simple_spinner_item)
                    "Untote" -> ArrayAdapter.createFromResource(this@MainActivity, R.array.Untote,android.R.layout.simple_spinner_item)
                    "Konstrukte" -> ArrayAdapter.createFromResource(this@MainActivity, R.array.Konstrukte,android.R.layout.simple_spinner_item)
                    "Fabelwesen" -> ArrayAdapter.createFromResource(this@MainActivity, R.array.Fabelwesen,android.R.layout.simple_spinner_item)
                    else -> {ArrayAdapter(this@MainActivity,android.R.layout.simple_spinner_item)}
                }
                adapter2.setDropDownViewResource(android.R.layout.simple_spinner_item)
                spinner2.adapter = adapter2
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }
    }catch (e: Exception){Log.e("TAG", "Warum")}
    }
}