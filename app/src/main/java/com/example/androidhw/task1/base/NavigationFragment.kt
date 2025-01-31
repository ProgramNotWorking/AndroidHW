package com.example.androidhw.task1.base

import android.os.Bundle

abstract class NavigationFragment : BaseFragment() {

    abstract val backstackTag: String

    fun navigateTo(
        destination: NavigationDestination,
        args: Bundle? = null
    ) {
        navigationManager.navigateTo(
            fragment = destination.fragmentClass.java.newInstance(),
            args = args,
            backStack = backstackTag
        )
    }

}