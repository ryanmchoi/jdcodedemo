package com.example.jddemo

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class aircraftInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aircraft_info2)


        val addRangerBtn = findViewById<Button>(R.id.addRangerButton)
        addRangerBtn.setOnClickListener {
            val i = Intent(this@aircraftInfoActivity, RangerListActivity::class.java)
            startActivity(i)
        }

    }
}