package com.example.teamscoding

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.teamscoding.features.artikel.artikelPage
import com.example.teamscoding.features.auth.SignUpPage
import com.example.teamscoding.features.auth.loginPage
import com.example.teamscoding.features.auth.loginsign
import com.example.teamscoding.features.belanja.BelanjaPage


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            loginPage()
        }
    }
}