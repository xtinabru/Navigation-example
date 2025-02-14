package com.example.navigation.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun SecondScreen(navController: NavController, modifier: Modifier = Modifier, parameter: String?) {
    Column (
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            modifier = modifier,
            text = "This is second screen$parameter"
        )
        Button(
            onClick = { navController.navigate("home")}
        ) {
            Text("Back to home")
        }
    }
}