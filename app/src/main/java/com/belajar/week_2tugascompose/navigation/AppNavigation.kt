package com.belajar.week_2tugascompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.belajar.week_2tugascompose.ui.pages.LoginPage
import com.belajar.week_2tugascompose.ui.pages.MainPage
import com.belajar.week_2tugascompose.ui.pages.RegisterPage

@Composable
fun AppNavigation() {
    val navController: NavHostController = rememberNavController()

    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            LoginPage(
                onNavigateToRegister = { navController.navigate("register") },
                onLoginSuccess = { navController.navigate("main") }
            )
        }

        composable("register") {
            RegisterPage(
                onNavigateToLogin = { navController.navigate("login") }
            )
        }

        composable("main") {
            MainPage(
                onLogout = {
                    navController.navigate("login") {
                        popUpTo("main") { inclusive = true }
                    }
                }
            )
        }
    }
}