package com.example.androidhw.task1.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidhw.databinding.SecondFragmentBinding
import com.example.androidhw.task1.base.FragmentNavigationConstants
import com.example.androidhw.task1.base.NavigationDestination
import com.example.androidhw.task1.base.NavigationFragment

class SecondFragment : NavigationFragment() {

    override val backstackTag: String
        get() = FragmentNavigationConstants.TO_SECOND_FRAGMENT

    private lateinit var binding: SecondFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = SecondFragmentBinding.inflate(inflater, container, false)

        initListeners()

        return binding.root
    }

    override fun initListeners() = with(binding) {
        toThirdScreenButton.setOnClickListener {
            navigateTo(NavigationDestination.ToThirdFragment)
        }
        backToFirstScreenButton.setOnClickListener {
            navigateBack()
        }
    }
}