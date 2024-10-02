package com.example.teamscoding.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.input.InputTransformation.Companion.keyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.teamscoding.ui.theme.GrayText
import com.example.teamscoding.ui.theme.GreenText
import com.example.teamscoding.ui.theme.poppinsFontFamily

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun textField(label: String, textState: MutableState<String>) {
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .height(45.dp)
            .background(Color.White),
        value = textState.value,
        onValueChange = { textState.value = it },
        placeholder = {
            Text(
                label,
                style = TextStyle(
                    fontSize = 12.sp,
                    color = Color.Gray
                )
            )
        },
        singleLine = true,
        maxLines = 1,
        shape = RoundedCornerShape(3.dp),
        textStyle = TextStyle(fontSize = 12.sp, color = Color.Black)
    )
}

@Composable
fun DropdownTextField() {
    var text by remember { mutableStateOf("") }
    var expanded by remember { mutableStateOf(false) }
    val lokasiList = listOf(
        "Jakarta",
        "Bandung",
        "Surabaya",
        "Yogyakarta",
        "Semarang"
    )

    Box {
        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            modifier = Modifier
                .fillMaxWidth()
                .height(45.dp)
                .clip(RoundedCornerShape(3.dp))
                .border(BorderStroke(1.dp, Color.Gray), RoundedCornerShape(3.dp))
                .padding(0.dp)
                .background(Color.White),
            placeholder = {
                Text(
                    "Pilih Kota/Kabupaten",
                    style = TextStyle(fontSize = 12.sp, color = Color.Gray)
                )
            },
            trailingIcon = {
                IconButton(onClick = { expanded = !expanded }) {
                    Icon(
                        imageVector = Icons.Default.ArrowDropDown,
                        contentDescription = "Dropdown"
                    )
                }
            },
            textStyle = TextStyle(fontSize = 12.sp, color = Color.Black)
        )

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            lokasiList.forEach { item ->
                DropdownMenuItem(
                    text = { Text(item) },
                    onClick = {
                        text = item
                        expanded = false
                    }
                )
            }
        }
    }
}

@Composable
fun JenisKelamin() {
    var text by remember { mutableStateOf("") }
    var expanded by remember { mutableStateOf(false) }
    val lokasiList = listOf(
        "Laki-Laki",
        "Perempuan"
    )

    Box {
        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            modifier = Modifier
                .fillMaxWidth()
                .height(45.dp)
                .clip(RoundedCornerShape(3.dp))
                .border(BorderStroke(1.dp, Color.Gray), RoundedCornerShape(3.dp))
                .padding(0.dp)
                .background(Color.White),
            placeholder = {
                Text(
                    "Pilih Jenis Kelamin",
                    style = TextStyle(fontSize = 12.sp, color = Color.Gray)
                )
            },
            trailingIcon = {
                IconButton(onClick = { expanded = !expanded }) {
                    Icon(
                        imageVector = Icons.Default.ArrowDropDown,
                        contentDescription = "Dropdown"
                    )
                }
            },
            textStyle = TextStyle(fontSize = 12.sp, color = Color.Black)
        )

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            lokasiList.forEach { item ->
                DropdownMenuItem(
                    text = { Text(item) },
                    onClick = {
                        text = item
                        expanded = false
                    }
                )
            }
        }
    }
}

@Composable
fun BeratBadan(textState: MutableState<String>) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Column {
            Text(
                text = "Berat",
                style = TextStyle(
                    fontFamily = poppinsFontFamily,
                    fontSize = 12.sp,
                    color = GrayText
                )
            )
            Spacer(modifier = Modifier.height(5.dp))
            OutlinedTextField(
                modifier = Modifier
                    .width(131.dp)
                    .height(45.dp)
                    .background(Color.White),
                value = textState.value,
                onValueChange = { textState.value = it },
                singleLine = true,
                maxLines = 1,
                shape = RoundedCornerShape(3.dp),
                textStyle = TextStyle(fontSize = 12.sp, color = Color.Gray),
                trailingIcon = {
                    Text(text = "Kg", fontSize = 12.sp, color = Color.Gray)
                }
            )
        }

        Column {
            Text(
                text = "Panjang/Tinggi",
                style = TextStyle(
                    fontFamily = poppinsFontFamily,
                    fontSize = 12.sp,
                    color = GrayText
                )
            )
            Spacer(modifier = Modifier.height(5.dp))
            OutlinedTextField(
                modifier = Modifier
                    .width(131.dp)
                    .height(45.dp)
                    .background(Color.White),
                value = textState.value,
                onValueChange = { textState.value = it },
                singleLine = true,
                maxLines = 1,
                shape = RoundedCornerShape(3.dp),
                textStyle = TextStyle(fontSize = 12.sp, color = Color.Gray),
                trailingIcon = {
                    Text(text = "Cm", fontSize = 12.sp, color = Color.Gray)
                }
            )
        }
    }
}