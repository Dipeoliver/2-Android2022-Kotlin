package com.example.caraoucoroa

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import java.util.*

private lateinit var imageButtonJogar: ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageButtonJogar = findViewById(R.id.imageButton_Jogar)

        imageButtonJogar.setOnClickListener() {
            val numero = Random().nextInt(2)
            val intent = Intent(applicationContext, ResultadoActivity::class.java)
            intent.putExtra("randon", numero)
            startActivity(intent)
        }
    }
}