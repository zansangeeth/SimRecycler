package com.zasa.simrecycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 **@Project -> SimRecycler
 **@Author -> Sangeeth on 8/4/2022
 */
class CustomAdapter(private val list: List<ItemViewModel>) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    //create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        // inflate the card view to new view
        // holding the list of items
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_item_view, parent, false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemViewModel = list[position]
        holder.image.setImageResource(itemViewModel.image)
        holder.title.text = itemViewModel.text
    }

    override fun getItemCount() = list.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val image: ImageView = itemView.findViewById(R.id.ivSim)
        val title: TextView = itemView.findViewById(R.id.tvSim)
    }

}
