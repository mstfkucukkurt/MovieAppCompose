package com.example.movieapp.data.repository

import com.example.movieapp.data.remote.MovieAPI
import com.example.movieapp.data.remote.dto.MovieDetailDTO
import com.example.movieapp.data.remote.dto.MoviesDTO
import com.example.movieapp.domain.repository.MovieRepository
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(private val api: MovieAPI) : MovieRepository {
    override suspend fun getMovies(search: String): MoviesDTO {
        return api.getMovies(search)
    }

    override suspend fun getMovieDetail(imdbId: String): MovieDetailDTO {
        return api.getMovieDetail(imdbId)
    }
}