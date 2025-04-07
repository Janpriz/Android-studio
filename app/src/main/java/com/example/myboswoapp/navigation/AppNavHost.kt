package com.example.myboswoapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.DanG.dang.ui.theme.screens.home.Homescreen
import com.example.myboswoapp.ui.theme.screens.dashboard.Dashboard_Screen
import com.example.myboswoapp.ui.theme.screens.login.Login_screen
import com.example.myboswoapp.ui.theme.screens.registration.Registration_Screen
import com.example.myboswoapp.ui.theme.screens.splashscreen.Splash_Screen

@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination: String= ROUTE_HOME) {
    NavHost(navController= navController,
        modifier=Modifier,
        startDestination=startDestination){
        composable(ROUTE_HOME){
            Homescreen(navController)
        }
        composable(ROUTE_REGISTER){
            Registration_Screen (navController)
        }
        composable(ROUTE_LOGIN){
            Login_screen(navController)
        }
        composable(ROUTE_SPLASHSCREEN){
            Splash_Screen(navController)
        }
        composable(ROUTE_DASHBOARD){
            Dashboard_Screen()
        }


    }

}