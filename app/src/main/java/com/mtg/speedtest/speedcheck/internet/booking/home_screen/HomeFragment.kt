package com.mtg.speedtest.speedcheck.internet.booking.home_screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
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
        listProvinceFake.add(Province(0, "", ""))
        listProvinceFake.add(Province(0, "", ""))
        listProvinceFake.add(Province(0, "", ""))
        listProvinceFake.add(Province(0, "", ""))
        listProvinceFake.add(Province(0, "", ""))

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