package com.example.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private var counter: Int = 0

    var mCounter = MutableLiveData<String>().apply { value = counter.toString() }

    private fun setmCounter() {
        mCounter.value = counter.toString()
    }

    private fun validateCounter() {
        counter++
        if (counter > 5) {
            counter = 0
        }
        setmCounter()
    }

    fun Counter() {
        validateCounter()
    }
}