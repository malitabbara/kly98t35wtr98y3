package com.example.fragmented_foo_news

import android.widget.EditText

interface Communicator {
    fun passTitleCom(textView: String)
    fun passDateCom(textView: String)
    fun passDescCom(textView: String)
}