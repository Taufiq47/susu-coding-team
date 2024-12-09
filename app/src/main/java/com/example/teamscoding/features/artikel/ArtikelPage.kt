package com.example.teamscoding.features.artikel

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.teamscoding.components.DropdownTextField
import com.example.teamscoding.components.KategoriDropdown
import com.example.teamscoding.components.SearchBar
import com.example.teamscoding.components.artikelCard
import com.example.teamscoding.components.textField
import com.example.teamscoding.ui.theme.BackroundListArtikel

@Composable
fun artikelPage() {
    var searchQuery by remember { mutableStateOf("") }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(vertical = 15.dp, horizontal = 15.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(13.dp)
            ) {
                SearchBar(
                    query = searchQuery,
                    onQueryChanged = { newQuery -> searchQuery = newQuery },
                    onIconClick = {}
                )

                KategoriDropdown(label = "Kategori")
            }
        }

        item {
            Column(
                modifier = Modifier
                    .background(BackroundListArtikel, shape = RoundedCornerShape(12.dp))
                    .padding(15.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                for (i in 1..10) {
                    artikelCard()
                }
            }
        }
    }
}

@Preview
@Composable
fun artikelView() {
    artikelPage()
}