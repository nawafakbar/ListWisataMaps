package com.nawaf.latihan_25okt.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.nawaf.latihan_25okt.R

class adaptergambar (private val context: Context, private val img: Array<Int>,
                     private val txt: Array<String>, private val tx2: Array<String>): BaseAdapter() {
    override fun getCount(): Int {
        return img.size
        return txt.size
        return tx2.size
    }

    override fun getItem(position: Int): Any {
        return img[position]
        return txt[position]
        return tx2[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View
        val gambar : ImageView
        val a : TextView
        val b : TextView
        val txt_Lat : TextView
        val txt_Lat2 : TextView
        val txt_Lat3 : TextView


        if (convertView == null){
            view = LayoutInflater.from(context).inflate(R.layout.item_gambar, parent, false)
            gambar = view.findViewById(R.id.gambar)
            a = view.findViewById(R.id.txt_judul)
            b = view.findViewById(R.id.txt_des)
        } else{
            view = convertView
            gambar = view.findViewById(R.id.gambar)
            a = view.findViewById(R.id.txt_judul)
            b = view.findViewById(R.id.txt_des)
        }

        gambar.setImageResource(img[position])
        a.setText(txt[position])
        b.setText(tx2[position])
        return view
    }
}