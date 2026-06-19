package com.lianresdev.moviecrudsdk.movies.domain.models

data class Movie(
    val id: Int,
    val title: String,
    val description: String,
    val imagesUrl: String,
    val backgroundUrl: String,
    val category: String
)



