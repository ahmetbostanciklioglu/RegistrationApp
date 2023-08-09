package com.ahmet.bostanciklioglu.registrationapp.presentations

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.ahmet.bostanciklioglu.registrationapp.presentations.ui.opening.OpeningScreenApp
import com.ahmet.bostanciklioglu.registrationapp.ui.theme.RegistrationAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RegistrationAppTheme {
                // A surface container using the 'background' color from the theme
                OpeningScreenApp()
            }
        }
    }
}

