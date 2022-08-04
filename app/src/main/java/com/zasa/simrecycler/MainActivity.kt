package com.zasa.simrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //getting the recyclerview
        val recyclerView: RecyclerView = findViewById(R.id.rvSim)

        //create vertical linear layout manager
        recyclerView.layoutManager = LinearLayoutManager(this)

        //create array for texts
        val data = ArrayList<ItemViewModel>()

        // adding data to array
        for (i in 1..20) {
            data.add(ItemViewModel(R.drawable.ic_launcher_foreground, "item $i"))
        }

        // pass data array list to adapter
        val adapter = CustomAdapter(data)

        //setting adapter with recycler view
        recyclerView.adapter = adapter
    }

}