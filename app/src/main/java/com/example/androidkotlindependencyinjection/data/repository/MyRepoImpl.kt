package com.example.androidkotlindependencyinjection.data.repository

import com.example.androidkotlindependencyinjection.data.remote.MyApi
import com.example.androidkotlindependencyinjection.domain.repository.MyRepository

class MyRepoImpl(
    private val api: MyApi
    ) : MyRepository {
    override suspend fun doNetworkCall() {

    }
}