package com.example.assistedapp.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.assistedapp.AssistedAppState
import com.example.assistedapp.rememberAssistedAppState
import com.example.assistedapp.ui.home.Home
import com.example.assistedapp.ui.login.Login
import com.example.assistedapp.ui.payment.Payment

@Composable
fun AssistedApp(
    appState: AssistedAppState = rememberAssistedAppState()
) {
    NavHost(
        navController = appState.navController,
        startDestination = "login"
    ) {
        composable(route = "login") {
            Login(navController = appState.navController)
        }
        composable(route = "home") {
            Home()
        }
        composable(route = "payment") {
            Payment(onBackPress = appState::navigateBack)}
    }
}