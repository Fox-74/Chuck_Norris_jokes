package com.example.chucknorrisjokes.data.api

class ApiHelper(private val apiService: ApiService) {

    suspend fun getJoke() = apiService.getJoke()

}