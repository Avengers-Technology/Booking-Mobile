package com.mtg.speedtest.speedcheck.internet.booking.account_screen

import android.app.Application
import android.content.Context
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.mtg.speedtest.speedcheck.internet.booking.database.EndlessDatabase
import com.mtg.speedtest.speedcheck.internet.booking.model.User
import kotlinx.coroutines.launch

class RegisterViewModel(application: Application) : AndroidViewModel(application) {

    fun createAccount(context: Context, user: User) {
        viewModelScope.launch {
            try {
                EndlessDatabase.getInstance(context)?.userDao()?.insertUser(user)
            }catch (e : Exception) {
                Log.e("Logger", "${e.message}")
            }
        }
    }
}