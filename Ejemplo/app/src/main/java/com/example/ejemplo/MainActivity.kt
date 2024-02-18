package com.example.ejemplo


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            @Composable
            fun GreetingCardTheme(content: @Composable () -> Unit) {
                MaterialTheme(content = content)
            }
            GreetingCardTheme {
                // A surface container that uses the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {

                    Greeting("Jared")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Surface(color = Color.Cyan) {

        Text(text = "Hola, mi nombre es $name!", modifier = Modifier.padding(100.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    @Composable
    fun GreetingCardTheme(content: @Composable () -> Unit) {
        MaterialTheme(content = content)
    }
    GreetingCardTheme {
        Greeting("Jared")
    }
}