package com.mrprogrammer.mvvmlearing

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class MainViewModel :ViewModel(){
    val HH : LiveData<String>
        @RequiresApi(Build.VERSION_CODES.O)
        get()=FakeRepo.getHH()


    val Min : LiveData<String>
        @RequiresApi(Build.VERSION_CODES.O)
        get()=FakeRepo.getMin()




    val Sec : LiveData<String>
        @RequiresApi(Build.VERSION_CODES.O)
       get() {
         return  FakeRepo.getMin()
       }



    @RequiresApi(Build.VERSION_CODES.O)
    fun changeData(){
        FakeRepo.changeData()
    }



}