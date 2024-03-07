package com.zalo.mytales2.theme.components


/**
Created by zaloaustine in 3/7/24.
 */
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.compose.MyTalesTheme

@Composable
fun FullScreenCircularProgressIndicator() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        contentAlignment = Alignment.Center,
    ) {
        CircularProgressIndicator()
    }
}

@MyTalesPreview
@Composable
private fun FullScreenCircularProgressIndicatorPreview() {
    MyTalesTheme {
        Surface {
            FullScreenCircularProgressIndicator()
        }
    }
}