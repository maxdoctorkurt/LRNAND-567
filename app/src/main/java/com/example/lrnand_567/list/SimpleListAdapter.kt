package com.example.lrnand_567.list

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lrnand_567.R
import kotlinx.android.synthetic.main.simple_list_item.view.*

class SimpleListAdapter(val items : ArrayList<String>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.simple_list_item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvText.text = items[position]
    }

    override fun getItemCount(): Int {
        return items.size
    }
}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    val tvText: TextView = view.tv_just_string
}