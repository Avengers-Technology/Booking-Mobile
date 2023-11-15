package com.mtg.speedtest.speedcheck.internet.booking.profile_screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mtg.speedtest.speedcheck.internet.booking.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {
    companion object {
        private val TAG = ProfileFragment::class.java.simpleName
    }

    private lateinit var binding: FragmentProfileBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
        initEvents()
    }

    private fun initEvents() {
        binding.tvLogoutProfile.setOnClickListener {
            requireActivity().finish()
        }

        binding.tvUpdateProfile.setOnClickListener {

        }
    }

    private fun initViews() {

    }
}