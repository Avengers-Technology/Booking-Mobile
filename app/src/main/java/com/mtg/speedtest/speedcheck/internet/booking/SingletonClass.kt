package com.mtg.speedtest.speedcheck.internet.booking

import com.mtg.speedtest.speedcheck.internet.booking.model.HotTrend
import com.mtg.speedtest.speedcheck.internet.booking.model.Province

class SingletonClass private constructor() {

    // Some properties or methods can be added here
    var listHotTrend = mutableListOf(
        HotTrend(
            0, R.drawable.ic_yentu, "Yen Tu Pagoda", "Quang Ninh, Viet Nam", "$100", 3,
            isFavorite = false,
            isBookMark = false,
            description = ""
        ),
        HotTrend(
            1, R.drawable.ic_hotay, "Ho Tay Lake", "Ha Noi, Viet Nam", "200$", 1,
            isFavorite = false,
            isBookMark = false,
            description = ""
        ),
        HotTrend(
            2, R.drawable.ic_hoguom, "Ho Guom Lake", "Ha Noi, Viet Nam", "200$", 1,
            isFavorite = false,
            isBookMark = false,
            description = ""
        ),
        HotTrend(
            3, R.drawable.ic_catba, "Cat Ba Beach", "Hai Phong, Viet Nam", "300$", 4,
            isFavorite = false,
            isBookMark = false,
            description = ""
        ),
        HotTrend(
            4, R.drawable.ic_chuakeo, "Chua Keo Pagoda", "Thai Binh, Viet Nam", "600$", 2,
            isFavorite = false,
            isBookMark = false,
            description = ""
        )
    )

    val listProvince = mutableListOf(
        Province(1, R.drawable.ic_hanoi, "Ha Noi", "The country's capital has many historical monuments"),
        Province(2, R.drawable.ic_thaibinh, "Thai Binh", "The country's capital has many historical monuments"),
        Province(3,R.drawable.ic_quangninh, "Quang Ninh", "The country's capital has many historical monuments"),
        Province(4, R.drawable.ic_haiphong, "Hai Phong", "The country's capital has many historical monuments"),
        Province(5, R.drawable.ic_nghean, "Nghe An", "The country's capital has many historical monuments"),
        Province(6, R.drawable.ic_quangbinh, "Quang Binh", "The country's capital has many historical monuments"),
        Province(7, R.drawable.ic_hochiminh, "Ho Chi Minh", "The country's capital has many historical monuments")
    )

    companion object {
        // The single instance of the class
        @Volatile
        private var instance: SingletonClass? = null

        // Function to obtain the instance of the SingletonClass
        fun getInstance(): SingletonClass {
            return instance ?: synchronized(this) {
                instance ?: SingletonClass().also { instance = it }
            }
        }
    }
}