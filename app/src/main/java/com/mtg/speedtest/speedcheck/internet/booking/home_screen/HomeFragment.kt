package com.mtg.speedtest.speedcheck.internet.booking.home_screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mtg.speedtest.speedcheck.internet.booking.R
import com.mtg.speedtest.speedcheck.internet.booking.SingletonClass
import com.mtg.speedtest.speedcheck.internet.booking.databinding.FragmentHomeBinding
import com.mtg.speedtest.speedcheck.internet.booking.model.HotTrend
import com.mtg.speedtest.speedcheck.internet.booking.model.Province

class HomeFragment : Fragment() {
    companion object {
        private val TAG = HomeFragment::class.java.simpleName
    }

    private lateinit var binding: FragmentHomeBinding
    private lateinit var provinceAdapter: ProvinceAdapter
    private lateinit var hotTrendAdapter: HotTrendAdapter
    private lateinit var listHotTrendFake: MutableList<HotTrend>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initData()
        initViews()
    }

    private fun initData() {

        listHotTrendFake = mutableListOf()
        listHotTrendFake.add(
            HotTrend(
                0, R.drawable.ic_yentu, "Yen Tu Pagoda", "Quang Ninh, Viet Nam", "$100", 3,
                isFavorite = false,
                isBookMark = false,
                description = ""
            )
        )
        listHotTrendFake.add(
            HotTrend(
                1, R.drawable.ic_hotay, "Ho Tay Lake", "Ha Noi, Viet Nam", "200$", 1,
                isFavorite = false,
                isBookMark = false,
                description = ""
            )
        )
        listHotTrendFake.add(
            HotTrend(
                2, R.drawable.ic_hoguom, "Ho Guom Lake", "Ha Noi, Viet Nam", "200$", 1,
                isFavorite = false,
                isBookMark = false,
                description = ""
            )
        )
        listHotTrendFake.add(
            HotTrend(
                3, R.drawable.ic_catba, "Cat Ba Beach", "Hai Phong, Viet Nam", "300$", 4,
                isFavorite = false,
                isBookMark = false,
                description = ""
            )
        )
        listHotTrendFake.add(
            HotTrend(
                4, R.drawable.ic_chuakeo, "Chua Keo Pagoda", "Thai Binh, Viet Nam", "600$", 2,
                isFavorite = false,
                isBookMark = false,
                description = ""
            )
        )

    }

    private fun initViews() {
        provinceAdapter = ProvinceAdapter(SingletonClass.getInstance().listProvince) { _, _ ->

        }
        val layoutManagerProvince: RecyclerView.LayoutManager =
            LinearLayoutManager(this.activity, LinearLayoutManager.HORIZONTAL, false)
        binding.revProvinceHome.layoutManager = layoutManagerProvince
        binding.revProvinceHome.adapter = provinceAdapter


        hotTrendAdapter = HotTrendAdapter(listHotTrendFake) { _, _ ->

        }
        val layoutManagerHotTrend: RecyclerView.LayoutManager = LinearLayoutManager(this.activity, LinearLayoutManager.VERTICAL, false)
        binding.revHotTrend.layoutManager = layoutManagerHotTrend
        binding.revHotTrend.adapter = hotTrendAdapter
    }
}