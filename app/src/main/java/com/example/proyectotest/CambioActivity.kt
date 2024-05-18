package com.example.proyectotest

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CambioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cambio)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val etTipoCambio: EditText = findViewById(R.id.etTipoCambio)
        val etMontoDolar: EditText = findViewById(R.id.etMontoDolar)
        val btCalcular: Button = findViewById(R.id.btCalcular)
        val tvResultadoSoles = findViewById<TextView>(R.id.tvResultadoSoles)

        btCalcular.setOnClickListener {
            val tipoCambio = etTipoCambio.text.toString().toDoubleOrNull()
            val montoDolar = etMontoDolar.text.toString().toDoubleOrNull()

            if (tipoCambio != null && montoDolar != null) {
                val resultado = tipoCambio * montoDolar

                tvResultadoSoles.text = resultado.toString()
            } else {
                tvResultadoSoles.text = getString(R.string.error_message)
            }
        }

    }
}