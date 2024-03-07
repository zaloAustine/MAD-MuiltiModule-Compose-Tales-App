package com.zalo.mytales2.auth.splash


/**
Created by zaloaustine in 3/7/24.
 */
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.compose.MyTalesTheme
import com.zalo.mytales2.features.auth.R
import com.zalo.mytales2.theme.components.MyTalesPreview

@Composable
fun SplashScreen() {
    Splash()
}

@Composable
fun Splash() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Icon(
            painter = painterResource(id = R.drawable.mini_tales),
            contentDescription = "mini tales",
        )
        Spacer(modifier = Modifier.size(12.dp))
    }
}

@MyTalesPreview
@Composable
fun SplashPreview() {
    MyTalesTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            Splash()
        }
    }
}
