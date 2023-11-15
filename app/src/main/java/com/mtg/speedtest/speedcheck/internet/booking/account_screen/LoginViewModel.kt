package com.mtg.speedtest.speedcheck.internet.booking.account_screen

import android.app.Application
import android.content.Context
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.mtg.speedtest.speedcheck.internet.booking.database.EndlessDatabase
import com.mtg.speedtest.speedcheck.internet.booking.model.User
import kotlinx.coroutines.launch

class LoginViewModel(application: Application) : AndroidViewModel(application) {
    private val _listUsers = MutableLiveData<MutableList<User>>()
    val listUsers: LiveData<MutableList<User>> = _listUsers

     fun getListUser(context: Context) {
        viewModelScope.launch {
            try {
                val list = EndlessDatabase.getInstance(context)?.userDao()?.getListUsers()!!
                _listUsers.postValue(list)
            } catch (e: Exception) {
                Log.e("Logger", "${e.message}")
            }
        }
    }
}