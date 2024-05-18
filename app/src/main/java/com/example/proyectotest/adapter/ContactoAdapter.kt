package com.example.proyectotest.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectotest.Model.ContactoModel
import com.example.proyectotest.R

class ContactoAdapter(private var lstContact: List<ContactoModel>): RecyclerView.Adapter<ContactoAdapter.ViewHolder>() {
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val tvId: TextView = itemView.findViewById(R.id.tvId)
        val ivFoto: ImageView = itemView.findViewById(R.id.ivFoto)
        val tvNombre: TextView = itemView.findViewById(R.id.tvNombre)
        val tvNmbPhone: TextView = itemView.findViewById(R.id.tvNmbPhone)
        val tvCorreoC: TextView = itemView.findViewById(R.id.tvCorreoC)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_contacto, parent, false))
    }

    override fun getItemCount(): Int {
        return lstContact.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemSong = lstContact[position]
        holder.tvId.text = itemSong.id.toString()
        holder.ivFoto.setImageResource(itemSong.image)
        holder.tvNombre.text = itemSong.contactName
        holder.tvNmbPhone.text = itemSong.numberPhone
        holder.tvCorreoC.text  = itemSong.email

    }
}