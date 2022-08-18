package com.example.alcoolgasolina

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

private lateinit var txtAlcool: TextView
private lateinit var txtGasolina: TextView
private lateinit var txtResultado: TextView
private lateinit var btnCalcular: Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtAlcool = findViewById(R.id.txtPreco_Alcool);
        txtGasolina = findViewById(R.id.txtPreco_Gasolina)
        txtResultado = findViewById(R.id.txtView_Result)
        btnCalcular = findViewById(R.id.button_Calc)

        btnCalcular.setOnClickListener {
            calc()
        }
    }
    fun calc() {
        val alcoolPrice = txtAlcool.text.toString()
        val gasolinaPrice = txtGasolina.text.toString()

        val result: Boolean = check(alcoolPrice, gasolinaPrice)

        if (result) {
            var alcoolValue = alcoolPrice.toDouble()
            var gasolinaValue = gasolinaPrice.toDouble()
            var finalResult = alcoolValue / gasolinaValue

            if (finalResult <= 0.7) {
                txtResultado.text = "Melhor utilizar: Álcool"
            } else {
                txtResultado.text = "Melhor utilizar: Gasolina"
            }
        } else {
            txtResultado.text = "preencha os preços primeiro"
        }
    }
    fun check(pAlccol: String, pGasolina: String): Boolean {
        var result: Boolean = true

        if (pAlccol == null || pAlccol == "") {
            result = false
        } else if (pGasolina == null || pGasolina == "") {
            result = false
        }
        return result
    }
}