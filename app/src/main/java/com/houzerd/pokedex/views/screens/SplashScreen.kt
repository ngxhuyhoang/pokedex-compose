package com.houzerd.pokedex.views.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import kotlinx.coroutines.*

@DelicateCoroutinesApi
@Composable
fun SplashScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color.Blue),
        contentAlignment = Alignment.Center,
        content = {
            Text(
                text = "Pokedex",
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 40.sp
            )
        }
    )
    
    LaunchedEffect(key1 = true) {
        delay(1000)
        navController.navigate("Home")
    }
}