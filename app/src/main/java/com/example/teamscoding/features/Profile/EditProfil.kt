package com.example.teamscoding.features.Profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.teamscoding.R
import androidx.compose.runtime.*



@Composable
fun EditProfil() {
    var name by remember { mutableStateOf("Bunda Maryam") }
    var email by remember { mutableStateOf("bundamaryam@gmail.com") }
    var phoneNumber by remember { mutableStateOf("0812345678") }

    Column(
        modifier = Modifier
            .background(color = Color.White)
            .fillMaxSize()
            .padding(vertical = 40.dp, horizontal = 15.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Profile Image
        Image(
            painter = painterResource(R.drawable.profile_image),
            contentDescription = "Profile Picture",
            modifier = Modifier
                .size(100.dp)
                .padding(8.dp)
        )

        // Name and Email
        Text(
            text = "Bunda Maryam",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier.padding(top = 8.dp)
        )
        Text(
            text = "bundamaryam@gmail.com",
            color = Color.Gray,
            fontSize = 14.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        TextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Nama Lengkap") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            value = phoneNumber,
            onValueChange = { phoneNumber = it },
            label = { Text("Nomor Handphone") }
        )


        Spacer(modifier = Modifier.height(32.dp))

        Spacer(modifier = Modifier.height(16.dp))
        Divider(color = Color.Gray, thickness = 1.dp)
        Spacer(modifier = Modifier.height(16.dp))

        // Logout
        // Edit Profile Button
        Button(
            onClick = { /* TODO: Handle edit profile */ },
            colors = ButtonDefaults.buttonColors(Color(0xFF008F5D))
        ) {
            Text(
                text = "Simpan",
                color = Color.White,
                fontSize = 16.sp
            )
        }
    }

}




@Preview
@Composable
fun EditProfilePreview() {
    EditProfil()
}