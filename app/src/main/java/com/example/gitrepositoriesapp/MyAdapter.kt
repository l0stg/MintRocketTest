package com.example.gitrepositoriesapp

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.MenuView

import androidx.recyclerview.widget.RecyclerView

class MyAdapter( val date: MutableList<dataModels>) : RecyclerView.Adapter<MyViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        return holder.bind(date[position])
    }

    override fun getItemCount(): Int {
        return date.size
    }
}
class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    private val id: TextView = itemView.findViewById(R.id.tvId)
    private val name: TextView = itemView.findViewById(R.id.tvName)
    private val url: TextView = itemView.findViewById(R.id.tvLogin)
    private val desc: TextView = itemView.findViewById(R.id.tvDesc)

    fun bind(dataModels: dataModels){
        id.text = dataModels.id
        name.text = dataModels.name
        url.text = dataModels.url
        desc.text = dataModels.description
        itemView.setOnClickListener{
            Log.d("АРААААА", "Проверяем создание говна ${dataModels.url}")
        }

    }
}