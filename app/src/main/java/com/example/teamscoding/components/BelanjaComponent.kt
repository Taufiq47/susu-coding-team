package com.example.teamscoding.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.teamscoding.R
import com.example.teamscoding.ui.theme.poppinsFontFamily

@Composable
fun BelanjaItem(modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier
            .border(BorderStroke(0.5.dp, Color.Gray), RoundedCornerShape(12.dp))
            .background(Color.White, shape = RoundedCornerShape(8.dp))
            .fillMaxWidth()
            .padding(15.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Surface(
            shape = CircleShape,
            border = BorderStroke(3.dp, Color(0xFF08B28D)),
            modifier = Modifier
                .size(80.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.kangkung),
                contentDescription = "Kangkung",
                modifier = Modifier
                    .size(60.dp)
                    .clip(CircleShape)
            )
        }

        Column(
            modifier = Modifier
                .weight(1f)
                .padding(3.dp)
        ) {
            Text(
                text = "Kangkung",
                fontSize = 14.sp,
                fontFamily = poppinsFontFamily,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "Toko Pak Man",
                fontSize = 12.sp,
                fontFamily = poppinsFontFamily,
                color = Color.Gray
            )

            Spacer(modifier = Modifier.height(15.dp))

            Text(
                text = "Rp. 2.000 / ikat",
                fontSize = 12.sp,
                fontFamily = poppinsFontFamily,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF08B28D)
            )
        }

        Button(
            onClick = { /* Handle Detail button click */ },
            modifier = Modifier
                .height(32.dp)
                .padding(),
            colors = ButtonDefaults.buttonColors(Color(0xFF08B28D))
        ) {
            Text(
                text = "Detail",
                fontFamily = poppinsFontFamily,
                color = Color.White,
                fontSize = 12.sp
            )
        }
    }
}

@Preview
@Composable
fun BelanjaItemPreview() {
    BelanjaItem()
}
