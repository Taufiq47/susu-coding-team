package com.example.teamscoding.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.ComponentActivity
import com.example.teamscoding.MainActivity
import com.example.teamscoding.R

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