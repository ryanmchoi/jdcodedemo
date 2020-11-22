package com.example.jddemo

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val aircraftDcardview = findViewById<CardView>(R.id.aircraftDcardview)
        aircraftDcardview.setOnClickListener {
            aircraftDcardview.setCardBackgroundColor(Color.rgb(223, 241, 255))
            val i = Intent(this@MainActivity, aircraftInfoActivity::class.java)
            startActivity(i)
        }

    }
}
