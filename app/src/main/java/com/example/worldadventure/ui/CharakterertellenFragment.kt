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
import com.example.worldadventure.data.model.CharakterWerte
import com.example.worldadventure.data.model.OberrassenWahl
import com.example.worldadventure.data.model.UnterrassenWahl
import com.example.worldadventure.databinding.CharaktererstellenBinding


class CharakterertellenFragment(): Fragment() {

    private lateinit var binding: CharaktererstellenBinding

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
        val position = 0
        val charakter = CharakterErstellung().getHeld()
        val oberrasse = CharakterErstellung().getOber()
        val unterrasse = CharakterErstellung().getUnter()

        val staerke = charakter.strenghtRange + oberrasse.get(0) + unterrasse.get(0)
       // val geschicklichkeit
        //val intelligenz
       // val konstitution
       // val weisheit
       // val charisma
       // val glueck

    binding.tvStaerkeZahl.text = staerke.toString()
    }
}
