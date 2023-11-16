package com.mtg.speedtest.speedcheck.internet.booking.detail_province

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mtg.speedtest.speedcheck.internet.booking.SingletonClass
import com.mtg.speedtest.speedcheck.internet.booking.bookmark_screen.BookmarkAdapter
import com.mtg.speedtest.speedcheck.internet.booking.databinding.ActDetailProvinceBinding
import com.mtg.speedtest.speedcheck.internet.booking.model.HotTrend
import com.mtg.speedtest.speedcheck.internet.booking.model.Province

class DetailProvinceAct : AppCompatActivity() {
    private lateinit var binding: ActDetailProvinceBinding
    private lateinit var detailProvinceAdapter: DetailProvinceAdapter
    private lateinit var province: Province

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActDetailProvinceBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
        initEvents()
    }

    private fun initEvents() {
        detailProvinceAdapter = DetailProvinceAdapter(SingletonClass.getInstance().listHotTrend.filter { it.idProvince == province.idProvince } as MutableList<HotTrend>) { _, _ ->

        }
        val layoutManagerProvince: RecyclerView.LayoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.revProvinceDetail.layoutManager = layoutManagerProvince
        binding.revProvinceDetail.adapter = detailProvinceAdapter
    }

    private fun initViews() {
        province = intent.getSerializableExtra("key_detail_province") as Province
        binding.tvNameProvinceDetail.text = province.addressProvince
    }
}