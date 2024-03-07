package com.zalo.mytales2.theme.components

import android.content.res.Configuration
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.compose.MyTalesTheme

/**
Created by zaloaustine in 3/7/24.
 */
@Composable
fun AppBar(
    title: String,
    navIcon: ImageVector? = null,
    onNav: () -> Unit = {}
) {
    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.primary,
        ),
        title = {
            Text(text = title)
        },
        navigationIcon = {
            navIcon?.let {
                IconButton(onClick = { onNav() }) {
                    Icon(navIcon, contentDescription = "Nav Icon")
                }
            }
        },
    )
}

@Composable
@MyTalesPreview
private fun AppBarPreview(){
    MyTalesTheme {
        Surface {
            AppBar(
                title = "My Tales",
                navIcon = Icons.Filled.ArrowBack
            )
        }
    }
}