package com.example.fragmented_foo_news

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmented_foo_news.news_details.NewsDetailsFragment

class MainActivity : AppCompatActivity(), Communicator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun passTitleCom(textView: String) {
        val bundle = Bundle()

        bundle.putString("title", textView)

        val transaction = this.supportFragmentManager.beginTransaction()
        val fragmentND = NewsDetailsFragment()
        fragmentND.arguments = bundle

        transaction.replace(R.id.fragmentContainerView,fragmentND)
        transaction.commit()
    }

    override fun passDateCom(textView: String) {
        val bundle = Bundle()

        bundle.putString("date", textView)

        val transaction = this.supportFragmentManager.beginTransaction()
        val fragmentND = NewsDetailsFragment()
        fragmentND.arguments = bundle

        transaction.replace(R.id.fragmentContainerView,fragmentND)
        transaction.commit()
    }

    override fun passDescCom(textView: String) {
        val bundle = Bundle()

        bundle.putString("description", textView)

        val transaction = this.supportFragmentManager.beginTransaction()
        val fragmentND = NewsDetailsFragment()
        fragmentND.arguments = bundle

        transaction.replace(R.id.fragmentContainerView,fragmentND)
        transaction.commit()
    }
}