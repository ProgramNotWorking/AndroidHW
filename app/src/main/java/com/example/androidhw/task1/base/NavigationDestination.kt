package com.example.androidhw.task1.base

import androidx.fragment.app.Fragment
import com.example.androidhw.task1.fragments.SecondFragment
import com.example.androidhw.task1.fragments.ThirdFragment
import kotlin.reflect.KClass

sealed class NavigationDestination(val fragmentClass: KClass<out Fragment>) {
    data object ToSecondFragment : NavigationDestination(SecondFragment::class)
    data object ToThirdFragment : NavigationDestination(ThirdFragment::class)
}