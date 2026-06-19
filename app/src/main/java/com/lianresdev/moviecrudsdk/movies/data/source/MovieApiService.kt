package com.lianresdev.moviecrudsdk.movies.data.source

import com.lianresdev.moviecrudsdk.movies.data.MovieDTO
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Path



interface MovieApiService {
    // READ: Fetch all movies from the endpoint
    @GET("movies")
    suspend fun getMovies(): List<MovieDTO>

    // DELETE: Remove a specific movie by its ID on the server
    @DELETE("movies/{id}")
    suspend fun deleteMovie(@Path("id") movieId: Int): retrofit2.Response<Unit>

}