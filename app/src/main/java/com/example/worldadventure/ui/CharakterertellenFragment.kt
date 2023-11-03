package com.example.worldadventure.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.Spinner
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.worldadventure.Charakter.Charaktererstellung
import com.example.worldadventure.R

import com.example.worldadventure.data.CharakterErstellung
import com.example.worldadventure.data.CharakterWerte
import com.example.worldadventure.data.OberrassenWahl
import com.example.worldadventure.data.UnterrassenWahl
import com.example.worldadventure.databinding.CharaktererstellenBinding


class CharakterertellenFragment(): Fragment() {

    private lateinit var binding: CharaktererstellenBinding
    private lateinit var oberrasseSpinner: Spinner
    private lateinit var unterrasseSpinner: Spinner
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = CharaktererstellenBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        oberrasseSpinner = view.findViewById(R.id.sp_oberrasse)
        unterrasseSpinner = view.findViewById(R.id.sp_unterrasse)
        val ausgewählteOberrassenWahl = CharakterErstellung().oberRassenWahl()[0]
        val ausgewählteUnterrassenWahl = CharakterErstellung().unterRassenWahl()[0]
        val textlayout = view.findViewById<LinearLayout>(R.id.ll_wert_zahl)
        val strength = textlayout.findViewById<TextView>(R.id.tv_staerke_zahl)
        val dextery = textlayout.findViewById<TextView>(R.id.tv_geschicklichkeit_zahl)
        val intelligence = textlayout.findViewById<TextView>(R.id.tv_intelligenz_zahl)
        val constitution = textlayout.findViewById<TextView>(R.id.tv_konstitution_zahl)
        val wisdom = textlayout.findViewById<TextView>(R.id.tv_weisheit_zahl)
        val charisma = textlayout.findViewById<TextView>(R.id.tv_charisma_zahl)
        val luck= textlayout.findViewById<TextView>(R.id.tv_glueck_zahl)




        val oberrasse = CharakterErstellung().oberRassenWahl()
        val unterrasse = CharakterErstellung().unterRassenWahl()

        val oberrassenAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, oberrasse.map { it.name })
        oberrassenAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        oberrasseSpinner.adapter = oberrassenAdapter

        val unterrassenAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, unterrasse.map { it.name })
        unterrassenAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        oberrasseSpinner.adapter = unterrassenAdapter


        oberrasseSpinner.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
             fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int){
                val ausgewählteOberrassenWahl = oberrasse[position]
            }

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

            }

            override fun onNothingSelected(parent: AdapterView<*>?){}
        }

        unterrasseSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
             fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int){
                val ausgewählteUnterrassenWahl = oberrasse[position]
            }

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

            }

            override fun onNothingSelected(parent: AdapterView<*>?){}
        }
        var hero2 = Charaktererstellung(1..20,1..20,1..20,1..2,1..20,1..20,1..20)
        hero2.zufallsZahlen()

        val hero = CharakterWerte(
            ausgewählteOberrassenWahl.strenghtModifier..ausgewählteOberrassenWahl.strenghtModifier + ausgewählteUnterrassenWahl.strenghtModifier +hero2.strenght,
            ausgewählteOberrassenWahl.dexteryModifier..ausgewählteOberrassenWahl.strenghtModifier +ausgewählteUnterrassenWahl.dexteryModifier + hero2.dextery,
            ausgewählteOberrassenWahl.intelligenceModifier..ausgewählteOberrassenWahl.intelligenceModifier +ausgewählteUnterrassenWahl.intelligenceModifier + hero2.intelligence,
            ausgewählteOberrassenWahl.constuionModifier..ausgewählteOberrassenWahl.constuionModifier +ausgewählteUnterrassenWahl.constuionModifier + hero2.constuion,
            ausgewählteOberrassenWahl.wisdomModifier..ausgewählteOberrassenWahl.wisdomModifier +ausgewählteUnterrassenWahl.wisdomModifier + hero2.wisdom,
            ausgewählteOberrassenWahl.charismaModifier..ausgewählteOberrassenWahl.charismaModifier +ausgewählteUnterrassenWahl.charismaModifier + hero2.charisma,
            ausgewählteOberrassenWahl.luckModifier..ausgewählteOberrassenWahl.luckModifier +ausgewählteUnterrassenWahl.luckModifier + hero2.luck
        )
        binding.tvStaerkeZahl.text = hero.toString()
        binding.tvGeschicklichkeitZahl.text = hero.toString()
        binding.tvIntelligenzZahl.text = hero.toString()
        binding.tvKonstitutionZahl.text = hero.toString()
        binding.tvWeisheitZahl.text = hero.toString()
        binding.tvCharismaZahl.text = hero.toString()
        binding.tvGlueckZahl.text = hero.toString()

        val name = ausgewählteOberrassenWahl.name
        val position = oberrasse.indexOfFirst { it.name == name }

        if (position != -1) {

            binding.spOberrasse.setSelection(position)
        }
        val name2 = ausgewählteOberrassenWahl.name
        val position2 = unterrasse.indexOfFirst { it.name == name2 }

        if (position2 != -1) {

            binding.spUnterrasse.setSelection(position)
        }
    }
}