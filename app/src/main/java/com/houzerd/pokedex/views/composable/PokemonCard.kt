package com.houzerd.pokedex.views.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberImagePainter

@Composable
fun PokemonCard(name: String, navController: NavController) {
    Column(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 0.dp)
            .clickable { navController.navigate("Detail") },
        verticalArrangement = Arrangement.spacedBy(0.dp)
    ) {
        Image(
            painter = rememberImagePainter("https://picsum.photos/200/200?random=$name"),
            contentDescription = null,
            modifier = Modifier.size(200.dp)
        )
        Text(
            text = "Pokemon $name",
        )
    }

}