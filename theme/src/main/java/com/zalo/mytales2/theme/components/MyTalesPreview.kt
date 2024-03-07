package com.zalo.mytales2.theme.components


/**
Created by zaloaustine in 3/7/24.
 */
import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.Preview

@Preview(
    name = "Preview Day",
    showBackground = true,
    uiMode = UI_MODE_NIGHT_NO,
)
@Preview(
    name = "Preview Night",
    showBackground = true,
    uiMode = UI_MODE_NIGHT_YES,
)

annotation class MyTalesPreview