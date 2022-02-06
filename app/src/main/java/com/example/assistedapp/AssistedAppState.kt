package com.example.assistedapp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

class AssistedAppState(
    val navController: NavHostController
){
    fun navigation(){
        navController.popBackStack()
    }
}

@Composable
fun rememberAssistedAppState(
    navController: NavHostController = rememberNavController()
) = remember(navController){
    AssistedAppState(navController)
}
