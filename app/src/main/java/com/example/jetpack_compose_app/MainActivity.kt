package com.example.jetpack_compose_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpack_compose_app.ui.theme.JetpackcomposeappTheme
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.layout.*
import androidx.compose.material3.HorizontalDivider
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavigationWrapper()
        }
    }
}

@Composable
fun button(name: String, modifier: Modifier = Modifier) {
    Button(onClick = { }, modifier = modifier) {
        Text(text = "Hello $name!")
    }
}

@Composable
fun listItem(messages: List<String>) {
    LazyColumn {
        items(messages) { message ->
            Row() {
                Text(text = message)
            }
            HorizontalDivider()
        }
    }
}

@Composable
fun appTheme() {
    Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            button(
                name = "Android",
                modifier = Modifier.padding(innerPadding)
            )
            Spacer(modifier = Modifier.height(10.dp))
            var messages = listOf("Hello", "Hi", "Greetings", "Salutations", "Hola")
            listItem(messages)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyPreview() {
    JetpackcomposeappTheme {
        appTheme()
    }
}