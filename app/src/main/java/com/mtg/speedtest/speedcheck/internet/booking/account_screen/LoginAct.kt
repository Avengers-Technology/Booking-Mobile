package com.mtg.speedtest.speedcheck.internet.booking.account_screen

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.mtg.speedtest.speedcheck.internet.booking.MainAct
import com.mtg.speedtest.speedcheck.internet.booking.R

class LoginAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_login)
        initViews()
        initEvents()
    }

    private fun initEvents() {
        findViewById<TextView>(R.id.tvLogin).setOnClickListener {
            startActivity(Intent(this, MainAct::class.java))
        }

        findViewById<TextView>(R.id.tvSignUp).setOnClickListener {
            startActivity(Intent(this, RegisterAct::class.java))
        }
    }

    private fun initViews() {

    }
}