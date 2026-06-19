package com.lianresdev.moviecrudsdk.movies.data.repositories

import com.lianresdev.moviecrudsdk.movies.data.mapper.MovieMapper
import com.lianresdev.moviecrudsdk.movies.data.source.MovieApiService
import com.lianresdev.moviecrudsdk.movies.domain.models.Movie
import com.lianresdev.moviecrudsdk.movies.domain.repositories.MovieRepository

class MovieRepositoryImpl(private val apiService: MovieApiService,
                          private val mapper: MovieMapper
): MovieRepository {
    // READ: Fetches movies from Retrofit and maps them into domain entities
    override suspend fun getAllMovies(): List<Movie> {
        val networkMovies = apiService.getMovies()
        return mapper.mapToDomainList(networkMovies)
}
    // DELETE: Fires the network delete command and checks if the response is successful
    override suspend fun deleteMovie(movieId: Int): Boolean {
        val response = apiService.deleteMovie(movieId)
        return response.isSuccessful
    }
    // Temporarily returning true for Create and Update until we wire their specific endpoints
    override suspend fun createMovie(movie: Movie): Boolean = true
    override suspend fun updateMovies(movie: Movie): Boolean = true
}