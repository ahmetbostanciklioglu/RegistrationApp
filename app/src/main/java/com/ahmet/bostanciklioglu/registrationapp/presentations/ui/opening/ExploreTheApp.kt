package com.ahmet.bostanciklioglu.registrationapp.presentations.ui.opening

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ahmet.bostanciklioglu.registrationapp.R
import com.ahmet.bostanciklioglu.registrationapp.utils.FontScalePreviews
import com.ahmet.bostanciklioglu.registrationapp.utils.fontFamily


@Composable
fun ExploreTheApp(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 37.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.explore_the_app_text),
            fontFamily = fontFamily(R.font.poppins_bold),
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Normal,
            lineHeight = 41.6.sp,
            letterSpacing = -(0.32).sp,
            style = TextStyle(textAlign = TextAlign.Center)
        )
        Text(
            text = stringResource(id = R.string.now_your_finances),
            fontFamily = fontFamily(R.font.inter_regular),
            fontSize = 17.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal,
            lineHeight = 21.25.sp,
            maxLines = 2,
            style = TextStyle(textAlign = TextAlign.Center)
        )
    }
}

@FontScalePreviews
@Composable
fun ExploreTheAppPreview() {
    ExploreTheApp()
}