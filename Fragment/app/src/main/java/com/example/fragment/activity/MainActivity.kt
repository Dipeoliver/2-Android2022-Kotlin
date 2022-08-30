package com.example.fragment.activity

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.fragment.R
import com.example.fragment.fragment.fragment_contact
import com.example.fragment.fragment.fragment_conversation
import com.example.fragment.fragment.fragment_home

private lateinit var fragmentHome: Fragment
private lateinit var fragmentContact: Fragment
private lateinit var fragmentConversation: Fragment

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_contact = findViewById<Button>(R.id.button_contact)
        button_contact.setOnClickListener(this)
        val button_conversation = findViewById<Button>(R.id.button_conversation)
        button_conversation.setOnClickListener(this)
        val button_home = findViewById<Button>(R.id.button_home)
        button_home.setOnClickListener(this)

        fragmentHome = fragment_home()
        fragmentContact = fragment_contact()
        fragmentConversation = fragment_conversation()

        setFragment(fragmentHome)

    }

    private fun setFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame_fragments, fragment)
        transaction.commit()
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.button_contact -> {
                setFragment(fragmentContact)
            }
            R.id.button_conversation -> {
                setFragment(fragmentConversation)
            }
            R.id.button_home -> {
                setFragment(fragmentHome)
            }
        }
    }
}