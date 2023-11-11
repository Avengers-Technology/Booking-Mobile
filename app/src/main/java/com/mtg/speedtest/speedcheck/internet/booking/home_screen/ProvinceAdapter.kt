package com.mtg.speedtest.speedcheck.internet.booking.home_screen

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mtg.speedtest.speedcheck.internet.booking.databinding.ItemProvinceHomeBinding
import com.mtg.speedtest.speedcheck.internet.booking.model.Province

class ProvinceAdapter(
    private val listProvince: MutableList<Province>,
    val clickListener: (Province, Int) -> Unit
) :
    RecyclerView.Adapter<ProvinceAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemProvinceHomeBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemProvinceHomeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            with(listProvince[position]) {

            }
        }
    }

    override fun getItemCount(): Int {
        return listProvince.size
    }


}