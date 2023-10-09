package com.example.worldadventure

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.worldadventure.Charakter.Charaktererstellung
import com.example.worldadventure.databinding.CharaktererstellenBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: CharaktererstellenBinding
    //hier wird der Grundheld deklariert
    var hero = Charaktererstellung(
        1..20,
        1..20,
        1..20,
        1..20,
        1..20,
        1..20,
        1..20,
    )

    //hier werten die Werte ausgelesen bzw wo sie herkommen
    var strenght = hero.strenght.toString()
    var dextery = hero.dextery.toString()
    var intelligence = hero.intelligence.toString()
    var constituion = hero.consttuion.toString()
    var wisdom = hero.wisdom.toString()
    var charisma = hero.charisma.toString()
    var luck = hero.luck.toString()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CharaktererstellenBinding.inflate(layoutInflater)
        val view = binding.root
        hero.zufallsZahlen()
        //hier werden die Werte an ein Text gebunden
        //leider nicht funktioniert es bildlich auszugeben
        //strenght = binding.wertStaerkeZahl.toString()
        //dextery = binding.wertGeschicklichkeitZahl.toString()
       // intelligence = binding.wertIntelligenzZahl.toString()
       // constituion = binding.wertKonstitutionZahl.toString()
        //wisdom = binding.wertWeisheitZahl.toString()
       // charisma = binding.wertCharismaZahl.toString()
       // luck = binding.wertGlueckZahl.toString()
        binding.textWerteZahl.
        //setContentView(R.layout.intro)
        //setContentView(R.layout.story)
        setContentView(R.layout.charaktererstellen)
    }
}