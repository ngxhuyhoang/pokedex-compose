package com.houzerd.pokedex

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.houzerd.pokedex.navigations.AppNavigation

@ExperimentalFoundationApi
@Composable
fun App() {
    // A surface container using the 'background' color from the theme
    Surface(color = MaterialTheme.colors.background) {
        AppNavigation()
    }
}


