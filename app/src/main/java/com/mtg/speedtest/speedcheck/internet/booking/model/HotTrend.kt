package com.mtg.speedtest.speedcheck.internet.booking.model

import java.io.Serializable

data class HotTrend(val idHotTrend: Int, val imageHotTrend: Int, val nameHotTrend: String, val addressHotTrend: String, val priceHotTrend: String, val idProvince: Int, var isFavorite : Boolean, var isBookMark : Boolean, val description: String) :
    Serializable