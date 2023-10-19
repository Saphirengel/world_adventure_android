package com.example.worldadventure.data

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.worldadventure.R
import com.example.worldadventure.databinding.CharaktererstellenBinding

class CharakterErstellung(): AppCompatActivity() {
    private lateinit var binding: CharaktererstellenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =CharaktererstellenBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
    fun oberRassenWahl(): List<OberrassenWahl>{
        return listOf(
            OberrassenWahl(R.string.goblinoiden,0,5,-10,10,0,-10,0),
            OberrassenWahl(R.string.elfen,-5, 10,5,-5,10,0,0),
            OberrassenWahl(R.string.zwerg,10,0,0,10,0,-5,5),
            OberrassenWahl(R.string.gnome,-10,0,10,-10,10,5,10),
            OberrassenWahl(R.string.tiermenschen,10,10,0,0,0,-10,0),
            OberrassenWahl(R.string.humanoide,0,0,0,0,0,0,5),
            OberrassenWahl(R.string.untot,0,10,0,15,10,-15,-5),
            OberrassenWahl(R.string.konstrukte,15,-15,0,15,5,-10,0,),
            OberrassenWahl(R.string.fabelwesen,0,0,15,5,20,0,0),
        )}
    fun unterRassenWahl(): List<UnterrassenWahl>{
        return listOf(
            UnterrassenWahl(R.string.goblins,-10,10,10,0,5,0,0),
            UnterrassenWahl(R.string.ork,10,5,-15,10,0,-15,0),
            UnterrassenWahl(R.string.trolle,15,0,-15,15,0,-20,0),
            UnterrassenWahl(R.string.blutelfen,-5,0,10,-5,0,5,0),
            UnterrassenWahl(R.string.dunkelelfen,10,10,10,0,0,0,0,0,0,0,0,0,0,0),
            UnterrassenWahl(R.string.eisenelfen,0,0,15,0,5,5,0,5,0,0,0,0,0,0),
            UnterrassenWahl(R.string.hochelfen,0,0,20,0,15,5,0,15,0,0,10,0,5,0),
            UnterrassenWahl(R.string.meereselfen,0,15,5,10,15,10,0,0,0,0,0,0,0,10),
            UnterrassenWahl(R.string.mondelfen,0,0,20,0,20,5,0,20,5,0,10,0,5,0),
            UnterrassenWahl(R.string.nachtelfen,5,5,5,0,0,0,0,0,0,0,10,0,0,0),
            UnterrassenWahl(R.string.sonnenelfen,5,0,10,0,5,0,0,0,0,0,0,0,0,0),
            UnterrassenWahl(R.string.waldelfen,5,20,5,15,0,0,0,0,0,0,0,0,20,0),
            UnterrassenWahl(R.string.zwerge,15,5,0,20,0,0,0,0,0,5,0,0,15,0),
            UnterrassenWahl(R.string.gnome,0,15,20,0,0,0,10,20,0,0,5,0,0,0),
            UnterrassenWahl(R.string.drachkin,15,15,15,15,15,0,0,0,0,0,0,0,20,0),
            UnterrassenWahl(R.string.maenade,0,10,0,0,0,0,0,0,0,0,0,0,0,0),
            UnterrassenWahl(R.string.naga,0,10,0,0,10,0,0,0,0,0,0,0,10,0),
            UnterrassenWahl(R.string.tauren,10,0,0,10,0,0,0,0,0,0,0,0,0,0),
            UnterrassenWahl(R.string.zentauren,20,10,0,15,0,0,0,0,0,0,0,0,10,0),
            UnterrassenWahl(R.string.engel,10,10,10,10,10,10,10,0,0,0,0,0,0,0,),
            UnterrassenWahl(R.string.halbling,0,15,5,0,0,0,10,10,0,0,10,0,0,0),
            UnterrassenWahl(R.string.mensch,0,0,0,0,0,0,0,0,0,0,0,0,0,0),
            UnterrassenWahl(R.string.tieflinge,10,0,10,10,10,0,0,0,0,0,0,0,20,5),
            UnterrassenWahl(R.string.skelett,0,0,0,0,0,0,0,0,0,0,10,0,20,0),
            UnterrassenWahl(R.string.zombie,0,0,0,15,0,0,0,0,0,20,0,0,20,0),
            UnterrassenWahl(R.string.golem,0,0,0,20,0,0,0,0,0,0,0,0,15,0),
            UnterrassenWahl(R.string.Dchjiinn,0,0,20,0,20,0,0,0,0,0,0,0,10,0)
        )
    }



    }
