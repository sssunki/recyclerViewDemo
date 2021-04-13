package com.example.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object manager {
        lateinit var textOutside: TextView
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textOutside = text_outside
        var dataSet = ArrayList<String>();
        dataSet.add("hmc1")
        dataSet.add("hmc2")
        dataSet.add("hmc3")
        dataSet.add("hmc4")
        dataSet.add("hmc5")
        Log.e("hello", "${dataSet.size}")
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = TestAdapter(dataSet)
    }
}