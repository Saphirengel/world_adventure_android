package com.example.worldadventure.ui

import android.R
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.SpinnerAdapter
import androidx.fragment.app.Fragment
import com.example.worldadventure.data.CharakterErstellung
import com.example.worldadventure.data.model.Rassenclans
import com.example.worldadventure.databinding.CharaktererstellenBinding


class CharakterertellenFragment() : Fragment() {

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
        val clan = CharakterErstellung().getClans()
        val volk = CharakterErstellung().getVolk()
        var spinner = binding.spOberrasse
        var item  = CharakterErstellung().getClans()
        val adapter = ArrayAdapter<String>(requireContext(), R.layout.simple_spinner_item, item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter
        val staerke =
            charakter.strenghtRange.random() + oberrasse[position].strenghtModifier!! + unterrasse[position].strenghtModifier!!
        val geschicklichkeit =
            charakter.dexteryRange.random() + oberrasse[position].dexteryModifier!! + unterrasse[position].dexteryModifier!!
        val intelligenz =
            charakter.intelligenceRange.random() + oberrasse[position].intelligenceModifier!! + unterrasse[position].intelligenceModifier!!
        val konstitution =
            charakter.constituionRange.random() + oberrasse[position].constuionModifier!! + unterrasse[position].constuionModifier!!
        val weisheit =
            charakter.wisdomRange.random() + oberrasse[position].wisdomModifier!! + unterrasse[position].wisdomModifier!!
        val charisma =
            charakter.charismaRange.random() + oberrasse[position].charismaModifier!! + unterrasse[position].charismaModifier!!
        val glueck =
            charakter.luckRange.random() + oberrasse[position].luckModifier!! + unterrasse[position].luckModifier!!


        binding.tvStaerkeZahl.text = staerke.toString()
        binding.tvGeschicklichkeitZahl.text = geschicklichkeit.toString()
        binding.tvIntelligenzZahl.text = intelligenz.toString()
        binding.tvKonstitutionZahl.text = konstitution.toString()
        binding.tvWeisheitZahl.text = weisheit.toString()
        binding.tvCharismaZahl.text = charisma.toString()
        binding.tvGlueckZahl.text = glueck.toString()
        binding.spOberrasse.dropDownHorizontalOffset = clan.size - 1
        binding.spUnterrasse.dropDownHorizontalOffset = volk.size - 1
    }

    private fun <T> ArrayAdapter(requireContext: Context, simpleSpinnerItem: Int, item: List<Rassenclans>): SpinnerAdapter? {
        var setDropDownViewResource = SpinnerFragment()
        val adapter = context?.let { ArrayAdapter(it, simpleSpinnerItem, item) }
        adapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item)
        return adapter
    }

}
