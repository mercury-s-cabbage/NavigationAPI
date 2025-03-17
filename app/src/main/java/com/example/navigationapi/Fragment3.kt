package com.example.navigationapi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController

class BlankFragment3 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view: View =inflater.inflate(R.layout.fragment_3, container, false)
        // ============= Button обработчик, способ записи 1
        var btn: Button =view.findViewById(R.id.button3_1)
        btn.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                if (p0 != null) {
                    p0.findNavController().navigate(R.id.action_blankFragment32_to_blankFragment)
                }
            }
        })
        // ============= Button3 обработчик, способ записи 2
        var btn3: Button =view.findViewById(R.id.button3_2)
        btn3.setOnClickListener(View.OnClickListener { view -> view.findNavController().navigate(R.id.action_blankFragment32_to_blankFragment2) })
        // ============= Button5 обработчик, способ записи 3
        view.findViewById<Button>(R.id.button3_3).setOnClickListener { findNavController().navigateUp() }
        return view
    }
// ...
}