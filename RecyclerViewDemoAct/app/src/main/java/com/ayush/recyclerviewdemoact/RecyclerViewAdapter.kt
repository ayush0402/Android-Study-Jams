package com.ayush.recyclerviewdemoact

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//Create ViewHolder
//Pass ViewHolder to the Adapter
//Call three functions in the Adapter Class

class RecyclerViewAdapter(private val items: ArrayList<String>): RecyclerView.Adapter<RecyclerViewViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewViewHolder {
        //Converting recycler_item xml to View using LayoutInflater
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item,parent,false)
        return RecyclerViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerViewViewHolder, position: Int) {
        val currentItem = items[position]
        holder.titleView.text = currentItem
    }

    override fun getItemCount(): Int {
        return items.size
    }
}

class RecyclerViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    val titleView : TextView = itemView.findViewById(R.id.title)
}