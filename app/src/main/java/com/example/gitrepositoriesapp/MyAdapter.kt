package com.example.gitrepositoriesapp

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.MenuView

import androidx.recyclerview.widget.RecyclerView

class MyAdapter( var date: MutableList<dataModels>) : RecyclerView.Adapter<MyViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent,false)
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
    private var id: TextView = itemView.findViewById(R.id.tvId)
    private var name: TextView = itemView.findViewById(R.id.tvName)
    private var login: TextView = itemView.findViewById(R.id.tvLogin)
    private var desc: TextView = itemView.findViewById(R.id.tvDesc)

    fun bind(dataModels: dataModels){
        id.text = dataModels.id
        name.text = dataModels.name
        login.text = dataModels.owner.login
        desc.text = dataModels.description
        itemView.setOnClickListener{
            Log.d("АРААААА", "Проверяем создание говна ${dataModels.url}")
        }

    }
}