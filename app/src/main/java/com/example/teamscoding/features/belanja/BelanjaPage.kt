package com.example.teamscoding.features.belanja

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.teamscoding.R
import com.example.teamscoding.components.BelanjaItem
import com.example.teamscoding.components.SearchBar
import com.example.teamscoding.ui.theme.poppinsFontFamily

@Composable
fun BelanjaPage(navController: NavHostController) {
    var searchQuery by remember { mutableStateOf("") }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 40.dp, end = 40.dp, bottom = 40.dp, top = 10.dp),
        verticalArrangement = Arrangement.spacedBy(30.dp),
    ) {
        item {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 0.dp),
                contentAlignment = Alignment.BottomEnd
            ) {
                Image(
                    painter = painterResource(R.drawable.horizontal_logo),
                    contentDescription = "Logo",
                    modifier = Modifier
                        .size(150.dp)
                        .align(Alignment.TopCenter)
                        .padding(bottom = 30.dp)
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(40.dp)
                ) {
                    Text(
                        text = "Belanja Saja Disini!",
                        fontSize = 23.sp,
                        fontFamily = poppinsFontFamily,
                        fontWeight = FontWeight.W800,
                        color = Color(0xFF2C5F2D),
                        modifier = Modifier.weight(1f)
                    )

                    Surface(
                        color = Color(0xFF08B28D),
                        shape = RoundedCornerShape(20.dp),
                        modifier = Modifier.size(32.dp)
                    ) {
                        IconButton(
                            onClick = { /* Handle Add to Cart */ },
                            modifier = Modifier.fillMaxSize()
                        ) {
                            Icon(
                                imageVector = Icons.Filled.ShoppingCart,
                                contentDescription = "Add to Cart",
                                tint = Color.White,
                                modifier = Modifier.size(15.dp)
                            )
                        }
                    }
                }

            }
        }

        item {
            Box(
                modifier = Modifier
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                SearchBar(
                    query = searchQuery,
                    onQueryChanged = { newQuery -> searchQuery = newQuery },
                    onIconClick = {},
                    placeholderTextId = R.string.CariBelanja
                )
            }
        }

        item {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                for (i in 1..10) {
                    BelanjaItem(navController = navController)
                }
            }
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun Belanja() {
//    BelanjaPage()
//}
