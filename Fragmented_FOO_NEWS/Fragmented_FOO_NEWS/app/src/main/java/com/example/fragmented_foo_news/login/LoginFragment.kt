package com.example.fragmented_foo_news.login

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import android.content.SharedPreferences
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.fragmented_foo_news.MainActivity
import com.example.fragmented_foo_news.R

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        (activity as MainActivity).supportActionBar?.title = "Login"

        val view = inflater.inflate(R.layout.fragment_login, container, false)

        val login_btn = view.findViewById<Button>(R.id.login_btn)
        val username = view.findViewById<EditText>(R.id.username_tf)
        val pass = view.findViewById<EditText>(R.id.pass_tf)

        login_btn.setOnClickListener{ buttonView ->
            if(pass.text.toString() == "foo123" && username.text.toString() == "foo"){
            /*  editor.putString("username", username.text.toString()).apply()
                editor.putString("password", pass.text.toString()).apply() */
                Navigation.findNavController(buttonView).navigate(R.id.action_loginFragment2_to_homeFragment3)
            }else{
                username.setText("")
                pass.setText("")
                Toast.makeText(
                    activity,
                    "invalid username or password",
                    Toast.LENGTH_LONG
                ).show()
            }
        }

        return view
    }

    /*
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.login_btn).setOnClickListener{ buttonView ->
            Navigation.findNavController(buttonView).navigate(R.id.action_startFragment_to_loginFragment)
        }
    }*/

}