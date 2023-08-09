package com.ahmet.bostanciklioglu.registrationapp.utils

import androidx.annotation.FontRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import com.ahmet.bostanciklioglu.registrationapp.R

fun fontFamily(
    @FontRes font: Int
): FontFamily {

    return FontFamily(
        Font(resId = font)
    )
}