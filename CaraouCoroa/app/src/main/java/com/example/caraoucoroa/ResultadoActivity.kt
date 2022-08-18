package com.example.caraoucoroa

import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

private lateinit var imageButtonVoltar: ImageButton
private lateinit var imageViewMoeda: ImageView

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        imageButtonVoltar = findViewById(R.id.imageButton_Voltar)
        imageViewMoeda = findViewById(R.id.imageView_Moeda)

        val dados = intent.extras
        val randon = dados!!.getInt("randon");
        if (randon == 1) {
            imageViewMoeda.setImageResource(R.drawable.moeda_cara)
        } else {
            imageViewMoeda.setImageResource(R.drawable.moeda_coroa)
        }
        imageButtonVoltar.setOnClickListener(View.OnClickListener { finish() })
    }
}