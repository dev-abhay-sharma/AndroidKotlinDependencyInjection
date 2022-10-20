package com.example.androidkotlindependencyinjection

import androidx.lifecycle.ViewModel
import com.example.androidkotlindependencyinjection.domain.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
    private val repository: MyRepository
) : ViewModel() {
    init {
        CoroutineScope(Dispatchers.Main).launch {
            repository.doNetworkCall()
        }
        print("Hello from init Viewmodel")
    }


    fun doCall() {
        CoroutineScope(Dispatchers.Main).launch {
            repository.doNetworkCall()
        }
    }
}