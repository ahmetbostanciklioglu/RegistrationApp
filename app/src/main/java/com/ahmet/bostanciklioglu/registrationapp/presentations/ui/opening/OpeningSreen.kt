package com.ahmet.bostanciklioglu.registrationapp.presentations.ui.opening

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ahmet.bostanciklioglu.registrationapp.ui.theme.RegistrationAppTheme
import com.ahmet.bostanciklioglu.registrationapp.utils.PreviewAnnotation
import com.ahmet.bostanciklioglu.registrationapp.utils.Spacing


@Composable
fun OpeningScreenApp(modifier: Modifier = Modifier) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacing(modifier = modifier.height(130.dp))

        OpeningImage()

        Spacing(modifier = modifier.height(67.dp))

        ExploreTheApp(
            modifier = Modifier
        )
        Spacing(modifier = modifier.height(76.dp))

        SignInOrCreateAccountButtons(
            modifier = modifier.fillMaxWidth(),
            onSignInClicked = {},
            onCreateAccountClicked = {}
        )

        Spacing(modifier = modifier.height(84.dp))
    }
}



@Composable
@PreviewAnnotation
fun StarImagesPreview() {
   RegistrationAppTheme {
       OpeningScreenApp()
   }
}