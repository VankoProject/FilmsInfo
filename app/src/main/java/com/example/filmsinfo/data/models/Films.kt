package com.example.filmsinfo.data.models

data class Films(
    val _links: Links,
    val averageRuntime: Int,
    val ended: String,
    val externals: Externals,
    val id: Int,
    val image: Image,
    val name: String,
    val network: Network,
    val officialSite: String,
    val premiered: String,
    val rating: Rating,
    val runtime: Int,
    val schedule: Schedule,
    val status: String,
    val summary: String,
    val type: String,
    val updated: Int,
    val url: String,
    val weight: Int
)