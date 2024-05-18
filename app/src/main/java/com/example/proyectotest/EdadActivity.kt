package com.example.proyectotest

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Date
import java.util.Locale

class EdadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_edad)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val etFechaNac: EditText = findViewById(R.id.etFechaNac)
        val btCalcularDias: Button = findViewById(R.id.btCalcularDias)
        val tvEdadResDias: TextView = findViewById(R.id.tvEdadResDias)

        btCalcularDias.setOnClickListener {
            val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
            val fechaNacStr = etFechaNac.text.toString()
            try {
                val fechaNac = dateFormat.parse(fechaNacStr)
                val fechaActual = Date()

                val diff = fechaActual.time - fechaNac.time
                val diasDeVida = diff / (1000 * 60 * 60 * 24)

                tvEdadResDias.text = diasDeVida.toString()
            } catch (e: Exception) {
                tvEdadResDias.text = "Fecha inválida"
            }
        }
    }
}