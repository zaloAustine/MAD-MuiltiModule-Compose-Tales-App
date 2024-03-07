package com.zalo.mytales2

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.zalo.mytales2.auth.authNavGraph
import com.zalo.mytales2.auth.authRoot


/**
Created by zaloaustine in 3/7/24.
 */

@Composable
fun MyTalesNavHost(navHostController: NavHostController) {
    NavHost(navController = navHostController, startDestination = authRoot) {
        authNavGraph(navController = navHostController, onAuthSuccess = {})
    }
}