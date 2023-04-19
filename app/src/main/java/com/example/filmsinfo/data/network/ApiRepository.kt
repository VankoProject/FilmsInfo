package com.example.filmsinfo.data.network

import javax.inject.Inject


class ApiRepository @Inject constructor(private val apiService: ApiService){

    suspend fun getAllFilms() = apiService.getAllFilms()
}