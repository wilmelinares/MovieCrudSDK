package com.lianresdev.moviecrudsdk.movies.data
import com.google.gson.annotations.SerializedName

data class MovieDTO(
    @SerializedName("id")
    val id: Int,

    @SerializedName("title")
    val title: String,

    @SerializedName("description")
    val description: String,

    @SerializedName("image")
    val imageUrl: String,

    @SerializedName("backgroundUrl")
    val backgroundUrl: String,

    @SerializedName("category")
    val category: String
)
