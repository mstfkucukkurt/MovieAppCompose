package com.example.movieapp.data.remote

import com.example.movieapp.data.remote.dto.MovieDetailDTO
import com.example.movieapp.data.remote.dto.MoviesDTO
import com.example.movieapp.util.Constants.API_KEY
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieAPI {

    //https://www.omdbapi.com/?i=tt3896198&apikey=88205158&s=Star
    //https://www.omdbapi.com/?i=tt3896198&apikey=88205158
    @GET(".")
    suspend fun getMovies(
        @Query("s") searchString: String,
        @Query("apikey") apiKey : String = API_KEY
    ) : MoviesDTO

    @GET(".")
    suspend fun getMovieDetail(
        @Query("i") imdbId: String,
        @Query("apikey") apiKey : String = API_KEY
    ) : MovieDetailDTO
}