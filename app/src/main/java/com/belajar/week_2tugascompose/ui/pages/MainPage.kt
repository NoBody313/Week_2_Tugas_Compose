package com.belajar.week_2tugascompose.ui.pages

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MainPage(onLogout: () -> Unit) {
    Box(
        modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Welcome to the Main Page!")
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = onLogout) {
                Text(text = "Logout")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMainPage() {
    MainPage(onLogout = {})
}