package com.zalo.mytales2.auth

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.zalo.mytales2.auth.splash.SplashScreen
/**
Created by zaloaustine in 3/7/24.
 */
const val authRoot = "auth"

sealed class AuthScreen(val route: String) {
    data object Splash : AuthScreen("$authRoot/splash")
    data object Login : AuthScreen("$authRoot/login")
    data object Signup : AuthScreen("$authRoot/signup")
}

fun NavGraphBuilder.authNavGraph(
    onAuthSuccess: () -> Unit,
    navController: NavController
) {
    navigation(startDestination = AuthScreen.Splash.route, route = authRoot) {
        composable(AuthScreen.Splash.route){
            SplashScreen()
        }
    }
}