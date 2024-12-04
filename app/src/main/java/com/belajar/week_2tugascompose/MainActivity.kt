package com.belajar.week_2tugascompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.belajar.week_2tugascompose.navigation.AppNavigation
import com.belajar.week_2tugascompose.ui.theme.Week2TugasComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Week2TugasComposeTheme {
                AppNavigation()
            }
        }
    }
}

@Preview(showBackground = true, name = "App Navigation Preview")
@Composable
fun PreviewAppNavigation() {
    Week2TugasComposeTheme {
        AppNavigation()
    }
}