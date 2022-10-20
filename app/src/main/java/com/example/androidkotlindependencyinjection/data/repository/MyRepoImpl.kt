package com.example.androidkotlindependencyinjection.data.repository

import android.app.Application
import com.example.androidkotlindependencyinjection.data.remote.MyApi
import com.example.androidkotlindependencyinjection.domain.repository.MyRepository
import javax.inject.Inject

class MyRepoImpl @Inject constructor(
    private val api: MyApi,
    private val app: Application,
    ) : MyRepository {

    init {
        println("Hello from main repo")
    }

    override suspend fun doNetworkCall() {
        println("Hello from main repo")
    }
}