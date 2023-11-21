package com.mtg.speedtest.speedcheck.internet.booking

import com.mtg.speedtest.speedcheck.internet.booking.model.HotTrend
import com.mtg.speedtest.speedcheck.internet.booking.model.Province

class SingletonClass private constructor() {

    // Some properties or methods can be added here
    var listHotTrend = mutableListOf(
        HotTrend(
            0, R.drawable.ic_yentu, "Yen Tu Pagoda", "Quang Ninh, Viet Nam", 3,
            isFavorite = false,
            isBookMark = false,
            description = R.string.description_yentu,
            rating = 3f,
            latitude = 21.160290f,
            longitude = 105.957740f,
        ),
        HotTrend(
            1, R.drawable.ic_vinhhalong, "Ha Long Bay", "Quang Ninh, Viet Nam", 3,
            isFavorite = false,
            isBookMark = false,
            description = R.string.description_halong,
            rating = 4f,
            latitude = 20.876740f,
            longitude = 107.201260f,
        ),
        HotTrend(
            2, R.drawable.ic_baotangq_quangninh, "Quang Ninh Museum", "Quang Ninh, Viet Nam", 3,
            isFavorite = false,
            isBookMark = false,
            description = R.string.description_baotang_quangninh,
            rating = 5f,
            latitude = 20.950950f,
            longitude = 107.083620f,
        ),
        HotTrend(
            3, R.drawable.ic_hotay, "Ho Tay Lake", "Ha Noi, Viet Nam", 1,
            isFavorite = false,
            isBookMark = false,
            description = R.string.description_hotay,
            rating = 4.5f,
            latitude = 21.069450f,
            longitude = 105.810850f
        ),
        HotTrend(
            4, R.drawable.ic_hoguom, "Ho Guom Lake", "Ha Noi, Viet Nam", 1,
            isFavorite = false,
            isBookMark = false,
            description = R.string.description_hoguom,
            rating = 2f,
            latitude = 21.027266f,
            longitude = 105.85545f
        ),
        HotTrend(
            5, R.drawable.ic_cauthehuc, "The Huc Bridge", "Ha Noi, Viet Nam", 1,
            isFavorite = false,
            isBookMark = false,
            description = R.string.description_thehuc,
            rating = 5f,
            latitude = 21.027266f,
            longitude = 105.85545f
        ),
        HotTrend(
            6, R.drawable.ic_chuakeo, "Chua Keo Pagoda", "Thai Binh, Viet Nam", 2,
            isFavorite = false,
            isBookMark = false,
            description = R.string.description_chuakeo,
            rating = 3.5f,
            latitude = 20.36081f,
            longitude = 106.29718f
        ),
        HotTrend(
            7, R.drawable.ic_nhatho_thaibinh, "Thai Binh Church", "Thai Binh, Viet Nam", 2,
            isFavorite = false,
            isBookMark = false,
            description = R.string.description_nhatho_thaibinh,
            rating = 4f,
            latitude = 20.45f,
            longitude = 106.34002f
        ),
        HotTrend(
            8, R.drawable.ic_tuongdai_bacho, "Bac Ho Monument", "Thai Binh, Viet Nam", 2,
            isFavorite = false,
            isBookMark = false,
            description = R.string.description_tuongdai_bacho,
            rating = 3.5f,
            latitude = 20.45f,
            longitude = 106.34002f
        ),
        HotTrend(
            9, R.drawable.ic_catba, "Cat Ba Beach", "Hai Phong, Viet Nam", 4,
            isFavorite = false,
            isBookMark = false,
            description = R.string.description_catba,
            rating = 3f,
            latitude = 20.8f,
            longitude = 106.99972f
        ),
        HotTrend(
            10, R.drawable.ic_dienchau, "Dien Chau City", "Nghe An, Viet Nam", 5,
            isFavorite = false,
            isBookMark = false,
            description = R.string.description_dienchau,
            rating = 4.5f,
            latitude = 19.01796f,
            longitude = 105.57088f
        ),
        HotTrend(
            11, R.drawable.ic_doluong, "Do Luong", "Nghe An, Viet Nam", 5,
            isFavorite = false,
            isBookMark = false,
            description = R.string.description_doluong,
            rating = 3f,
            latitude = 18.89259000f,
            longitude = 105.34027000f
        ),
        HotTrend(
            13, R.drawable.ic_phongnha_kebang, "Phong Nha Ke Bang", "Quang Binh, Viet Nam", 6,
            isFavorite = false,
            isBookMark = false,
            description = R.string.description_phongnha_kebang,
            rating = 4.2f,
            latitude = 17.535664f,
            longitude = 106.15074f
        ),
        HotTrend(
            12, R.drawable.ic_chobenthanh, "Ben Thanh Maket", "Ho Chi Minh, Viet Nam", 7,
            isFavorite = false,
            isBookMark = false,
            description = R.string.description_benthanh,
            rating = 3f,
            latitude = 10.770496f,
            longitude = 106.692330f
        ),
        HotTrend(
            14, R.drawable.ic_dinhdoclap, "Dinh Doc Lap", "Ho Chi Minh, Viet Nam", 7,
            isFavorite = false,
            isBookMark = false,
            description = R.string.description_dinhdoclap,
            rating = 5f,
            latitude = 10.772830f,
            longitude = 106.69049f
        ),
    )

    val listProvince = mutableListOf(
        Province(1, R.drawable.ic_hanoi, "Ha Noi", R.string.description_hanoi),
        Province(2, R.drawable.ic_thaibinh, "Thai Binh", R.string.description_thaibinh),
        Province(3, R.drawable.ic_quangninh, "Quang Ninh", R.string.description_quangninh),
        Province(4, R.drawable.ic_haiphong, "Hai Phong", R.string.description_haiphong),
        Province(5, R.drawable.ic_nghean, "Nghe An", R.string.description_nghean),
        Province(6, R.drawable.ic_quangbinh, "Quang Binh", R.string.description_quangbinh),
        Province(7, R.drawable.ic_hochiminh, "Ho Chi Minh", R.string.description_hochiminh),
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