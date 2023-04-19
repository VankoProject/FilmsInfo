package com.example.filmsinfo.Screens

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.filmsinfo.MainViewModel

@Composable
fun DetailScreen(navController: NavController, viewModel: MainViewModel, itemId: String) {
    Text("Details screen: item id: $itemId")

}