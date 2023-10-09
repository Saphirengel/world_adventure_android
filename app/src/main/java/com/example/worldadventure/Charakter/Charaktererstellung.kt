package com.example.worldadventure.Charakter

import android.widget.TextView
import com.example.worldadventure.databinding.CharakterErstellenBinding

class Charaktererstellung(

    val strenghtRange: IntRange,
    val dexteryRange: IntRange,
    val intelligenceRange: IntRange,
    val constituionRange: IntRange,
    val wisdomRange: IntRange,
    val charismaRange: IntRange,
    val luckRange: IntRange
) {

    var strenght:Int = 0
    var dextery :Int = 0
    var intelligence : Int= 0
    var consttuion :Int = 0
    var wisdom: Int = 0
    var charisma: Int = 0
    var luck: Int = 0



fun zufallsZahlen() {

    strenght = strenghtRange.random()
      dextery = dexteryRange.random()
      intelligence = intelligenceRange.random()
      consttuion = constituionRange.random()
      wisdom = wisdomRange.random()
      charisma = charismaRange.random()
      luck = luckRange.random()
 }





    }

