package com.example.teamscoding.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.teamscoding.ui.theme.GreenText
import com.example.teamscoding.ui.theme.poppinsFontFamily

@Composable
fun artikelCard(navController: NavHostController) {
    Column(
        modifier = Modifier
            .border(BorderStroke(1.dp, Color.Gray), RoundedCornerShape(12.dp))
            .fillMaxWidth()
            .background(color = Color.White, shape = RoundedCornerShape(12.dp))
            .padding(horizontal = 13.dp, vertical = 9.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Row(
            modifier = Modifier
                .wrapContentHeight(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Spacer(
                modifier = Modifier
                    .height(25.dp)
                    .width(5.dp)
                    .background(color = GreenText)
            )

            Column {
                Text(
                    "Panduan Balita",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontFamily = poppinsFontFamily,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                )
                Text(
                    "Dr. Sigma",
                    style = TextStyle(
                        fontSize = 8.sp,
                        fontFamily = poppinsFontFamily,
                        color = Color.Gray
                    )
                )
            }
        }

        Row(

        ) {
            Column(
                modifier = Modifier
                    .width(296.dp)
            ) {
                Text(
                    "Bagaimana Menangani Anak Balita",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontFamily = poppinsFontFamily,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                )
                Text(
                    "Panduan praktis untuk menangani balita, mencakup kesehatan, nutrisi, perkembangan, dan tips menghadapi tantangan emosional serta perilaku sehari-hari.",
                    style = TextStyle(
                        fontSize = 8.sp,
                        fontFamily = poppinsFontFamily,
                        color = Color.Gray
                    )
                )
            }
        }

        Button(
            onClick = { navController.navigate("detailartikel") },
            modifier = Modifier
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = GreenText // Warna tombol
            ),
            shape = RoundedCornerShape(8.dp)
        ) {
            Text(
                text = "Lihat",
                color = Color.White, // Warna teks putih agar kontras dengan tombol hijau
                style = TextStyle(
                    fontSize = 12.sp,
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
            )
        }
    }
}

//@Preview
//@Composable
//fun viewArtikel() {
//    artikelCard(navController = NavController(LocalContext.current))
//}