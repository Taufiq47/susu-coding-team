package com.example.teamscoding.features.belanjaDetail

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
fun DetailProdukPage() {
    var quantity by remember { mutableStateOf(1) }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(bottom = 40.dp)
    ) {
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    modifier = Modifier
                        .wrapContentWidth()
                        .height(50.dp)
                        .padding(start =40.dp, end= 40.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Kembali Icon",
                        tint = Color.Black,
                        modifier = Modifier.size(20.dp)
                    )
                    Text(
                        "Kembali",
                        color = Color(0xFF08B28D),
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        )
                    )
                }

                Image(
                    painter = painterResource(R.drawable.horizontal_logo),
                    contentDescription = "Logo Horizontal",
                    modifier = Modifier
                        .height(50.dp)
                        .padding(end = 40.dp)
                )
            }
        }

        item {
            Image(
                painter = painterResource(id = R.drawable.kangkung),
                contentDescription = "Product Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp)
            )
        }

        item {
            Spacer(modifier = Modifier.height(15.dp))
        }

        item {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White)
                    .padding(start = 40.dp, end = 40.dp)
            ) {
                Text(
                    text = "Kangkung Murah Segar",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 24.sp
                    )
                )

                Spacer(modifier = Modifier.height(15.dp))

                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    repeat(4) {
                        Icon(
                            imageVector = Icons.Filled.Star,
                            contentDescription = "Star",
                            tint = Color.Yellow
                        )
                    }
                    repeat(1) {
                        Icon(
                            imageVector = Icons.Filled.Star,
                            contentDescription = "Star",
                            tint = Color.LightGray
                        )

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 70.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically,
                        ) {
                            Button(
                                onClick = {
                                    if (quantity > 1) quantity -= 1 // Mengurangi jumlah, tidak boleh di bawah 1
                                },
                                colors = ButtonDefaults.buttonColors(Color(0xFF08B28D))
                            ) {
                                Text(text = quantity.toString(), textAlign = TextAlign.Center)
                            }

                            Button(
                                onClick = {
                                    quantity += 1 // Menambah jumlah
                                },
                                colors = ButtonDefaults.buttonColors(Color(0xFF08B28D))
                            ) {
                                Text(text = "+", textAlign = TextAlign.Center)
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Deskripsi",
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                )

                Spacer(modifier = Modifier.height(15.dp))

                Text(
                    text = "Kangkung adalah sayuran hijau yang kaya akan nutrisi penting untuk ibu hamil. Sayuran ini mengandung zat besi yang membantu mencegah anemia, asam folat yang mendukung perkembangan janin, serta serat untuk menjaga pencernaan tetap sehat selama kehamilan. Selain itu, kangkung juga rendah kalori dan mudah diolah menjadi berbagai hidangan lezat.",
                    color = Color.Gray,
                    style = TextStyle(
                        fontSize = 16.sp
                    )
                )

                Spacer(modifier = Modifier.height(15.dp))

                Button(
                    onClick = { /* add to cart action */ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    colors = ButtonDefaults.buttonColors(Color(0xFF08B28D))
                ) {
                    Text("Tambah Keranjang")
                }
            }
        }
    }
}

@Preview
@Composable
fun DetailBelanja() {
    DetailProdukPage()
}
