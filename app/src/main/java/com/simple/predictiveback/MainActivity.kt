package com.simple.predictiveback

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.simple.predictiveback.childfragmentcallback.RestorableBottomBarActivity
import com.simple.predictiveback.ui.theme.PredictiveBackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PredictiveBackTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }

    @Composable
    fun Greeting(modifier: Modifier = Modifier) {
        Column {
            Button(onClick = {
                startActivity(
                    Intent(
                        this@MainActivity,
                        RestorableBottomBarActivity::class.java
                    )
                )
                finish()
            }) {
                Text("Child Fragment Back Callback Setup")
            }
        }
    }
}
