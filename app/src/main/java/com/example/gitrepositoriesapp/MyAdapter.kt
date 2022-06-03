package com.example.gitrepositoriesapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView

class MyAdapter( val dataModels: MutableList<DataModels>) : RecyclerView.Adapter<MyViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        return holder.bind(dataModels[position])
    }

    override fun getItemCount(): Int {
        return dataModels.size
    }
}
class MyViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val id: TextView = itemView.findViewById(R.id.tvId)
    val name: TextView = itemView.findViewById(R.id.tvName)
    val login: TextView = itemView.findViewById(R.id.tvLogin)
    val desc: TextView = itemView.findViewById(R.id.tvDesc)

    fun bind(dataModels: DataModels){
        id.text = dataModels.id
        name.text = dataModels.name
        login.text = dataModels.owners.login
        desc.text = dataModels.description
    }
}