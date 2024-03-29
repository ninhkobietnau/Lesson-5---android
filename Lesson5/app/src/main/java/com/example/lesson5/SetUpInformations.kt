package com.example.lesson5

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.design_card_view.view.*

class SetUpInformations(val Items:ArrayList<Informations>, val Context:Context):RecyclerView.Adapter<StudentHolder>(){
    override fun getItemCount(): Int {
        return Items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentHolder {
        return StudentHolder(LayoutInflater.from(Context).inflate(R.layout.design_card_view,parent,false))
    }

    override fun onBindViewHolder(holder: StudentHolder, position: Int) {
        val informations:Informations = Items.get(position)
        holder.name.text = informations.name
        holder.age.text = informations.age
        holder.sdt.text = informations.sdt
    }
}


class StudentHolder(view:View):RecyclerView.ViewHolder(view){
    val name = view.name
    val age = view.age
    val sdt = view.sdt
}