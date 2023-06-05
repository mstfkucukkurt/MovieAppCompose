package com.example.movieapp.domain.repository

import com.example.movieapp.data.remote.dto.MovieDetailDTO
import com.example.movieapp.data.remote.dto.MoviesDTO

interface MovieRepository {

    suspend fun getMovies(search: String) : MoviesDTO
    suspend fun getMovieDetail(imdbId: String) : MovieDetailDTO
}