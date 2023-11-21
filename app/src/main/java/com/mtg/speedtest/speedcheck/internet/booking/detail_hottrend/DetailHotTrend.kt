package com.mtg.speedtest.speedcheck.internet.booking.detail_hottrend

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.mtg.speedtest.speedcheck.internet.booking.R
import com.mtg.speedtest.speedcheck.internet.booking.SingletonClass
import com.mtg.speedtest.speedcheck.internet.booking.databinding.ActDetailHottrendBinding
import com.mtg.speedtest.speedcheck.internet.booking.model.HotTrend

class DetailHotTrend : AppCompatActivity(), OnMapReadyCallback {
    private lateinit var binding: ActDetailHottrendBinding
    private lateinit var hotTrend: HotTrend
    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActDetailHottrendBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initMaps()
        initViews()
        initEvents()
    }

    private fun initMaps() {
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager.findFragmentById(R.id.mapHotTrendDetail) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    private fun initEvents() {
        binding.imvBack.setOnClickListener {
            finish()
        }

        binding.imvFavoriteHotTrendDetail.setOnClickListener {
            if (hotTrend.isFavorite) {
                hotTrend.isFavorite = false
                SingletonClass.getInstance().listHotTrend[hotTrend.idHotTrend].isFavorite = false
                binding.imvFavoriteHotTrendDetail.setImageResource(R.drawable.ic_favorite_deactivate)
            } else {
                hotTrend.isFavorite = true
                SingletonClass.getInstance().listHotTrend[hotTrend.idHotTrend].isFavorite = true
                binding.imvFavoriteHotTrendDetail.setImageResource(R.drawable.ic_favorite_active)
            }
        }

        binding.imvBookmarkHotTrendDetail.setOnClickListener {
            if (hotTrend.isBookMark) {
                hotTrend.isBookMark = false
                SingletonClass.getInstance().listHotTrend[hotTrend.idHotTrend].isBookMark = false
                binding.imvBookmarkHotTrendDetail.setImageResource(R.drawable.ic_bookmark_deactivate)
            } else {
                hotTrend.isBookMark = true
                SingletonClass.getInstance().listHotTrend[hotTrend.idHotTrend].isBookMark = true
                binding.imvBookmarkHotTrendDetail.setImageResource(R.drawable.ic_bookmark_active)
            }
        }



    }

    private fun initViews() {
        hotTrend = intent.getSerializableExtra("key_detail_hotTrend") as HotTrend
        binding.imvHotTrendDetail.setImageResource(hotTrend.imageHotTrend)
        binding.tvNameHotTrendDetail.text = hotTrend.nameHotTrend
        binding.tvDescriptionHotTrendDetail.text = resources.getString(hotTrend.description)
        binding.ratingBarHotTrendDetail.rating = hotTrend.rating

        if (hotTrend.isFavorite) {
            binding.imvFavoriteHotTrendDetail.setImageResource(R.drawable.ic_favorite_active)
        } else {
            binding.imvFavoriteHotTrendDetail.setImageResource(R.drawable.ic_favorite_deactivate)
        }

        if (hotTrend.isBookMark) {
            binding.imvBookmarkHotTrendDetail.setImageResource(R.drawable.ic_bookmark_active)
        } else {
            binding.imvBookmarkHotTrendDetail.setImageResource(R.drawable.ic_bookmark_deactivate)
        }
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker and move the camera to a location
        val location = LatLng(hotTrend.latitude.toDouble(), hotTrend.longitude.toDouble())
        mMap.addMarker(location, "Marker in ${hotTrend.nameHotTrend}")
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location, 18f))
    }

    // Extension function to add a marker
    private fun GoogleMap.addMarker(location: LatLng, title: String) {
        addMarker(com.google.android.gms.maps.model.MarkerOptions().position(location).title(title))
    }
}