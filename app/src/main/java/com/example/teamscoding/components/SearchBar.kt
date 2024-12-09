package com.example.teamscoding.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SearchBar(
    query: String,
    onQueryChanged: (String) -> Unit,
    onIconClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .width(242.dp)
            .background(Color.White, shape = RoundedCornerShape(20.dp))
            .height(46.dp)
            .border(
                border = BorderStroke(width = 1.dp, color = Color.Gray),
                shape = RoundedCornerShape(20.dp)
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        OutlinedTextField(
            value = query,
            onValueChange = onQueryChanged,
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
            shape = RoundedCornerShape(
                topStart = 20.dp,
                topEnd = 0.dp,
                bottomEnd = 0.dp,
                bottomStart = 20.dp
            ),
            placeholder = {
                Text(
                    text = "Cari Artikel...",
                    style = TextStyle(
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                )
            },
            singleLine = true,
        )

        IconButton(
            onClick = onIconClick,
            modifier = Modifier.padding(end = 8.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Search Icon",
                tint = Color.Gray
            )
        }
    }
}

@Composable
fun KategoriDropdown(label: String) {
    var text by remember { mutableStateOf("") }
    var expanded by remember { mutableStateOf(false) }
    val kategoriList = listOf(
        "Bayi",
        "Balita",
        "Prasekolah"
    )

    Box {
        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            modifier = Modifier
                .fillMaxWidth()
                .height(46.dp)
                .clip(RoundedCornerShape(20.dp))
                .border(BorderStroke(1.dp, Color.Gray), RoundedCornerShape(20.dp))
                .padding(0.dp)
                .background(Color.White),
            placeholder = {
                Text(
                    label,
                    style = TextStyle(fontSize = 12.sp, color = Color.Gray)
                )
            },
            trailingIcon = {
                IconButton(
                    onClick = { expanded = !expanded },
                    modifier = Modifier.size(24.dp).padding(0.dp)
                ) {
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
            kategoriList.forEach { item ->
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

@Preview
@Composable
fun rev() {
    KategoriDropdown(label = "Kategori")
}
