package com.example.klasekoappfroga

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.klasekoappfroga.ui.theme.KlasekoAppFrogaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KlasekoAppFrogaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Gorka",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    Column (modifier = modifier.padding()) {
        Surface(color = Color.Green) {
            Text(
                text = "Kaixo $name!",
                modifier = modifier.padding(bottom = 30.dp)
            )
            Text(
                text = "Agur $name!",
                modifier = modifier.padding(top = 30.dp, start = 5.dp)
            )
        }

    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KlasekoAppFrogaTheme {
        Greeting("Gorka")
    }
}