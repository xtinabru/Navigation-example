package com.example.navigation.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun HomeScreen(navController: NavController, modifier: Modifier = Modifier) {
   Column (
       verticalArrangement = Arrangement.spacedBy(8.dp)
   ){
       Text(
           modifier = modifier,
           text = "This is home screen"
       )
       Button(
           onClick = { navController.navigate("second")}
       ) {
           Text("To second")
       }
   }
}