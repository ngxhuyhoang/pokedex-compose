package com.houzerd.pokedex.navigations

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.houzerd.pokedex.views.screens.Home
import com.houzerd.pokedex.views.screens.PokemonDetail
import com.houzerd.pokedex.views.screens.SplashScreen

@ExperimentalFoundationApi
@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "SplashScreen"
    ) {
        composable("SplashScreen") { SplashScreen(navController) }
        composable("Home") { Home(navController) }
        composable("Detail") { PokemonDetail() }
    }
}