package com.example.androidkotlindependencyinjection.domain.repository

interface MyRepository {

    suspend fun doNetworkCall()
}