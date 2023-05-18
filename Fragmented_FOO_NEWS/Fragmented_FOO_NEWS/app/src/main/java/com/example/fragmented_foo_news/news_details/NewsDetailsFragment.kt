package com.example.fragmented_foo_news.news_details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.fragmented_foo_news.MainActivity
import com.example.fragmented_foo_news.R

class NewsDetailsFragment : Fragment() {

    var title: String? = ""
    var date: String? = ""
    var description: String? = ""

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_news_details, container, false)
        (activity as MainActivity).supportActionBar?.title = "News Details"

        title = arguments?.getString("title")
        date = arguments?.getString("date")
        description = arguments?.getString("description")

        view.findViewById<TextView>(R.id.title2_tv).text = title
        view.findViewById<TextView>(R.id.date2_tv).text = date
        view.findViewById<TextView>(R.id.description2_tv).text = description

        return view
    }

}