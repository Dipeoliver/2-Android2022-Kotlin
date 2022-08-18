package com.example.alertdialog

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

private lateinit var button: Button

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)

        button.setOnClickListener {
            openDialog()
        }
    }

    fun openDialog() {

        // ********   instanciar Objeto
        val dialog = android.app.AlertDialog.Builder(this)

        // ********   configurar o titulo e mensagem
        dialog.setTitle("Titulo da MSG")
        dialog.setMessage("Menssagem da Dialog")

        // (proibrir clicar fora da caixa == false / habilitar == true)
        dialog.setCancelable(false)

        // configurar icone
        dialog.setIcon(android.R.drawable.btn_plus)

        //********   configurar acoes para sim e não
        dialog.setPositiveButton("Sim") { dialogInterface, i ->
            Toast.makeText(
                applicationContext,
                "Executar ação ao clicar no botão SIM",
                Toast.LENGTH_LONG
            ).show()
        }

        dialog.setNegativeButton("Não") { dialogInterface, i ->
            Toast.makeText(
                applicationContext,
                "Executar ação ao clicar no botão Não",
                Toast.LENGTH_SHORT
            ).show()
        }

        // ********   criar e exibir AlertDialog

        // ********   criar e exibir AlertDialog
        dialog.create()
        dialog.show()
    }
}