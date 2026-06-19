package com.lianresdev.moviecrudsdk.movies.domain.repositories
import com.lianresdev.moviecrudsdk.movies.domain.models.Movie

interface MovieRepository {
    suspend fun getAllMovies(): List<Movie>
    suspend fun createMovie(movie: Movie): Boolean
    suspend fun updateMovies (movie: Movie): Boolean
     suspend fun deleteMovie (movieId: Int): Boolean
 }