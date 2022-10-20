package com.example.androidkotlindependencyinjection.di

import android.app.Application
import com.example.androidkotlindependencyinjection.data.remote.MyApi
import com.example.androidkotlindependencyinjection.data.repository.MyRepoImpl
import com.example.androidkotlindependencyinjection.domain.repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {


    @Provides
    @Singleton
    fun provideMyApi(): MyApi {
        return Retrofit.Builder()
            .baseUrl(("https://test.com"))
            .build()
            .create(MyApi::class.java)
    }

    @Provides
    @Singleton
    fun provideRepository(api:MyApi,app:Application): MyRepository {
        return MyRepoImpl(api,app)
    }

}