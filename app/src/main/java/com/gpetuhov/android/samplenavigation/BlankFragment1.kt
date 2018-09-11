package com.gpetuhov.android.samplenavigation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_blank_fragment1.*

// In this sample project we will navigate from BlankFragment1 to BlankFragment2 and back

class BlankFragment1 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank_fragment1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Here we navigate from one fragment to another.
        // Note that we pass id of the action.
        button.setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment1_to_blankFragment2)
        }
    }
}
