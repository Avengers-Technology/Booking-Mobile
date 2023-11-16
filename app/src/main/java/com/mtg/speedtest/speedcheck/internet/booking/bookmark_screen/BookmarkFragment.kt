package com.mtg.speedtest.speedcheck.internet.booking.bookmark_screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mtg.speedtest.speedcheck.internet.booking.SingletonClass
import com.mtg.speedtest.speedcheck.internet.booking.databinding.FragmentBookmarkBinding
import com.mtg.speedtest.speedcheck.internet.booking.model.HotTrend

class BookmarkFragment : Fragment() {
    companion object {
        private val TAG = BookmarkFragment::class.java.simpleName
    }

    private lateinit var binding: FragmentBookmarkBinding
    private lateinit var bookmarkAdapter: BookmarkAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentBookmarkBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private fun initViews() {
        bookmarkAdapter = BookmarkAdapter(SingletonClass.getInstance().listHotTrend.filter { it.isBookMark } as MutableList<HotTrend>) { _, _ ->

        }
        val layoutManagerProvince: RecyclerView.LayoutManager =
            LinearLayoutManager(this.activity, LinearLayoutManager.VERTICAL, false)
        binding.revBookmark.layoutManager = layoutManagerProvince
        binding.revBookmark.adapter = bookmarkAdapter
    }
}