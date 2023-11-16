package com.mtg.speedtest.speedcheck.internet.booking

import com.mtg.speedtest.speedcheck.internet.booking.model.HotTrend
import com.mtg.speedtest.speedcheck.internet.booking.model.Province

class SingletonClass private constructor() {

    // Some properties or methods can be added here
    var listHotTrend = mutableListOf(
        HotTrend(
            0, R.drawable.ic_yentu, "Yen Tu Pagoda", "Quang Ninh, Viet Nam", "$100", 3,
            isFavorite = true,
            isBookMark = false,
            description = ""
        ),
        HotTrend(
            1, R.drawable.ic_vinhhalong, "Ha Long Bay", "Quang Ninh, Viet Nam", "$300", 3,
            isFavorite = true,
            isBookMark = false,
            description = ""
        ),
        HotTrend(
            2, R.drawable.ic_baotangq_quangninh, "Quang Ninh Museum", "Quang Ninh, Viet Nam", "$320", 3,
            isFavorite = true,
            isBookMark = false,
            description = ""
        ),
        HotTrend(
            3, R.drawable.ic_hotay, "Ho Tay Lake", "Ha Noi, Viet Nam", "400$", 1,
            isFavorite = false,
            isBookMark = false,
            description = ""
        ),
        HotTrend(
            4, R.drawable.ic_hoguom, "Ho Guom Lake", "Ha Noi, Viet Nam", "120$", 1,
            isFavorite = false,
            isBookMark = false,
            description = ""
        ),
        HotTrend(
            5, R.drawable.ic_cauthehuc, "The Huc Bridge", "Ha Noi, Viet Nam", "200$", 1,
            isFavorite = false,
            isBookMark = false,
            description = ""
        ),
        HotTrend(
            6, R.drawable.ic_chuakeo, "Chua Keo Pagoda", "Thai Binh, Viet Nam", "300$", 2,
            isFavorite = false,
            isBookMark = true,
            description = ""
        ),
        HotTrend(
            7, R.drawable.ic_nhatho_thaibinh, "Thai Binh Church", "Thai Binh, Viet Nam", "250$", 2,
            isFavorite = false,
            isBookMark = true,
            description = ""
        ),
        HotTrend(
            8, R.drawable.ic_tuongdai_bacho, "Bac Ho Monument", "Thai Binh, Viet Nam", "140$", 2,
            isFavorite = false,
            isBookMark = true,
            description = ""
        ),
        HotTrend(
            9, R.drawable.ic_catba, "Cat Ba Beach", "Hai Phong, Viet Nam", "300$", 4,
            isFavorite = false,
            isBookMark = true,
            description = ""
        ),
        HotTrend(10, R.drawable.ic_dienchau, "Dien Chau City", "Nghe An, Viet Nam", "320$", 5,
            isFavorite = false,
            isBookMark = true,
            description = ""
        ),
        HotTrend(
            11, R.drawable.ic_doluong, "Do Luong", "Nghe An, Viet Nam", "600$", 5,
            isFavorite = false,
            isBookMark = true,
            description = ""
        ),
        HotTrend(
            12, R.drawable.ic_chobenthanh, "Ben Thanh Maket", "Ho Chi Minh, Viet Nam", "600$", 6,
            isFavorite = false,
            isBookMark = true,
            description = ""
        ),
    )

    val listProvince = mutableListOf(
        Province(1, R.drawable.ic_hanoi, "Ha Noi", "The country's capital has many historical monuments"),
        Province(2, R.drawable.ic_thaibinh, "Thai Binh", "The country's capital has many historical monuments"),
        Province(3,R.drawable.ic_quangninh, "Quang Ninh", "The country's capital has many historical monuments"),
        Province(4, R.drawable.ic_haiphong, "Hai Phong", "The country's capital has many historical monuments"),
        Province(5, R.drawable.ic_nghean, "Nghe An", "The country's capital has many historical monuments"),
        Province(6, R.drawable.ic_hochiminh, "Ho Chi Minh", "The country's capital has many historical monuments")
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