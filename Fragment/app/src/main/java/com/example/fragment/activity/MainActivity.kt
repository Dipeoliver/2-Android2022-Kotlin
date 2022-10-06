package com.example.fragment.activity

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.fragment.R
import com.example.fragment.fragment.FragmentContact
import com.example.fragment.fragment.FragmentConversation
import com.example.fragment.fragment.FragmentHome

private lateinit var fragmentHome: Fragment
private lateinit var fragmentContact: Fragment
private lateinit var fragmentConversation: Fragment

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonContact = findViewById<Button>(R.id.button_contact)
        buttonContact.setOnClickListener(this)
        val buttonConversation = findViewById<Button>(R.id.button_conversation)
        buttonConversation.setOnClickListener(this)
        val buttonHome = findViewById<Button>(R.id.button_home)
        buttonHome.setOnClickListener(this)

        fragmentHome = FragmentHome()
        fragmentContact = FragmentContact()
        fragmentConversation = FragmentConversation()

        setFragment(fragmentHome)

    }

    private fun setFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame_fragments, fragment)
        transaction.commit()
    }

    override fun onClick(view: View) {
        when (view.id) {
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