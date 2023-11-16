package com.mtg.speedtest.speedcheck.internet.booking.home_screen

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mtg.speedtest.speedcheck.internet.booking.databinding.ItemHotTrendHomeBinding
import com.mtg.speedtest.speedcheck.internet.booking.model.HotTrend

class HotTrendAdapter(
    private val listHotTrend: MutableList<HotTrend>,
    val clickListener: (HotTrend, Int) -> Unit
) :
    RecyclerView.Adapter<HotTrendAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemHotTrendHomeBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemHotTrendHomeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            with(listHotTrend[position]) {
                binding.imvHotTrend.setImageResource(this.imageHotTrend)
                binding.tvNameHotTrend.text = this.nameHotTrend
                binding.tvAddressHotTrend.text = this.addressHotTrend
                binding.tvPriceHotTrend.text = this.priceHotTrend
            }
        }
    }

    override fun getItemCount(): Int {
        return listHotTrend.size
    }


}