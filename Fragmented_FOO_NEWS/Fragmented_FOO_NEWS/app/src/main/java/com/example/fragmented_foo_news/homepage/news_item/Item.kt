package com.example.fragmented_foo_news.homepage.news_item

class Item (
    val title: String,
    val description: String,
    val date: String,
    val id: Int,
){
    val imageURL = "https://picsum.photos/120?random=$id"
}