package com.example.filmsinfo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.example.filmsinfo.navigation.Screens
import com.example.filmsinfo.navigation.SetupNavHost
import com.example.filmsinfo.ui.theme.FilmsInfoTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FilmsInfoTheme {
                val navController = rememberNavController()
                val viewModel: MainViewModel = viewModel()
                SetupNavHost(navController = navController, viewModel = viewModel)
            }
        }
    }
}
