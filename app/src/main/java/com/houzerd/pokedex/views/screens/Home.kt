package com.houzerd.pokedex.views.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.houzerd.pokedex.views.composable.PokemonCard

@ExperimentalFoundationApi
@Composable
fun Home(navController: NavController) {
    Column {
        TopAppBar(content = {
            Text(
                text = "List Pokemon",
                textAlign = TextAlign.Center
            )
        })

        LazyVerticalGrid(
            cells = GridCells.Fixed(2),
            contentPadding = PaddingValues(16.dp),
        ) {
            items(20) {
                PokemonCard(
                    name = "$it",
                    navController = navController
                )
            }
        }
    }
}