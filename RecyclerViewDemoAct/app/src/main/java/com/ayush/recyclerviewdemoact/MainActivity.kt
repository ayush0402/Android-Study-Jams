package com.ayush.recyclerviewdemoact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.ayush.recyclerviewdemoact.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //for viewBinding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //inflating layout
        binding = ActivityMainBinding.inflate(layoutInflater)

        //For recyclerView we need
        // Adapter
        //ViewHolder in same class file as Adapter
        //item Layout
        //Layout Manager
        //https://www.youtube.com/watch?v=ttIfesjYDQQ&t=1179s

        //For Layout Manager
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        val items = fetchData()
        val adapter = RecyclerViewAdapter(items)
        binding.recyclerView.adapter = adapter


        setContentView(binding.root)
    }

    private fun fetchData():ArrayList<String>{
        val list = ArrayList<String>()
        for(i in 0 until 100){
            list.add("Item $i")
        }
        return list
    }
}