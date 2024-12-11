package com.example.teamscoding.features.beranda

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.teamscoding.R
import com.example.teamscoding.ui.theme.poppinsFontFamily

@Composable
fun HomePage() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(26.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Logo Section
            item {
                Image(
                    painter = painterResource(R.drawable.horizontal_logo),
                    contentDescription = "App Logo",
                    modifier = Modifier
                        .size(150.dp)
                        .padding(bottom = 16.dp)
                )
            }

            item {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        text = "Hi, Bunda Maryam! 👋",
                        fontWeight = FontWeight.Bold,
                        fontSize = 24.sp,
                        fontFamily = poppinsFontFamily,
                        textAlign = TextAlign.Center,
                        color = Color(0xFF2C5F2D)
                    )

                    Spacer(modifier = Modifier.height(26.dp))

                    Text(
                        text = "Eksplore Fitur Kami Untuk Mendapatkan Pengalaman Sebagai Orang Tua!",
                        fontSize = 16.sp,
                        textAlign = TextAlign.Center,
                        color = Color.Gray
                    )

                    Spacer(modifier = Modifier.height(26.dp))
                }
            }

            item {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    FeatureCard(
                        title = "Child Info",
                        description = "Manage info tentang anak",
                        onClick = { /* TODO: Navigate to Child Info */ }
                    )

                    FeatureCard(
                        title = "Pregnancy",
                        description = "Lacak kehamilanmu disini!",
                        onClick = { /* TODO: Navigate to Pregnancy */ }
                    )
                }
            }

            item {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    FeatureCard(
                        title = "Health Tips",
                        description = "Baca artikel kesehatan",
                        onClick = { /* TODO: Navigate to Health Tips */ }
                    )

                    FeatureCard(
                        title = "Settings",
                        description = "Kustomisasi aplikasimu!",
                        onClick = { /* TODO: Navigate to Settings */ }
                    )
                }
            }
        }
    }
}

@Composable
fun FeatureCard(
    title: String,
    description: String,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .size(150.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFE8F5E9)),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        onClick = onClick
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = title,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                color = Color.Black,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = description,
                fontSize = 12.sp,
                color = Color.Gray,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHomePage() {
    HomePage()
}
