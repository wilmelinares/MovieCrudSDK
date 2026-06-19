package com.lianresdev.moviecrudsdk.movies.data.mapper

import com.lianresdev.moviecrudsdk.movies.data.model.MovieDTO
import com.lianresdev.moviecrudsdk.movies.domain.models.Movie

class MovieMapper {
    fun mapToDomain(dto: MovieDTO): Movie {
        return Movie(
            id = dto.id,
            title =  dto.title,
            description = dto.description,
            imagesUrl = dto.imageUrl,
            backgroundUrl = dto.backgroundUrl,
            category = dto.category
        )
    }

    fun mapToDomainList(dtoList: List<MovieDTO>): List<Movie> {
        return dtoList.map { dto -> mapToDomain(dto) }
    }
}