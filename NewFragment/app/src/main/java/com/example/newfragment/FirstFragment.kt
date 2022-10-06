package com.example.newfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import android.widget.EditText


class FirstFragment : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val buttonFragment = view.findViewById<Button>(R.id.button_next)
        buttonFragment.setOnClickListener {
            val textInfo = view.findViewById<EditText>(R.id.editext_info).text.toString()

            parentFragmentManager.beginTransaction()
                .add(R.id.fragment_container_view, SecondFragment.newInstance(textInfo, 10))
                .addToBackStack(null)
                .commit()
        }
    }
}