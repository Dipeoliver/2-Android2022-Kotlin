package com.example.newfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class SecondFragment : Fragment(R.layout.fragment_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textInfo = arguments?.getString(EXTRA_INFO)
        val textView = view.findViewById<TextView>(R.id.textview_info)
        textView.text = textInfo

        val textInt = arguments?.getInt(EXTRA_NUMBER)
        val txtNumber = view.findViewById<TextView>(R.id.text_view_number)
        txtNumber.text = textInt.toString()

        val button = view.findViewById<AppCompatButton>(R.id.button_previous)
        button.setOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }

    companion object {
        private const val EXTRA_INFO = "extra_info"
        private const val EXTRA_NUMBER = "extra_number"
        fun newInstance(text: String, number: Int): SecondFragment {
            val fragment = SecondFragment()
            val fragment2 = SecondFragment()
            val bundle = Bundle()
            bundle.putString(EXTRA_INFO,text)
            bundle.putInt(EXTRA_NUMBER,number)
            fragment.arguments = bundle
            return fragment
        }
    }
}