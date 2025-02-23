package com.jose.angel.hdz.rda.karuta.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jose.angel.hdz.rda.karuta.views.CardView
import com.jose.angel.hdz.rda.karuta.views.HomeView

@Composable
fun NavigationManager(){
    val navControler = rememberNavController()
    NavHost(navController = navControler, startDestination = "home"){
        composable("home") {
            HomeView(navControler)
        }
        composable("card/{card_id}") {
            CardView(navControler)
        }
    }
}