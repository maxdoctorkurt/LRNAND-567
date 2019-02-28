package com.example.lrnand_567

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lrnand_567.list.SimpleListAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val strings = arrayListOf<String>("text1", "tex2", "text3", "sfgtsfgsg", "end")
        val adapter = SimpleListAdapter(strings, this)

        rv_simple_list.layoutManager = LinearLayoutManager(this)
        rv_simple_list.adapter = adapter
    }
}
