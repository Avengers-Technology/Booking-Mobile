package com.mtg.speedtest.speedcheck.internet.booking

import com.mtg.speedtest.speedcheck.internet.booking.model.HotTrend
import com.mtg.speedtest.speedcheck.internet.booking.model.Province

class SingletonClass private constructor() {

    // Some properties or methods can be added here
    var listHotTrend = mutableListOf(
        HotTrend(
            0, R.drawable.ic_yentu, "Yen Tu Pagoda", "Quang Ninh, Viet Nam",3,
            isFavorite = true,
            isBookMark = false,
            description = ""
        ),
        HotTrend(
            1, R.drawable.ic_vinhhalong, "Ha Long Bay", "Quang Ninh, Viet Nam",3,
            isFavorite = true,
            isBookMark = false,
            description = ""
        ),
        HotTrend(
            2, R.drawable.ic_baotangq_quangninh, "Quang Ninh Museum", "Quang Ninh, Viet Nam",3,
            isFavorite = true,
            isBookMark = false,
            description = ""
        ),
        HotTrend(
            3, R.drawable.ic_hotay, "Ho Tay Lake", "Ha Noi, Viet Nam",1,
            isFavorite = false,
            isBookMark = false,
            description = ""
        ),
        HotTrend(
            4, R.drawable.ic_hoguom, "Ho Guom Lake", "Ha Noi, Viet Nam",1,
            isFavorite = false,
            isBookMark = false,
            description = ""
        ),
        HotTrend(
            5, R.drawable.ic_cauthehuc, "The Huc Bridge", "Ha Noi, Viet Nam",1,
            isFavorite = false,
            isBookMark = false,
            description = ""
        ),
        HotTrend(
            6, R.drawable.ic_chuakeo, "Chua Keo Pagoda", "Thai Binh, Viet Nam",2,
            isFavorite = false,
            isBookMark = true,
            description = ""
        ),
        HotTrend(
            7, R.drawable.ic_nhatho_thaibinh, "Thai Binh Church", "Thai Binh, Viet Nam",2,
            isFavorite = false,
            isBookMark = true,
            description = ""
        ),
        HotTrend(
            8, R.drawable.ic_tuongdai_bacho, "Bac Ho Monument", "Thai Binh, Viet Nam",2,
            isFavorite = false,
            isBookMark = true,
            description = ""
        ),
        HotTrend(
            9, R.drawable.ic_catba, "Cat Ba Beach", "Hai Phong, Viet Nam",4,
            isFavorite = false,
            isBookMark = true,
            description = ""
        ),
        HotTrend(10, R.drawable.ic_dienchau, "Dien Chau City", "Nghe An, Viet Nam",5,
            isFavorite = false,
            isBookMark = true,
            description = ""
        ),
        HotTrend(
            11, R.drawable.ic_doluong, "Do Luong", "Nghe An, Viet Nam",5,
            isFavorite = false,
            isBookMark = true,
            description = ""
        ),
        HotTrend(
            12, R.drawable.ic_chobenthanh, "Ben Thanh Maket", "Ho Chi Minh, Viet Nam",6,
            isFavorite = false,
            isBookMark = true,
            description = ""
        ),
    )

    val listProvince = mutableListOf(
        Province(1, R.drawable.ic_hanoi, "Ha Noi", R.string.description_hanoi),
        Province(2, R.drawable.ic_thaibinh, "Thai Binh", R.string.description_thaibinh),
        Province(3,R.drawable.ic_quangninh, "Quang Ninh",R.string.description_quangninh),
        Province(4, R.drawable.ic_haiphong, "Hai Phong", R.string.description_haiphong),
        Province(5, R.drawable.ic_nghean, "Nghe An", R.string.description_nghean),
        Province(6, R.drawable.ic_hochiminh, "Ho Chi Minh", R.string.description_hochiminh)
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