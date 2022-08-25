package com.example.calculadoradegorjeta

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.EditText
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

private lateinit var txtValorEntrada: TextInputEditText

private lateinit var txtEntrada: TextView
private lateinit var txtSeekbar: TextView
private lateinit var seekBar: SeekBar
private lateinit var edtGorjeta: EditText
private lateinit var edtResultado: EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtEntrada = findViewById(R.id.txt_ValorEntrada)
        txtSeekbar = findViewById(R.id.txtSeekbar)
        seekBar = findViewById(R.id.seekBar)
        edtGorjeta = findViewById(R.id.edt_Gorjeta)
        edtResultado = findViewById(R.id.edt_Resultado)

        calcListener()
    }

    fun calcListener() {
        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            @SuppressLint()
            override fun onProgressChanged(
                seekBar: SeekBar,
                progressValue: Int,
                fromUser: Boolean
            ) {
                // here, you react to the value being set in seekBar
                if (txtEntrada.text.isNullOrEmpty()) {
                    txtEntrada.text = 0.toString();
                    Toast.makeText(
                        this@MainActivity,
                        "Digitar um valor",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    txtSeekbar.text = "$progressValue%"

                    val valorEntrada = (txtEntrada.text.toString()).toFloat()
                    val valorGorjeta = (valorEntrada * progressValue) / 100
                    val valorFinal = (valorEntrada + valorGorjeta)
                    edtGorjeta.setText(valorGorjeta.toString())
                    edtResultado.setText(valorFinal.toString())
                }
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // you can probably leave this empty
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                // you can probably leave this empty
            }
        })
    }
}