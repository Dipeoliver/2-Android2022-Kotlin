package com.example.calculadoradegorjeta

import android.os.Bundle
import android.widget.AbsSeekBar
import android.widget.SeekBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

private lateinit var txtValorEntrada: TextInputEditText

private lateinit var seekBarw: AbsSeekBar
private lateinit var txtGorjeta: TextView
private lateinit var txtTotal: TextView
private lateinit var txtseekbar: TextView
private val Valor = 0.0


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seekBarw = findViewById(R.id.seekBar)
        txtGorjeta = findViewById(R.id.etxt_Gorjeta)
        txtTotal = findViewById(R.id.etxt_ValorTotal)
        txtseekbar = findViewById(R.id.txt_ValorEntrada)

    }

    fun calcListener() {


//        seekBarw.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
//            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
//                // here, you react to the value being set in seekBar
//            }
//
//            override fun onStartTrackingTouch(seekBar: SeekBar) {
//                // you can probably leave this empty
//            }
//
//            override fun onStopTrackingTouch(seekBar: SeekBar) {
//                // you can probably leave this empty
//            }
//        })
    }

}