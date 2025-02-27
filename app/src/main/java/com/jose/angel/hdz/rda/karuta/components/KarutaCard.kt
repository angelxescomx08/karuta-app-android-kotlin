package com.jose.angel.hdz.rda.karuta.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.jose.angel.hdz.rda.karuta.data.KarutaCard

@Composable
fun KarutaCard(card: KarutaCard, onClick: (id: Int) -> Unit){
    Card (
        modifier = Modifier
            .fillMaxWidth(),
        onClick = {
            onClick(card.id.toInt())
        }
    ){
        Column(
            modifier = Modifier.padding(10.dp)
        ) {
            Text(card.japanese)
            Text("${card.id}. ${card.silaba}")
            Text(card.english)
        }
    }
}