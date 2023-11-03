package com.example.worldadventure.data


import com.example.worldadventure.R

class CharakterErstellung() {

    fun oberRassenWahl(): List<OberrassenWahl> {
        return listOf(
            OberrassenWahl(R.string.goblinoiden, 0, 5, -8, 8, 0, -8, 0),
            OberrassenWahl(R.string.elfen, -5, 10, 5, -5, 10, 0, 0),
            OberrassenWahl(R.string.zwerg, 8, 0, 0, 10, 0, -5, 5),
            OberrassenWahl(R.string.gnome, -8, 0, 8, -8, 8, 5, 8),
            OberrassenWahl(R.string.tiermenschen, 8, 8, 0, 0, 0, -8, 0),
            OberrassenWahl(R.string.humanoide, 0, 0, 0, 0, 0, 0, 5),
            OberrassenWahl(R.string.untot, 0, 8, 0, 8, 8, -8, -5),
            OberrassenWahl(R.string.konstrukte, 8, -8, 0, 8, 5, -8, 0),
            OberrassenWahl(R.string.fabelwesen, 0, 0, 8, 5, 8, 0, 0),
        )
    }

    fun unterRassenWahl(): List<UnterrassenWahl> {
        return listOf(
            UnterrassenWahl(R.string.goblins, -8, 8, 8, 0, 5, 0, 0),
            UnterrassenWahl(R.string.ork, 8, 5, -8, 8, 0, -8, 0),
            UnterrassenWahl(R.string.trolle, 8, 0, -8, 8, 0, -8, 0),
            UnterrassenWahl(R.string.blutelfen, -5, 0, 8, -5, 0, 5, 0),
            UnterrassenWahl(R.string.dunkelelfen, 8, 8, 8, 0, 0, 0, 0),
            UnterrassenWahl(R.string.eisenelfen, 0, 0, 8, 0, 5, 5, 0),
            UnterrassenWahl(R.string.hochelfen, -8, 0, 8, -8, 8, -5, 0),
            UnterrassenWahl(R.string.meereselfen, 0, 8, 5, 8, 8, 8, -8),
            UnterrassenWahl(R.string.mondelfen, -8, -5, 20, -8, 20, -5, 0),
            UnterrassenWahl(R.string.nachtelfen, 5, 5, 5, -8, 0, 0, 0),
            UnterrassenWahl(R.string.sonnenelfen, 5, 0, 10, 0, 5, 0, 0),
            UnterrassenWahl(R.string.waldelfen, 5, -8, 5, -8, -8, 0, 0),
            UnterrassenWahl(R.string.zwerge, 8, 5, 0, 8, 0, -8, 0),
            UnterrassenWahl(R.string.gnome, -8, 8, 20, -5, 0, 0, 8),
            UnterrassenWahl(R.string.drachkin, 8, 8, 8, 8, 8, -8, 0),
            UnterrassenWahl(R.string.maenade, 0, 8, 0, 0, 0, 0, 0),
            UnterrassenWahl(R.string.naga, 0, 8, 0, 0, 8, -8, 0),
            UnterrassenWahl(R.string.tauren, 8, 0, 0, 8, 0, 0, 0),
            UnterrassenWahl(R.string.zentauren, 8, 8, 0, 8, 0, -8, 0),
            UnterrassenWahl(R.string.engel, 8, 8, 8, 8, 8, 8, 8),
            UnterrassenWahl(R.string.halbling, -8, 8, 5, -8, 0, 0, 8),
            UnterrassenWahl(R.string.mensch, 0, 0, 0, 0, 0, 0, 0),
            UnterrassenWahl(R.string.tieflinge, 8, 0, 8, 8, 8, -8, -5),
            UnterrassenWahl(R.string.skelett, 0, 0, 0, -8, 0, -8, 0),
            UnterrassenWahl(R.string.zombie, 0, 0, -8, 8, 0, -8, 0),
            UnterrassenWahl(R.string.golem, 0, 0, 0, 8, 0, -8, 0),
            UnterrassenWahl(R.string.Dchjiinn, 0, 0, 8, 0, 8, -8, 0)
        )
    }
}
