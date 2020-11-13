package com.saif.viewbindingexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.saif.viewbindingexample.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main){

    private var _binding:FragmentMainBinding? = null

    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        _binding = FragmentMainBinding.bind(view)

        binding.tvFragment.text = "Hello from main fragment"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}