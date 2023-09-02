package com.simple.predictiveback.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.fragment.app.Fragment

import androidx.fragment.app.FragmentTransaction
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.NavHostController
import com.example.myapplication.fragments.ContainerFragment
import com.simple.composetabfragmentnavigation.fragment.FragmentContainer

@Composable
fun NavigationNavHost(
    navController: NavHostController,
    getCommitFunction: (
        fragment: Fragment,
        tag: String
    ) -> (FragmentTransaction.(containerId: Int) -> Unit)
) {

    NavHost(navController, startDestination = NavigationItem.Home.route) {
        enumValues<NavigationItem>().forEach { item ->
            composable(item.route) {
                FragmentContainer(
                    modifier = Modifier.fillMaxSize(),
                    commit = getCommitFunction(
                        ContainerFragment.newInstance(item.title, item.color),
                        item.route
                    )
                )
            }
        }
    }
}
