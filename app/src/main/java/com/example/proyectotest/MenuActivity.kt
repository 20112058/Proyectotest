package com.example.proyectotest

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btCambio: Button = findViewById(R.id.btCambio)
        val btEdad: Button = findViewById(R.id.btEdad)
        val btContactos: Button = findViewById(R.id.btContactos)

        btCambio.setOnClickListener {
            val intent = Intent(this, CambioActivity::class.java)
            startActivity(intent)

        }

        btEdad.setOnClickListener {
            val intent = Intent(this, EdadActivity::class.java)
            startActivity(intent)

        }
        btContactos.setOnClickListener {
            val intent = Intent(this, ContactosActivity::class.java)
            startActivity(intent)

        }


    }
}