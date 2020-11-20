package com.example.ranger

import android.os.Bundle
import android.view.View
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var lst: ListView? = null
    var aircraft = arrayOf("A", "B", "C", "D", "E", "F")
    var imgid = arrayOf(R.drawable.red, R.drawable.green, R.drawable.red, R.drawable.red, R.drawable.red, R.drawable.green)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.title = "Aircraft"
        setContentView(R.layout.activity_main)
        lst = findViewById<View>(R.id.listview) as ListView
        val customListView = CustomListView(this, aircraft, imgid)
        lst!!.adapter = customListView
    }
}