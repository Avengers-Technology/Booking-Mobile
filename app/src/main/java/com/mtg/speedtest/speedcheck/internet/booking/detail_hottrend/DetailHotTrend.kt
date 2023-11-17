package com.mtg.speedtest.speedcheck.internet.booking.detail_hottrend

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mtg.speedtest.speedcheck.internet.booking.databinding.ActDetailHottrendBinding

class DetailHotTrend : AppCompatActivity() {
    private lateinit var binding: ActDetailHottrendBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActDetailHottrendBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
        initEvents()
    }

    private fun initEvents() {

    }

    private fun initViews() {

    }
}