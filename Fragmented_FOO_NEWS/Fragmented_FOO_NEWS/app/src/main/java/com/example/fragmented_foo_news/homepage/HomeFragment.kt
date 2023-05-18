package com.example.fragmented_foo_news.homepage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmented_foo_news.Communicator
import com.example.fragmented_foo_news.MainActivity
import com.example.fragmented_foo_news.R
import com.example.fragmented_foo_news.homepage.news_item.Item
import com.example.fragmented_foo_news.homepage.news_item.ItemsAdapter

class HomeFragment : Fragment(), ItemsAdapter.OnItemsAdapterListener  {

    private lateinit var recyclerViewItems: RecyclerView
    private lateinit var communicator: Communicator

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view  = inflater.inflate(R.layout.fragment_home, container, false)
        (activity as MainActivity).supportActionBar?.title = "Home"
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val layoutManager = LinearLayoutManager(context)
        recyclerViewItems = view.findViewById(R.id.recyclerview_items)
        val adapter = ItemsAdapter()
        adapter.setItemsAdapterListener(this)
        recyclerViewItems.layoutManager = LinearLayoutManager((activity as MainActivity), LinearLayoutManager.VERTICAL, false)
        recyclerViewItems.adapter = adapter

        adapter.setItems(arrayListOf(
            Item("News 1", "News Description News Description News Description News Description News Description", "22/03/2020", 92),
            Item("News 2", "News Description News Description News Description News Description News Description", "22/03/2020", 5),
            Item("News 3", "News Description News Description News Description News Description News Description", "22/03/2020", 3),
            Item("News 4", "News Description News Description News Description News Description News Description", "22/03/2020", 41),
            Item("News 5", "News Description News Description News Description News Description News Description", "22/03/2020", 62),
            Item("News 6", "News Description News Description News Description News Description News Description", "22/03/2020", 51),
            Item("News 7", "News Description News Description News Description News Description News Description", "22/03/2020", 17),
            Item("News 8", "News Description News Description News Description News Description News Description", "22/03/2020", 8),
            Item("News 9", "News Description News Description News Description News Description News Description", "22/03/2020", 12),
            Item("News 10", "News Description News Description News Description News Description News Description", "22/03/2020", 9)
        ))

    }

    override fun itemClicked(item: Item) {
        communicator = activity as Communicator
        communicator.passTitleCom(item.title)
        communicator.passDateCom(item.date)
        communicator.passDescCom(item.description)
    }

    /*
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.button_login).setOnClickListener{ buttonView ->
            Navigation.findNavController(buttonView).navigate(R.id.action_loginFragment_to_homeFragment)
        }
    }*/

}