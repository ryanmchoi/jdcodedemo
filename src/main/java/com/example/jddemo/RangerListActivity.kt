package com.example.jddemo

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import androidx.cardview.widget.CardView

class RangerListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ranger_list)

        val ranger4cardview = findViewById<CardView>(R.id.ranger4cardview)
        ranger4cardview.setOnClickListener {
            ranger4cardview.setCardBackgroundColor(Color.rgb(223, 241, 255))
        }

        val confirmBtn = findViewById<Button>(R.id.addRangerConfirmButton)

        confirmBtn.setOnClickListener {
            val i = Intent(this@RangerListActivity, FinalAircraftInfo::class.java)
            startActivity(i)
        }

    }
}