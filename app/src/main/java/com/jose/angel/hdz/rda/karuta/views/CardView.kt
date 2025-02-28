package com.jose.angel.hdz.rda.karuta.views

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.jose.angel.hdz.rda.karuta.data.cards

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardView(navController: NavController, card_id: Int){
    val card = cards[card_id]
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            CenterAlignedTopAppBar(title = {
                Text(text = "Karuta App", Modifier.clickable {
                    navController.navigate("home")
                })
            })
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),

        ) {
            Text(card.japanese)
            Text("Romaji: ${card.romaji}")
            Text("Author (Kanjis): ${card.authorJapanese}")
            Text("Author: ${card.author}")
            Text("Poem name: ${card.name}")
            Text("${card.id}. ${card.silaba}")
            Text(card.english)
            Text(card.spanish)
        }
    }
}