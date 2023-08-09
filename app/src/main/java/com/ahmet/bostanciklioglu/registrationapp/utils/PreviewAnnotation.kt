package com.ahmet.bostanciklioglu.registrationapp.utils

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview


@Preview(
    name = "Small Font",
    group = "Small Font Group",
    fontScale = 0.5f,
    uiMode = UI_MODE_NIGHT_YES,

)
@Preview(
    name = "Small Font",
    group = "Small Font Group",
    fontScale = 0.5f,
    uiMode = UI_MODE_NIGHT_NO,

)
@Preview(
    name = "Medium Font",
    group = "Medium Font Group",
    fontScale = 1f,
    uiMode = UI_MODE_NIGHT_YES,

)
@Preview(
    name = "Medium Font",
    group = "Medium Font Group",
    fontScale = 1f,
    uiMode = UI_MODE_NIGHT_NO,

)
@Preview(
    name = "Large Font",
    group = "Large Font Group",
    fontScale = 1.5f,
    uiMode = UI_MODE_NIGHT_YES,

)
@Preview(
    name = "Large Font",
    group = "Large Font Group",
    fontScale = 1.5f,
    uiMode = UI_MODE_NIGHT_NO,

)
annotation class FontScalePreviews


@Preview(
    name = "Pixel 3", group = "Devices", device = Devices.PIXEL_3A, showSystemUi = true, showBackground = true
)
annotation class PreviewAnnotation