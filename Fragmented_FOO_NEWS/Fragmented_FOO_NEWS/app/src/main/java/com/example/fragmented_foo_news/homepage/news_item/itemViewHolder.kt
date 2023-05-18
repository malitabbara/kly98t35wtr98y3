package com.example.fragmented_foo_news.homepage.news_item

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmented_foo_news.R

class itemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    fun onBind(item: Item){
        itemView.findViewById<TextView>(R.id.title_tv).text = item.title
        itemView.findViewById<TextView>(R.id.date_tv).text = item.date
    }
}