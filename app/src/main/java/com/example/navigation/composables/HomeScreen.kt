package com.example.navigation.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun HomeScreen(navController: NavController, modifier: Modifier = Modifier) {
    var text by remember { mutableStateOf("") }
    Column (
       modifier = modifier.fillMaxWidth(),
       verticalArrangement = Arrangement.spacedBy(8.dp),
       horizontalAlignment = Alignment.CenterHorizontally
   ){
       Text(
           modifier = modifier,
           text = "This is home screen"
       )
       OutlinedTextField(
           value = text,
           onValueChange = {text = it}
       )
       Button(
           onClick = { navController.navigate("second/$text")},
           enabled = text.isNotEmpty()
       ) {
           Text("To second")
       }
   }
}