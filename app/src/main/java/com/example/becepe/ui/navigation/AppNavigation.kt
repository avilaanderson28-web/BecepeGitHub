package com.example.becepe.ui.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.becepe.ui.login.LoginRoute

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = AppDestination.Login.route
    ) {
        composable(route = AppDestination.Login.route) {
            LoginRoute(
                onLoginClick = { navController.navigate(AppDestination.Second.route) }
            )
        }
        composable(route = AppDestination.Second.route) {
            SecondScreen()
        }
    }
}

@Composable
private fun SecondScreen() {
    Box(modifier = Modifier.fillMaxSize())
}

sealed class AppDestination(val route: String) {
    data object Login : AppDestination("login")
    data object Second : AppDestination("second")
}
