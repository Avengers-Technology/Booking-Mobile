package com.mtg.speedtest.speedcheck.internet.booking.home_screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mtg.speedtest.speedcheck.internet.booking.R
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
    private lateinit var listProvinceFake: MutableList<Province>
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
        listProvinceFake = mutableListOf()
        listProvinceFake.add(Province(1, R.drawable.ic_hanoi, "Ha Noi", "The country's capital has many historical monuments"))
        listProvinceFake.add(Province(2, R.drawable.ic_thaibinh, "Thai Binh", "The country's capital has many historical monuments"))
        listProvinceFake.add(Province(3,R.drawable.ic_quangninh, "Quang Ninh", "The country's capital has many historical monuments"))
        listProvinceFake.add(Province(4, R.drawable.ic_haiphong, "Hai Phong", "The country's capital has many historical monuments"))
        listProvinceFake.add(Province(5, R.drawable.ic_nghean, "Nghe An", "The country's capital has many historical monuments"))
        listProvinceFake.add(Province(6, R.drawable.ic_quangbinh, "Quang Binh", "The country's capital has many historical monuments"))
        listProvinceFake.add(Province(7, R.drawable.ic_hochiminh, "Ho Chi Minh", "The country's capital has many historical monuments"))

        listHotTrendFake = mutableListOf()
        listHotTrendFake.add(HotTrend(0, "", "", ""))
        listHotTrendFake.add(HotTrend(0, "", "", ""))
        listHotTrendFake.add(HotTrend(0, "", "", ""))
        listHotTrendFake.add(HotTrend(0, "", "", ""))
        listHotTrendFake.add(HotTrend(0, "", "", ""))

    }

    private fun initViews() {
        provinceAdapter = ProvinceAdapter(listProvinceFake) { _, _ ->

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