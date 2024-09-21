package com.example.teamscoding

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.ComponentActivity

class SplashActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            goTOMain()
        }, 3000)
    }

    private fun goTOMain() {
        intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}