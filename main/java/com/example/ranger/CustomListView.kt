package com.example.ranger

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomListView(private val context: Activity, private val aircraft: Array<String>, private val imgid: Array<Int>) : ArrayAdapter<String?>(context, R.layout.listview_layout, aircraft) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var r = convertView
        var viewHolder: ViewHolder? = null
        if (r == null) {
            val layoutInflater = context.layoutInflater
            r = layoutInflater.inflate(R.layout.listview_layout, null, true)
            viewHolder = ViewHolder(r)
            r.tag = viewHolder
        } else {
            viewHolder = r.tag as ViewHolder
        }
        viewHolder.ivw.setImageResource(imgid[position])
        viewHolder!!.tvw1.text = aircraft[position]
        return r!!
    }

    internal inner class ViewHolder(v: View) {
        var tvw1: TextView
        var ivw: ImageView

        init {
            tvw1 = v.findViewById<View>(R.id.aircraft) as TextView
            ivw = v.findViewById<View>(R.id.imageView) as ImageView
        }
    }

}