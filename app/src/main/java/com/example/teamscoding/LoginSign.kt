package com.example.teamscoding

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun loginsign() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(R.drawable.background_login), // import image
            contentDescription = "1",
            modifier = Modifier
                .graphicsLayer { // mengatur rotasi, skala, posisi
                    scaleX = 2.5f // ukuran
                    scaleY = 2.5f
                    translationX = -400f // posisi
                    translationY = 500f
                }
        )

        // Letakkan logo di tengah
        Column(
            modifier = Modifier
                .align(Alignment.TopCenter),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.horizontal_logo),
                contentDescription = "2",
                modifier = Modifier
                    .graphicsLayer {
                        scaleX = 0.6f
                        scaleY = 0.6f
                        translationY = -50f
                    }
            )
        }

        // Letakkan tombol di bagian bawah layar
        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 80.dp), // Padding agar tidak terlalu ke bawah
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = { /* TODO */ },
                modifier = Modifier
                    .size(300.dp, 45.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF08B28D))
            ) {
                Text(
                    text = stringResource(R.string.SignUp),
                    fontSize = 16.sp
                )
            }

            Spacer(modifier = Modifier.height(15.dp))

            Button(
                onClick = { /* TODO */ },
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .border(2.dp, Color(0xFF08B28D), RoundedCornerShape(10.dp))
                    .size(300.dp, 45.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent,
                    contentColor = Color(0xFF08B28D)
                )
            ) {
                Text(
                    text = stringResource(R.string.SignIn),
                    fontSize = 16.sp
                )
            }
        }
    }
}