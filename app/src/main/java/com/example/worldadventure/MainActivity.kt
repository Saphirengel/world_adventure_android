package com.example.worldadventure

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.worldadventure.Charakter.Charaktererstellung

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.intro)
        //setContentView(R.layout.story)
        setContentView(R.layout.charakter_erstellen)
        var hero= Charaktererstellung(1..20,
            1..20,
            1..20,
            1..20,
            1..20,
            1..20,
            1..20,)
        var strenght = findViewById<TextView>(R.id.wert_staerke_zahl)
        var dextery = findViewById<TextView>(R.id.wert_geschicklichkeit_zahl)
        var intelligence = findViewById<TextView>(R.id.wert_intelligenz_zahl)
        var constituion = findViewById<TextView>(R.id.wert_konstitution_zahl)
        var wisdom = findViewById<TextView>(R.id.wert_weisheit_zahl)
        var charisma = findViewById<TextView>(R.id.wert_charisma_zahl)
        var luck= findViewById<TextView>(R.id.wert_glück_zahl)

        hero.zufallsZahlen()
        strenght.text=hero.strenght.toString()
        dextery.text=hero.dextery.toString()
        intelligence.text=hero.intelligence.toString()
        constituion.text=hero.consttuion.toString()
        wisdom.text=hero.wisdom.toString()
        charisma.text=hero.charisma.toString()
        luck.text=hero.luck.toString()


    }

}

