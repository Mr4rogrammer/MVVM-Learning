package com.mrprogrammer.mvvmlearing

import android.os.Build
import android.os.Looper
import androidx.annotation.RequiresApi
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Random

@RequiresApi(Build.VERSION_CODES.O)
object FakeRepo {


    private val _currentHH = MutableLiveData<String>()
    private val _currentMin = MutableLiveData<String>()
    private val _currentSec = MutableLiveData<String>()


    fun getHH(): LiveData<String> {
        return _currentHH
    }


    fun getMin(): LiveData<String> {
        return _currentMin
    }

    fun getSec(): LiveData<String> {
        return _currentSec
    }


    fun changeData() {
        val currentDateTime = LocalDateTime.now()
        _currentHH.postValue(currentDateTime.format(DateTimeFormatter.ofPattern("HH")))
        _currentMin.postValue(currentDateTime.format(DateTimeFormatter.ofPattern("mm")))
        _currentSec.postValue(currentDateTime.format(DateTimeFormatter.ofPattern("ss")))
    }

    init {
        changeData()
    }


}