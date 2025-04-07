package com.example.myboswoapp.ui.theme.screens.splashscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.myboswoapp.R
import com.example.myboswoapp.navigation.ROUTE_HOME
import kotlinx.coroutines.delay

@Composable
fun Splash_Screen(navHostController: NavHostController) {
    val navController = rememberNavController()
    LaunchedEffect(true) {
        delay(3000)
        navController.navigate(ROUTE_HOME)
    }
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
        contentAlignment = Alignment.Center)
    {
        Image(painter = painterResource(id = R.drawable.google),
            contentDescription = "google image",

            )
    }
    
}

@Preview
@Composable
private fun Splashprev() {
    Splash_Screen(rememberNavController())

}