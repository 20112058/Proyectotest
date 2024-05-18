package com.example.proyectotest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectotest.Model.ContactoModel
import com.example.proyectotest.adapter.ContactoAdapter

class ContactosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contactos)

        val rvContactos: RecyclerView = findViewById(R.id.rvContactos)

        rvContactos.layoutManager = LinearLayoutManager(this)
        rvContactos.adapter = ContactoAdapter(ContactoList())
    }

        private fun ContactoList(): List<ContactoModel>{
            val lstContact: ArrayList<ContactoModel> = ArrayList()

            lstContact.add(
                ContactoModel(1, R.drawable.fotoperfil
                    , "Daniel Alvarez"
                    , "999999999"
                    , "daniel@mail.com"
                    )
            )

            lstContact.add(
                ContactoModel(2, R.drawable.fotoperfil
                    , "Jonathan Vasquez"
                    , "888888888"
                    , "jvasquez@mail.com"
                    )
            )

            lstContact.add(
                ContactoModel(3, R.drawable.fotoperfil
                    , "Luis Martinez"
                    , "777777777"
                    , "lmartinez@mail.com"
                    )
            )

            return lstContact

        }

}