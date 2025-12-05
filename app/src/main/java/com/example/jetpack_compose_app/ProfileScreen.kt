package com.example.jetpack_compose_app

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun ProfileScreen(name: String, navigateBack: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.weight(1f))
        Text(text = "$name Profile screen", fontSize = 20.sp)
        Spacer(modifier = Modifier.weight(1f))
        Button(onClick = { navigateBack() }) {
            Text(text = "Go Back")
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}