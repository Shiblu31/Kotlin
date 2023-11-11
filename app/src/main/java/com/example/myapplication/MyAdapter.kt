package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(var context: Context,val list:ArrayList<Subject>):RecyclerView.Adapter<MyAdapter.MyHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val view= LayoutInflater.from(context).inflate(R.layout.object_item,parent,false)
        return MyHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        val data =list[position]
        val i= 0..list.size
        holder.subject.text = "data.item_$i"

    }
    inner class MyHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        val subject= itemView.findViewById<TextView>(R.id.tvObj)


    }
}