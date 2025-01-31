package com.example.androidhw.task1.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidhw.databinding.FirstFragmentBinding
import com.example.androidhw.task1.base.FragmentNavigationConstants
import com.example.androidhw.task1.base.NavigationDestination
import com.example.androidhw.task1.base.NavigationFragment

class FirstFragment : NavigationFragment() {

    override val backstackTag: String
        get() = FragmentNavigationConstants.TO_FIRST_FRAGMENT

    private lateinit var binding: FirstFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FirstFragmentBinding.inflate(inflater, container, false)

        initListeners()

        return binding.root
    }

    override fun initListeners() = with(binding) {
        toSecondScreenButton.setOnClickListener {
            navigateTo(NavigationDestination.ToSecondFragment)
        }
    }

}