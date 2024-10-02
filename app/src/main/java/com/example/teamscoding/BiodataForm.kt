package com.example.teamscoding

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.teamscoding.components.BeratBadan
import com.example.teamscoding.components.DropdownTextField
import com.example.teamscoding.components.JenisKelamin
import com.example.teamscoding.components.textField
import com.example.teamscoding.ui.theme.GrayText
import com.example.teamscoding.ui.theme.GreenText
import com.example.teamscoding.ui.theme.poppinsFontFamily

@Composable
fun biodataform() {
    var name by remember { mutableStateOf("") }
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(vertical = 14.dp, horizontal = 30.dp)
            .verticalScroll(scrollState),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        // Logo Horizontal
        Image(
            painter = painterResource(R.drawable.horizontal_logo),
            contentDescription = "Logo",
            modifier = Modifier
                .width(140.dp)
                .align(Alignment.End)
        )

        // Selamat Datang
        Column(
            modifier = Modifier
                .width(310.dp)
        ) {
            Text(
                text = "Selamat Datang di\nBaby Buddy",
                fontFamily = poppinsFontFamily,
                fontWeight =  FontWeight.Bold,
                style = TextStyle(
                    fontSize = 20.sp,
                    color = GreenText
                )
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Yuk Bunda, isi biodata dibawah ini dan nikmati kejutan yang luar biasa dari Baby Buddy",
                fontFamily = poppinsFontFamily,
                fontWeight =  FontWeight.Normal,
                style = TextStyle(
                    fontSize = 12.sp,
                    color = GreenText
                )
            )
        }

        // Form Data Pribadi
        Column(
            modifier = Modifier
            .width(310.dp)
        ) {
            Text(
                text = "Data Pribadi",
                style = TextStyle(
                    fontFamily = poppinsFontFamily,
                    fontWeight =  FontWeight.Bold,
                    fontSize = 14.sp,
                    color = GreenText
                )
            )

            Spacer(modifier = Modifier.height(10.dp))

            // Nama Lengkap
            Column {
                Text(
                    text = "Nama Lengkap",
                    style = TextStyle(
                        fontFamily = poppinsFontFamily,
                        fontSize = 12.sp,
                        color = GrayText
                    )
                )
                Spacer(modifier = Modifier.height(10.dp))
                textField(label = "Nama", textState = remember { mutableStateOf(name) })
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Domisili
            Column {
                Text(
                    text = "Domisili",
                    style = TextStyle(
                        fontFamily = poppinsFontFamily,
                        fontSize = 12.sp,
                        color = GrayText
                    )
                )
                Spacer(modifier = Modifier.height(10.dp))
                DropdownTextField()
            }
        }

        // Program
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Column {
                Image(
                    painter = painterResource(R.drawable.progtam_hamil),
                    contentDescription = "Logo",
                    modifier = Modifier
                        .width(87.dp)
                        .height(128.dp)
                )
                Spacer(modifier = Modifier.height(10.dp))
                Box(
                    modifier = Modifier.width(87.dp)
                ) {
                    Text(text = "Program Hamil", style = TextStyle(
                        fontFamily = poppinsFontFamily,
                        fontWeight = FontWeight.Bold,
                        fontSize = 10.sp,
                        color = GreenText
                    ),modifier = Modifier.align(Alignment.Center))
                }
            }

            Column {
                Image(
                    painter = painterResource(R.drawable.hamil),
                    contentDescription = "Logo",
                    modifier = Modifier
                        .width(87.dp)
                        .height(128.dp)
                )
                Spacer(modifier = Modifier.height(10.dp))
                Box(
                    modifier = Modifier.width(87.dp)
                ) {
                    Text(text = "Program Hamil", style = TextStyle(
                        fontFamily = poppinsFontFamily,
                        fontWeight = FontWeight.Bold,
                        fontSize = 10.sp,
                        color = GreenText
                    ),modifier = Modifier.align(Alignment.Center))
                }
            }

            Column {
                Image(
                    painter = painterResource(R.drawable.tumbuh_kembang),
                    contentDescription = "Logo",
                    modifier = Modifier
                        .width(87.dp)
                        .height(130.dp)
                )
                Spacer(modifier = Modifier.height(10.dp))
                Box(
                    modifier = Modifier.width(87.dp)
                ) {
                    Text(text = "Program Hamil", style = TextStyle(
                        fontFamily = poppinsFontFamily,
                        fontWeight = FontWeight.Bold,
                        fontSize = 10.sp,
                        color = GreenText
                    ),modifier = Modifier.align(Alignment.Center))
                }
            }
        }

        Spacer(modifier = Modifier.height(5.dp))

        // Data Anak
        Column(
            modifier = Modifier
                .width(310.dp)
        ) {
            Text(
                text = "Informasi Anak",
                style = TextStyle(
                    fontFamily = poppinsFontFamily,
                    fontWeight =  FontWeight.Bold,
                    fontSize = 14.sp,
                    color = GreenText
                )
            )

            Spacer(modifier = Modifier.height(10.dp))

            // Nama Lengkap
            Column {
                Text(
                    text = "Nama Lengkap",
                    style = TextStyle(
                        fontFamily = poppinsFontFamily,
                        fontSize = 12.sp,
                        color = GrayText
                    )
                )
                Spacer(modifier = Modifier.height(5.dp))
                textField(label = "Nama", textState = remember { mutableStateOf(name) })
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Jenis Kelamin
            Column {
                Text(
                    text = "Domisili",
                    style = TextStyle(
                        fontFamily = poppinsFontFamily,
                        fontSize = 12.sp,
                        color = GrayText
                    )
                )
                Spacer(modifier = Modifier.height(5.dp))
                JenisKelamin()
            }

            Spacer(modifier = Modifier.height(10.dp))

            //Berat Badan
            BeratBadan(textState = remember { mutableStateOf(name) })

            Spacer(modifier = Modifier.height(10.dp))

            //Berkebutuhan Khusus
            Column {
                Text(
                    text = "Kebutuhan Khusus",
                    style = TextStyle(
                        fontFamily = poppinsFontFamily,
                        fontSize = 12.sp,
                        color = GrayText
                    )
                )
                Spacer(modifier = Modifier.height(10.dp))
                textField(label = "*Optional", textState = remember { mutableStateOf(name) })
            }
        }

        //Button Simpan/Submit
        Button(
            modifier = Modifier
                .width(310.dp)
                .height(60.dp),
            colors = ButtonDefaults.buttonColors(
                Color(0xFF035B48)
            ),
            shape = RoundedCornerShape(15.dp),
            onClick = {
                // Fungsi yang akan dijalankan ketika tombol submit diklik
            }
        ) {
            Text(
                text = "Submit",
                style = TextStyle(
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                    color = Color.White
                ),
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )
        }
    }
}


@Preview
@Composable
fun prevBio() {
    biodataform()
}