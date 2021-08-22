package com.houzerd.pokedex.views.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.ImagePainter.State.Empty.painter
import coil.compose.rememberImagePainter

@Composable
fun PokemonCard(name: String, navController: NavController) {
    Box(
        modifier = Modifier.clickable { navController.navigate("Detail") },
        content = {
            Column {
                Image(
                    painter = rememberImagePainter("https://picsum.photos/200/200?random=1"),
                    contentDescription = null,
                    modifier = Modifier.size(200.dp)
                )
                Text(
                    text = "Pokemon $name",
                )
            }
        }
    )
}