package com.example.worldadventure.Charakter

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.worldadventure.MainActivity
import com.example.worldadventure.databinding.CharaktererstellenBinding

class Charaktererstellung(

    var strenghtRange: IntRange,
    var dexteryRange: IntRange,
     var intelligenceRange: IntRange,
    var constituionRange: IntRange,
    var wisdomRange: IntRange,
    var charismaRange: IntRange,
    var luckRange: IntRange
)  {



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



