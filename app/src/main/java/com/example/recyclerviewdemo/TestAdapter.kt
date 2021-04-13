package com.example.recyclerviewdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TestAdapter(val dataSet: ArrayList<String>) : RecyclerView.Adapter<TestAdapter.TestViewHolder>() {

    inner class TestViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var buttonChoose: Button
        lateinit var textInside: TextView
        init {
            buttonChoose = itemView.findViewById(R.id.button_choose)
            textInside = itemView.findViewById(R.id.text_inside)
        }
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun onBindViewHolder(holder: TestViewHolder, position: Int) {
        holder.buttonChoose.setOnClickListener {
            MainActivity.manager.textOutside.text = dataSet[position]
        }
        holder.textInside.text = dataSet[position]
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestViewHolder {
        return TestViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.test_item, parent, false))
    }
}