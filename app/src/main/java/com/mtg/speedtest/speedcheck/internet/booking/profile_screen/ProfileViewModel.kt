package com.mtg.speedtest.speedcheck.internet.booking.profile_screen

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.mtg.speedtest.speedcheck.internet.booking.CommonUtils
import com.mtg.speedtest.speedcheck.internet.booking.PreferManager
import com.mtg.speedtest.speedcheck.internet.booking.database.EndlessDatabase
import com.mtg.speedtest.speedcheck.internet.booking.model.User
import kotlinx.coroutines.launch

class ProfileViewModel(application: Application) : AndroidViewModel(application) {

    private val _user = MutableLiveData<User>()
    val user: LiveData<User> = _user

    private val _statusUpdate = MutableLiveData<Boolean>()
    val statusUpdate: LiveData<Boolean> = _statusUpdate

    fun getUser(context: Context) {
        viewModelScope.launch {
            try {
                val user = EndlessDatabase.getInstance(context)?.userDao()
                    ?.getListUsers()!![PreferManager.getInstance(context)
                    ?.readInt(CommonUtils.keyIndexAccount, 0)!!]
                _user.postValue(user)
            } catch (e: Exception) {

            }
        }
    }

    fun updateUser(context: Context, user: User) {
        viewModelScope.launch {
            try {
                EndlessDatabase.getInstance(context)?.userDao()?.updateUser(user)
                _statusUpdate.postValue(true)
            } catch (e: Exception) {
                _statusUpdate.postValue(false)
            }
        }
    }
}