package com.example.fragmented_foo_news.homepage.news_item

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmented_foo_news.R

class ItemsAdapter: RecyclerView.Adapter<itemViewHolder>() {

    private val mItems = ArrayList<Item>()

    interface OnItemsAdapterListener{
        fun itemClicked(item: Item)
    }

    private var nItemsAdapterListener: OnItemsAdapterListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): itemViewHolder {
        return itemViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_item, parent, false))
    }

    override fun onBindViewHolder(holder: itemViewHolder, position: Int) {
        val item = mItems[position]
        holder.onBind(item)
        holder.itemView.setOnClickListener {
            nItemsAdapterListener?.itemClicked(item)
        }
    }

    override fun getItemCount(): Int {
        return mItems.size
    }

    fun setItems(items: ArrayList<Item>) {
        mItems.clear()
        mItems.addAll(items)
        notifyDataSetChanged()
    }

    fun setItemsAdapterListener(listener: OnItemsAdapterListener){
        nItemsAdapterListener = listener
    }

}