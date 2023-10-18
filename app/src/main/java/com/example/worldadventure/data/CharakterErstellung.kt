package com.example.worldadventure.data

import com.example.worldadventure.R

class CharakterErstellung {
    fun charWerte():List<CharakterWerte>{
        return listOf(
            CharakterWerte(1..20,1..20,1..20,1..20,1..20,1..20,1..20)
    )}
    fun oberRassenWahl(): List<OberrassenWahl>{
        return listOf(
            OberrassenWahl(R.string.goblinoiden,0,5,0,10,0,0,0,0,0,10,0,0,10,0),
            OberrassenWahl(R.string.elfen,0, 10,5,0,10,0,0,5,0,0,5,0,0,0),
            OberrassenWahl(R.string.zwerg,10,0,0,10,0,0,5,0,0,0,0,0,5,0),
            OberrassenWahl(R.string.gnome,0,0,10,0,10,5,10,10,0,0,10,0,0,0),
            OberrassenWahl(R.string.tiermenschen,10,10,0,0,0,0,0,0,0,0,0,0,10,0),
            OberrassenWahl(R.string.humanoide,0,0,0,0,0,0,5,0,0,0,0,0,0,0),
            OberrassenWahl(R.string.untot,0,10,0,15,10,0,0,0,0,0,0,0,15,5),
            OberrassenWahl(R.string.konstrukte,15,0,0,15,5,0,0,0,15,0,0,0,10,0),
            OberrassenWahl(R.string.fabelwesen,0,0,15,5,20,0,0,0,0,0,0,0,0,0,),
        )}
    fun unterRassenWahl(): List<UnterrassenWahl>{
        return listOf(
            UnterrassenWahl(R.string.goblins,0,10,10,,0,5,0,0,10,0,0,0,0,0,0),
            UnterrassenWahl(R.string.ork,10,5,0,10,0,0,0,0,0,15,0,0,15,0),
            UnterrassenWahl(R.string.trolle,15,0,0,15,0,0,0,0,0,15,0,0,20,0),
            UnterrassenWahl(R.string.blutelfen,),
            UnterrassenWahl(R.string.dunkelelfen),
            UnterrassenWahl(R.string.eisenelfen),
            UnterrassenWahl(R.string.hochelfen),
            UnterrassenWahl(R.string.meereselfen),
            UnterrassenWahl(R.string.mondelfen),
            UnterrassenWahl(R.string.nachtelfen),
            UnterrassenWahl(R.string.sonnenelfen),
            UnterrassenWahl(R.string.waldelfen),
            UnterrassenWahl(R.string.zwerge),
            UnterrassenWahl(R.string.gnome),
            UnterrassenWahl(R.string.drachkin),
            UnterrassenWahl(R.string.maenade),
            UnterrassenWahl(R.string.naga),
            UnterrassenWahl(R.string.tauren),
            UnterrassenWahl(R.string.zentauren),
            UnterrassenWahl(R.string.engel),
            UnterrassenWahl(R.string.halbling),
            UnterrassenWahl(R.string.mensch),
            UnterrassenWahl(R.string.tieflinge),
            UnterrassenWahl(R.string.skelett),
            UnterrassenWahl(R.string.zombie),
            UnterrassenWahl(R.string.golem),
            UnterrassenWahl(R.string.Dchjiinn)
        )
    }
}