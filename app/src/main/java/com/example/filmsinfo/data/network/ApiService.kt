package com.example.filmsinfo.data.network

import com.example.filmsinfo.data.models.Films
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("/shows/1")
    suspend fun getAllFilms(): Response<List<Films>>
}