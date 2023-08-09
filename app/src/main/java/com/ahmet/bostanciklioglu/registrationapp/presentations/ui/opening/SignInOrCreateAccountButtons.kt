package com.ahmet.bostanciklioglu.registrationapp.presentations.ui.opening

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ahmet.bostanciklioglu.registrationapp.R
import com.ahmet.bostanciklioglu.registrationapp.utils.FontScalePreviews
import com.ahmet.bostanciklioglu.registrationapp.utils.fontFamily


@Composable
fun SignInOrCreateAccountButtons(
    onSignInClicked: () -> Unit,
    onCreateAccountClicked: () -> Unit,
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp),
           // .padding(bottom = 84.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        Button(
            onClick = onSignInClicked,
            modifier = modifier
                .fillMaxWidth()
                .height(56.dp),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White,
                containerColor = Color.Black
            ),
            shape = RoundedCornerShape(10.dp),

            ) {
            Text(
                text = stringResource(id = R.string.sign_in),
                style = TextStyle(
                    textAlign = TextAlign.Center,
                    fontFamily = fontFamily(R.font.inter_semibold),
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp,
                    lineHeight = 20.sp,
                    color = Color.White
                )
            )
        }
        OutlinedButton(
            onClick = onCreateAccountClicked,
            modifier = modifier
                .fillMaxWidth()
                .height(56.dp),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.Black,
                containerColor = Color.White
            ),
            shape = RoundedCornerShape(10.dp),
            border = BorderStroke(
                1.dp,
                colorResource(id = R.color.opening_screen_create_account_button_border_color)
            )
        ) {
            Text(
                text = stringResource(id = R.string.create_account),
                style = TextStyle(
                    textAlign = TextAlign.Center,
                    fontFamily = fontFamily(R.font.inter_semibold),
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp,
                    lineHeight = 20.sp,
                    color = Color.Black
                )
            )
        }
    }
}

@FontScalePreviews
@Composable
fun SignInOrCreateAccountButtonsPreview() {
    SignInOrCreateAccountButtons(
        onSignInClicked = { /*TODO*/ },
        onCreateAccountClicked = { /*TODO*/ })
}