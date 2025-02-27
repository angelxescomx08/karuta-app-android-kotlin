package com.jose.angel.hdz.rda.karuta.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.jose.angel.hdz.rda.karuta.views.CardView
import com.jose.angel.hdz.rda.karuta.views.HomeView

@Composable
fun NavigationManager(){
    val navControler = rememberNavController()
    NavHost(navController = navControler, startDestination = "home"){
        composable("home") {
            HomeView(navControler)
        }
        composable("card/{card_id}", arguments = listOf(
            navArgument("card_id"){
                type = NavType.IntType
            }
        )) {
            val card_id = it.arguments?.getInt("card_id") ?: 0
            CardView(navControler, card_id)
        }
    }
}