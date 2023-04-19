package com.example.filmsinfo.Screens

import android.util.Log
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.filmsinfo.MainViewModel
import com.example.filmsinfo.data.models.Films

@Composable
fun MainScreen(navController: NavController, viewModel: MainViewModel) {
    val allFilms = viewModel.allFilms.observeAsState(listOf()).value
    allFilms.forEach { Log.d("checkData", "ID: ${it.id} name: ${it.name}") }
    Surface(
        modifier = Modifier.
        fillMaxSize()
    ) {

        LazyColumn() {
            items(allFilms.take(10)) {
                item -> FilmItem(item = item)
            }
        }
    }
}

@Composable
fun FilmItem(item: Films) {
    Row(modifier = Modifier
        .fillMaxSize()
    ) {
        Text(text = item.id.toString())
        Text(text = item.name)
    }
}