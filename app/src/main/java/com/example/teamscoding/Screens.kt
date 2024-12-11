package com.example.teamscoding

sealed class Screens(val route: String) {
    object Home : Screens("home")
    object Artikel : Screens("artikel")
    object Belanja : Screens("belanja")
    object Profil : Screens("profil")
}