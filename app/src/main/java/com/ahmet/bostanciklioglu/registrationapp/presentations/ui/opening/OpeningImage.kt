package com.ahmet.bostanciklioglu.registrationapp.presentations.ui.opening

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ahmet.bostanciklioglu.registrationapp.R

@Composable
fun OpeningImage(
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = null,
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 40.dp),
        contentScale = ContentScale.Crop
    )
}

@Preview
@Composable
fun SplashImagePreview() {
    OpeningImage()
}