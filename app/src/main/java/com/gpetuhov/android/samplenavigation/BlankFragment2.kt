package com.gpetuhov.android.samplenavigation

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_blank_fragment2.*

class BlankFragment2 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank_fragment2, container, false)
    }

    override fun onResume() {
        super.onResume()

        // Here we use arguments passed from BlankFragment1.
        // This class is generated if we set arguments in the navigation graph xml.
        blankFragment2Text.text = BlankFragment2Args.fromBundle(arguments).input.toString()
    }
}
