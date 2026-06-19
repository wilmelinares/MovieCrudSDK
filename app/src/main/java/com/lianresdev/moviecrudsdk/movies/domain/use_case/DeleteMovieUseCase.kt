package com.lianresdev.moviecrudsdk.movies.domain.use_case

import com.lianresdev.moviecrudsdk.movies.domain.repositories.MovieRepository

class DeleteMovieUseCase (
    private  val repository: MovieRepository
) {
    suspend operator fun invoke(movieId: Int): Boolean {
        return repository.deleteMovie(movieId)
    }
}