package com.mtg.speedtest.speedcheck.internet.booking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.mtg.speedtest.speedcheck.internet.booking.chat_screen.ChatFragment
import com.mtg.speedtest.speedcheck.internet.booking.favorite_screen.FavoriteFragment
import com.mtg.speedtest.speedcheck.internet.booking.home_screen.HomeFragment
import com.mtg.speedtest.speedcheck.internet.booking.profile_screen.ProfileFragment

class MainAct : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationView

    private val mOnNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.bottomBarHome -> {
                    setCurrentFragment(HomeFragment())
                    return@OnNavigationItemSelectedListener true
                }
                R.id.bottomBarFavorite -> {
                    setCurrentFragment(FavoriteFragment())
                    return@OnNavigationItemSelectedListener true
                }
                R.id.bottomBarChat -> {
                    setCurrentFragment(ChatFragment())
                    return@OnNavigationItemSelectedListener true
                }
                R.id.bottomBarProfile -> {
                    setCurrentFragment(ProfileFragment())
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_main)
        initViews()
        initEvents()
    }

    private fun initEvents() {
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    private fun initViews() {
        bottomNavigationView = findViewById(R.id.bottomNavigation)

        bottomNavigationView.itemIconTintList = null // Disable auto draw color
        setCurrentFragment(HomeFragment())

    }

    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameLayoutContainer, fragment)
            addToBackStack(null)
            commit()
        }
}