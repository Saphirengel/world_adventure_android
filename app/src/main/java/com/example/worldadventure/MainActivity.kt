package com.example.worldadventure

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.worldadventure.Charakter.Charaktererstellung
import com.example.worldadventure.databinding.CharaktererstellenBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: CharaktererstellenBinding
    var hero= Charaktererstellung(1..20,
        1..20,
        1..20,
        1..20,
        1..20,
        1..20,
        1..20,)
    var strenght = hero.strenght.toString()
    var dextery  = hero.dextery.toString()
    var intelligence = hero.intelligence.toString()
    var constituion = hero.consttuion.toString()
    var wisdom = hero.wisdom.toString()
    var charisma = hero.charisma.toString()
    var luck = hero.luck.toString()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CharaktererstellenBinding.inflate(layoutInflater)
        val view = binding.root
        //setContentView(R.layout.intro)
        //setContentView(R.layout.story)
        setContentView(R.layout.charaktererstellen)



        hero.zufallsZahlen()



    }

}
