package com.example.lesson5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val informations:ArrayList<Informations> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        informations.add(Informations("Lao Hac","60" , "123"))
        informations.add(Informations("Cau Vang","3" , "132"))
        informations.add(Informations("Ong Giao","30" , "145"))
        informations.add(Informations("John Wick","35" , "999"))
        informations.add(Informations("Hachiko","3" , "892"))

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = SetUpInformations(informations,this)
    }
}