package com.example.worldadventure.Charakter

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.worldadventure.MainActivity
import com.example.worldadventure.databinding.CharaktererstellenBinding

class Charaktererstellung(

    val strenghtRange: IntRange,
    val dexteryRange: IntRange,
    val intelligenceRange: IntRange,
    val constituionRange: IntRange,
    val wisdomRange: IntRange,
    val charismaRange: IntRange,
    val luckRange: IntRange
) : AppCompatActivity() {
    private lateinit var binding: CharaktererstellenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
        binding = CharaktererstellenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        zufallsZahlen()
        binding.tvStaerkeZahl.text = strenght.toString()
}

    var strenght: Int = 0
    var dextery: Int = 0
    var intelligence: Int = 0
    var constuion: Int = 0
    var wisdom: Int = 0
    var charisma: Int = 0
    var luck: Int = 0


    fun zufallsZahlen() {

        strenght = strenghtRange.random()
        dextery = dexteryRange.random()
        intelligence = intelligenceRange.random()
        constuion = constituionRange.random()
        wisdom = wisdomRange.random()
        charisma = charismaRange.random()
        luck = luckRange.random()


    }




}



