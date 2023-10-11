package com.example.worldadventure.Charakter

import android.widget.TextView
import com.example.worldadventure.databinding.CharaktererstellenBinding

class Charaktererstellung(

    val strenghtRange: IntRange,
    val dexteryRange: IntRange,
    val intelligenceRange: IntRange,
    val constituionRange: IntRange,
    val wisdomRange: IntRange,
    val charismaRange: IntRange,
    val luckRange: IntRange
) {
    private lateinit var binding: CharaktererstellenBinding
    var strenght:Int = 0
    var dextery :Int = 0
    var intelligence : Int= 0
    var constuion :Int = 0
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

    strenght = binding.tvStaerkeZahl.toInt()
    dextery = binding.tvGeschicklichkeitZahl.toInt()
    intelligence = binding.tvIntelligenzZahl.toInt()
    constuion = binding.tvKonstitutionZahl.toInt()
    wisdom = binding.tvWeisheitZahl.toInt()
    charisma = binding.tvCharismaZahl.toInt()
    luck = binding.tvGlueckZahl.toInt()
 }





    }

private fun TextView.toInt(): Int {
  return text.toString().toIntOrNull() ?: 0

}

