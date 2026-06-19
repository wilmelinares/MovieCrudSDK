package com.lianresdev.moviecrudsdk.movies.domain.use_case
import com.lianresdev.moviecrudsdk.movies.domain.models.Movie
import com.lianresdev.moviecrudsdk.movies.domain.repositories.MovieRepository


class GetMoviesUseCase (
    private val repository:  MovieRepository
) {
    suspend operator fun invoke(): List<Movie> {
        return repository.getAllMovies()
    }

}