package com.example.chucknorrisjokes.data.api

import com.example.chucknorrisjokes.data.model.Joke
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {


    @GET("jokes/random")
    suspend fun getJoke(): Joke

    @GET("jokes/random?category={category}")
    suspend fun getJokeCategory(@Path("categoruy")category: String): Joke
}