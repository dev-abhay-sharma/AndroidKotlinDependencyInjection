package com.example.androidkotlindependencyinjection.data.remote

import retrofit2.http.GET
import retrofit2.http.Query


interface MyApi {

    @GET("/test")
    suspend fun doNetworkCall()
}