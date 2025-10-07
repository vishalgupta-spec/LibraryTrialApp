package com.example.librarytrial.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf

object LibraryTrial {
    @Composable
    fun LaunchLoginFlow(onOtpVerified: (String) -> Unit) {

        var showOtp = androidx.compose.runtime.remember { mutableStateOf(false) }

        if (showOtp.value) {
            OtpScreen(onBack = { showOtp.value = false })
        } else {
            LoginScreen(onSendOtp = { showOtp.value = true })
        }
    }
}
