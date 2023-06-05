package com.example.movieapp.domain.model

import com.example.movieapp.data.remote.dto.Rating

data class MovieDetail(
    val Actors: String,
    val Country: String,
    val Director: String,
    val Genre: String,
    val Language: String,
    val Poster: String,
    val Released: String,
    val Title: String,
    val Type: String,
    val Year: String,
    val imdbRating: String,
)
