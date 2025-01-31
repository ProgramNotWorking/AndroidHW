package com.example.androidhw.task1.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidhw.databinding.ThirdFragmentBinding
import com.example.androidhw.task1.base.FragmentNavigationConstants
import com.example.androidhw.task1.base.NavigationFragment

class ThirdFragment : NavigationFragment() {
    
    override val backstackTag: String
        get() = FragmentNavigationConstants.STUB

    private lateinit var binding: ThirdFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ThirdFragmentBinding.inflate(layoutInflater, container, false)

        initListeners()

        return binding.root
    }

    override fun initListeners() = with(binding) {
        backToSecondScreenButton.setOnClickListener {
            navigateBack()
        }
    }
}