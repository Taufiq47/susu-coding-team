package com.example.teamscoding.features.Profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.teamscoding.R

@Composable
fun ProfilePage() {
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

        // Edit Profile Button
        Button(
            onClick = { /* TODO: Handle edit profile */ },
            colors = ButtonDefaults.buttonColors(Color(0xFF008F5D))
        ) {
            Text(
                text = "Edit Profile",
                color = Color.White,
                fontSize = 16.sp
            )
        }

        Spacer(modifier = Modifier.height(32.dp))

        // Preferences Section
        PreferencesItem(icon = { Icon(imageVector = Icons.Filled.Favorite, contentDescription = "Favorite Icon") }, title = "Favorites", onClick = { /* TODO */ })
        PreferencesItem(icon = { Icon(imageVector = Icons.Filled.Call, contentDescription = "Favorite Language") }, title = "Language", onClick = { /* TODO */ })
        PreferencesItem(icon = { Icon(imageVector = Icons.Filled.Star, contentDescription = "Pin Code") }, title = "PIN Code", onClick = { /* TODO */ })

        Spacer(modifier = Modifier.height(16.dp))
        Divider(color = Color.Gray, thickness = 1.dp)
        Spacer(modifier = Modifier.height(16.dp))

        // Logout
        TextButton(onClick = { /* TODO: Handle logout */ }) {
            Text(
                text = "Logout",
                color = Color(0xFF008F5D),
                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 16.sp)
            )
        }
    }
}

@Composable
fun PreferencesItem(
    icon: @Composable () -> Unit,
    title: String,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .clickable { onClick() },
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Gunakan Composable ikon
        icon()
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            text = title,
            style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Medium),
            modifier = Modifier.weight(1f)
        )
        Icon(
            imageVector = Icons.Filled.ArrowForward,
            contentDescription = null,
            tint = Color.Gray
        )
    }
}

@Preview
@Composable
fun vw() {
    ProfilePage()
}
