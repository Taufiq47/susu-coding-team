package com.example.teamscoding.features.artikel

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.teamscoding.R
import com.example.teamscoding.components.KategoriDropdown
import com.example.teamscoding.components.SearchBar
import com.example.teamscoding.components.artikelCard
import com.example.teamscoding.ui.theme.BackroundListArtikel
import com.example.teamscoding.ui.theme.GreenText
import com.example.teamscoding.ui.theme.poppinsFontFamily

@Composable
fun detailArtikel(onIconClick: () -> Unit) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(vertical = 15.dp, horizontal = 24.dp),
        verticalArrangement = Arrangement.spacedBy(18.dp)
    ) {
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    modifier = Modifier
                        .wrapContentWidth()
                        .height(50.dp)
                        .padding(end = 2.dp)
                        .clickable(onClick = onIconClick),
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
                        color = GreenText,
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontFamily = poppinsFontFamily,
                            fontWeight = FontWeight.Medium
                        )
                    )
                }

                Image(
                    painter = painterResource(R.drawable.horizontal_logo),
                    contentDescription = "Logo Horizontal",
                    modifier = Modifier
                        .height(50.dp)
                )
            }
        }

        item {
            Column {
                Text(
                    "Panduan Mengenai Anak Balita",
                    color = GreenText,
                    style = TextStyle(
                        lineHeight = 1.em,
                        fontSize = 32.sp,
                        fontFamily = poppinsFontFamily,
                        fontWeight = FontWeight.Bold
                    )
                )

                Text(
                    "Masa balita merupakan periode penting dalam perkembangan seorang anak, yang mencakup usia 1 hingga 5 tahun. Pada masa ini, anak mengalami pertumbuhan fisik, perkembangan kognitif, emosional, dan sosial yang sangat pesat. Panduan berikut memberikan informasi penting untuk mendukung orang tua dalam mengasuh dan mendampingi anak balita.",
                    color = GreenText,
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontFamily = poppinsFontFamily,
                        textAlign = TextAlign.Justify
                    )
                )
            }
        }

        item {
            Column {
                Text(
                    text = "1. Perkembangan Fisik",
                    color = GreenText,
                    style = TextStyle(
                        lineHeight = 1.em,
                        fontSize = 18.sp,
                        fontFamily = poppinsFontFamily,
                        fontWeight = FontWeight.Bold
                    )
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Balita mengalami peningkatan tinggi dan berat badan yang signifikan. Berikut adalah beberapa hal yang perlu diperhatikan:",
                    color = Color.Black, // Penjelasan diubah menjadi hitam
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontFamily = poppinsFontFamily,
                        textAlign = TextAlign.Justify
                    )
                )

                Spacer(modifier = Modifier.height(8.dp))

                Row(modifier = Modifier.padding(bottom = 4.dp)) {
                    Text(
                        text = "a. ",
                        fontWeight = FontWeight.Bold,
                        color = GreenText,
                        textAlign = TextAlign.Justify
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = "Nutrisi Seimbang: Pastikan anak mendapatkan makanan bergizi yang mencakup karbohidrat, protein, lemak sehat, vitamin, dan mineral. Susu juga menjadi sumber penting untuk kalsium dan vitamin D.",
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontFamily = poppinsFontFamily,
                            textAlign = TextAlign.Justify
                        )
                    )
                }

                Row(modifier = Modifier.padding(bottom = 4.dp)) {
                    Text(
                        text = "b. ",
                        fontWeight = FontWeight.Bold,
                        color = GreenText
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = "Aktivitas Fisik: Dorong anak untuk aktif bergerak, seperti berjalan, berlari, dan bermain. Aktivitas fisik membantu perkembangan otot dan tulang yang sehat.",
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontFamily = poppinsFontFamily,
                            textAlign = TextAlign.Justify
                        )
                    )
                }

                Row(modifier = Modifier.padding(bottom = 4.dp)) {
                    Text(
                        text = "c. ",
                        fontWeight = FontWeight.Bold,
                        color = GreenText
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = "Kesehatan: Rutinlah memeriksakan kesehatan anak ke dokter, termasuk vaksinasi sesuai jadwal.",
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontFamily = poppinsFontFamily,
                            textAlign = TextAlign.Justify
                        )
                    )
                }
            }

        }

        item {
            Column {
                Text(
                    text = "2. Perkembangan Fisik",
                    color = GreenText,
                    style = TextStyle(
                        lineHeight = 1.em,
                        fontSize = 18.sp,
                        fontFamily = poppinsFontFamily,
                        fontWeight = FontWeight.Bold
                    )
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Balita mengalami peningkatan tinggi dan berat badan yang signifikan. Berikut adalah beberapa hal yang perlu diperhatikan:",
                    color = Color.Black, // Penjelasan diubah menjadi hitam
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontFamily = poppinsFontFamily,
                        textAlign = TextAlign.Justify
                    )
                )

                Spacer(modifier = Modifier.height(8.dp))

                Row(modifier = Modifier.padding(bottom = 4.dp)) {
                    Text(
                        text = "a. ",
                        fontWeight = FontWeight.Bold,
                        color = GreenText,
                        textAlign = TextAlign.Justify
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = "Nutrisi Seimbang: Pastikan anak mendapatkan makanan bergizi yang mencakup karbohidrat, protein, lemak sehat, vitamin, dan mineral. Susu juga menjadi sumber penting untuk kalsium dan vitamin D.",
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontFamily = poppinsFontFamily,
                            textAlign = TextAlign.Justify
                        )
                    )
                }

                Row(modifier = Modifier.padding(bottom = 4.dp)) {
                    Text(
                        text = "b. ",
                        fontWeight = FontWeight.Bold,
                        color = GreenText
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = "Aktivitas Fisik: Dorong anak untuk aktif bergerak, seperti berjalan, berlari, dan bermain. Aktivitas fisik membantu perkembangan otot dan tulang yang sehat.",
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontFamily = poppinsFontFamily,
                            textAlign = TextAlign.Justify
                        )
                    )
                }

                Row(modifier = Modifier.padding(bottom = 4.dp)) {
                    Text(
                        text = "c. ",
                        fontWeight = FontWeight.Bold,
                        color = GreenText
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = "Kesehatan: Rutinlah memeriksakan kesehatan anak ke dokter, termasuk vaksinasi sesuai jadwal.",
                        color = Color.Black,
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontFamily = poppinsFontFamily,
                            textAlign = TextAlign.Justify
                        )
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun DetailView() {
    detailArtikel(onIconClick = {})
}