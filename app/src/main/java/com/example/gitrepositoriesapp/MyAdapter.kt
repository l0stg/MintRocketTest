package com.example.gitrepositoriesapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView

class MyAdapter: RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    var listData = emptyList<DataModels>()


    class MyViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val id: TextView = itemView.findViewById(R.id.tvId)
        val namem: TextView = itemView.findViewById(R.id.tvName)
        val login: TextView = itemView.findViewById(R.id.tvLogin)
        val desc: TextView = itemView.findViewById(R.id.tvDesc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.id.text = listData[position].id
        holder.namem.text = listData[position].name
        holder.login.text = listData[position].owners.login
        holder.desc.text = listData[position].description
    }

    override fun getItemCount(): Int {
        return listData.size
    }
}