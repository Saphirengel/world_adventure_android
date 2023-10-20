package com.example.worldadventure.data

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import com.example.worldadventure.R
import com.example.worldadventure.databinding.CharaktererstellenBinding

class CharakterErstellung(): AppCompatActivity() {
    private lateinit var binding: CharaktererstellenBinding
    private lateinit var oberrasseSpinner: Spinner
    private lateinit var unterrasseSpinner: Spinner



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =CharaktererstellenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ausgewählteOberrassenWahl = oberRassenWahl()[0]
        val ausgewählteUnterrassenWahl = unterRassenWahl()[0]

        oberrasseSpinner = findViewById(R.id.sp_oberrasse)
        unterrasseSpinner = findViewById(R.id.sp_unterrasse)
        val oberrasse = oberRassenWahl()
        val unterrasse = unterRassenWahl()

        val oberrassenAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, oberrasse.map{it.name})
        oberrassenAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        oberrasseSpinner.adapter = oberrassenAdapter

        val unterrassenAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, oberrasse.map{it.name})
        unterrassenAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        oberrasseSpinner.adapter = unterrassenAdapter


        oberrasseSpinner.onItemSelectedListener = object : AdapterView.onItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int){
                val ausgewählteOberrassenWahl = oberrasse[position]
            }

            fun onNothingSelected(parent:AdapterView<*>?){}
        }

        unterrasseSpinner.onItemSelectedListener = object : AdapterView.onItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int){
                val ausgewählteUnterrassenWahl = oberrasse[position]
            }

            fun onNothingSelected(parent:AdapterView<*>?){}
        }

        val hero = CharakterWerte(
            ausgewählteOberrassenWahl.strenghtModifier..ausgewählteOberrassenWahl.strenghtModifier + ausgewählteUnterrassenWahl.strenghtModifier,
            ausgewählteOberrassenWahl.dexteryModifier..ausgewählteOberrassenWahl.strenghtModifier +ausgewählteUnterrassenWahl.dexteryModifier,
            ausgewählteOberrassenWahl.intelligenceModifier..ausgewählteOberrassenWahl.intelligenceModifier +ausgewählteUnterrassenWahl.intelligenceModifier,
            ausgewählteOberrassenWahl.constuionModifier..ausgewählteOberrassenWahl.constuionModifier +ausgewählteUnterrassenWahl.constuionModifier,
            ausgewählteOberrassenWahl.wisdomModifier..ausgewählteOberrassenWahl.wisdomModifier +ausgewählteUnterrassenWahl.wisdomModifier,
            ausgewählteOberrassenWahl.charismaModifier..ausgewählteOberrassenWahl.charismaModifier +ausgewählteUnterrassenWahl.charismaModifier,
            ausgewählteOberrassenWahl.luckModifier..ausgewählteOberrassenWahl.luckModifier +ausgewählteUnterrassenWahl.luckModifier,
            )

        binding.tvStaerkeZahl.text =hero.strenghtRange.random().toString()
        binding.tvGeschicklichkeitZahl.text =hero.dexteryRange.random().toString()
        binding.tvIntelligenzZahl.text =hero.intelligenceRange.random().toString()
        binding.tvKonstitutionZahl.text =hero.constituionRange.random().toString()
        binding.tvWeisheitZahl.text =hero.wisdomRange.random().toString()
        binding.tvCharismaZahl.text =hero.charismaRange.random().toString()
        binding.tvGlueckZahl.text =hero.luckRange.random().toString()


        fun getAusgewählteRasse(): Pair<OberrassenWahl, UnterrassenWahl>{
            val ausgewählteOberrassenWahl = oberRassenWahl()[0]
            val ausgewählteUnterrassenWahl = unterRassenWahl()[0]
            return Pair(ausgewählteOberrassenWahl, ausgewählteUnterrassenWahl)
        }

    }
    fun oberRassenWahl(): List<OberrassenWahl>{
        return listOf(
            OberrassenWahl(R.string.goblinoiden,0,5,-8,8,0,-8,0),
            OberrassenWahl(R.string.elfen,-5, 10,5,-5,10,0,0),
            OberrassenWahl(R.string.zwerg,8,0,0,10,0,-5,5),
            OberrassenWahl(R.string.gnome,-8,0,8,-8,8,5,8),
            OberrassenWahl(R.string.tiermenschen,8,8,0,0,0,-8,0),
            OberrassenWahl(R.string.humanoide,0,0,0,0,0,0,5),
            OberrassenWahl(R.string.untot,0,8,0,8,8,-8,-5),
            OberrassenWahl(R.string.konstrukte,8,-8,0,8,5,-8,0,),
            OberrassenWahl(R.string.fabelwesen,0,0,8,5,8,0,0),
        )}
    fun unterRassenWahl(): List<UnterrassenWahl>{
        return listOf(
            UnterrassenWahl(R.string.goblins,-8,8,8,0,5,0,0),
            UnterrassenWahl(R.string.ork,8,5,-8,8,0,-8,0),
            UnterrassenWahl(R.string.trolle,8,0,-8,8,0,-8,0),
            UnterrassenWahl(R.string.blutelfen,-5,0,8,-5,0,5,0),
            UnterrassenWahl(R.string.dunkelelfen,8,8,8,0,0,0,0),
            UnterrassenWahl(R.string.eisenelfen,0,0,8,0,5,5,0),
            UnterrassenWahl(R.string.hochelfen,-8,0,8,-8,8,-5,0),
            UnterrassenWahl(R.string.meereselfen,0,8,5,8,8,8,-8),
            UnterrassenWahl(R.string.mondelfen,-8,-5,20,-8,20,-5,0),
            UnterrassenWahl(R.string.nachtelfen,5,5,5,-8,0,0,0),
            UnterrassenWahl(R.string.sonnenelfen,5,0,10,0,5,0,0),
            UnterrassenWahl(R.string.waldelfen,5,-8,5,-8,-8,0,0),
            UnterrassenWahl(R.string.zwerge,8,5,0,8,0,-8,0),
            UnterrassenWahl(R.string.gnome,-8,8,20,-5,0,0,8),
            UnterrassenWahl(R.string.drachkin,8,8,8,8,8,-8,0),
            UnterrassenWahl(R.string.maenade,0,8,0,0,0,0,0),
            UnterrassenWahl(R.string.naga,0,8,0,0,8,-8,0),
            UnterrassenWahl(R.string.tauren,8,0,0,8,0,0,0),
            UnterrassenWahl(R.string.zentauren,8,8,0,8,0,-8,0),
            UnterrassenWahl(R.string.engel,8,8,8,8,8,8,8),
            UnterrassenWahl(R.string.halbling,-8,8,5,-8,0,0,8),
            UnterrassenWahl(R.string.mensch,0,0,0,0,0,0,0),
            UnterrassenWahl(R.string.tieflinge,8,0,8,8,8,-8,-5),
            UnterrassenWahl(R.string.skelett,0,0,0,-8,0,-8,0),
            UnterrassenWahl(R.string.zombie,0,0,-8,8,0,-8,0),
            UnterrassenWahl(R.string.golem,0,0,0,8,0,-8,0),
            UnterrassenWahl(R.string.Dchjiinn,0,0,8,0,8,-8,0)
        )
    }



    }
