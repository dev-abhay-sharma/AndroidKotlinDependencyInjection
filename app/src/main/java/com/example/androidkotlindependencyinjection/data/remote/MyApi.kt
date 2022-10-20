package com.example.androidkotlindependencyinjection.data.remote

import retrofit2.http.GET

interface MyApi {

    @GET
    suspend fun doNetworkCall()
}