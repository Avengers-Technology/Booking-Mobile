package com.mtg.speedtest.speedcheck.internet.booking.chat_screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mtg.speedtest.speedcheck.internet.booking.databinding.FragmentChatBinding

class ChatFragment : Fragment() {
    companion object {
        private val TAG = ChatFragment::class.java.simpleName
    }

    private lateinit var binding: FragmentChatBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentChatBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private fun initViews() {

    }
}