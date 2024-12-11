package com.example.teamscoding

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.teamscoding.features.Profile.ProfilePage
import com.example.teamscoding.features.auth.SignUpPage
import com.example.teamscoding.features.auth.loginPage
import com.example.teamscoding.features.auth.loginsign
import com.example.teamscoding.features.belanja.BelanjaPage
import com.example.teamscoding.features.artikel.ArtikelPage
import com.example.teamscoding.features.artikel.DetailArtikel
import com.example.teamscoding.features.Profile.ProfilePage
import com.example.teamscoding.features.belanjaDetail.DetailProdukPage
import com.example.teamscoding.features.home.HomePage
import com.example.teamscoding.ui.theme.GreenText
import com.example.teamscoding.ui.theme.TeamSCodingTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TeamSCodingTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    AppNavigation()
                }
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            val currentRoute = navController.currentBackStackEntry?.destination?.route
            BottomAppBar(
                containerColor = GreenText,
                tonalElevation = 4.dp
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    val icons = listOf(
                        Screens.Home to Icons.Default.Home,
                        Screens.Artikel to Icons.Default.Star,
                        Screens.Belanja to Icons.Default.ShoppingCart,
                        Screens.Profil to Icons.Default.Person
                    )

                    icons.forEach { (screen, icon) ->
                        IconButton(
                            onClick = {
                                navController.navigate(screen.route) {
                                    popUpTo(navController.graph.startDestinationId) { saveState = true }
                                    launchSingleTop = true
                                    restoreState = true
                                }
                            },
                        ) {
                            Icon(
                                icon,
                                contentDescription = screen.route,
                                modifier = Modifier.size(28.dp),
                                tint = Color.White
                            )
                        }
                    }
                }
            }
        }
    ) {
        NavHost(navController, startDestination = Screens.Home.route) {
            composable(Screens.Home.route) { HomePage() }
            composable(Screens.Artikel.route) { ArtikelPage(navController) }
            composable(Screens.Belanja.route) { BelanjaPage(navController) }
            composable(Screens.Profil.route) { ProfilePage() }
            composable(Screens.DetailArtikel.route) { DetailArtikel(navController) }
            composable(Screens.DetailBelanja.route) { DetailProdukPage(navController) }
        }
    }
}

@Composable
fun BottomNavItem(
    navController: NavController,
    selectedRoute: String,
    screen: Screens,
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    modifier: Modifier = Modifier
) {
    IconButton(
        onClick = {
            navController.navigate(screen.route) {
                popUpTo(navController.graph.startDestinationId) { saveState = true }
                launchSingleTop = true
                restoreState = true
            }
        }
    ) {
        Icon(
            icon,
            contentDescription = screen.route,
            modifier = Modifier.size(28.dp),
            tint = Color.White
        )
    }
}