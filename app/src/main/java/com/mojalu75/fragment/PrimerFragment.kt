package com.mojalu75.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mojalu75.fragment.databinding.FragmentPrimerBinding

class PrimerFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentPrimerBinding.inflate(inflater)
        binding.btnBoton.setOnClickListener{

        }
        return binding.root
    }

}