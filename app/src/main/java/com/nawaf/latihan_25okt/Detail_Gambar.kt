package com.nawaf.latihan_25okt

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Detail_Gambar : AppCompatActivity() {


    //private val a2 = arrayOf("-0.9345797,100.226453", "-6.83464,107.9213892", "-8.3306525,114.7766639", "-6.2297209,106.6647013")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_gambar)
        val title = intent.getIntExtra("data", 0)
        val titlea = intent.getStringExtra("data11")
        val titleb = intent.getStringExtra("data22")
        val titlec = intent.getStringExtra("data33")
        val title2 = intent.getDoubleExtra("data1", 0.0)
        val title3 = intent.getDoubleExtra("data2", 0.0)


        val a = findViewById<ImageView>(R.id.txt_gambar)
        a.setImageResource(title)
        val b = findViewById<TextView>(R.id.txt_des)
        b.setText(titlec)


        val gaskan = findViewById<Button>(R.id.gas)
        gaskan.setOnClickListener(){
            val intent = Intent(this, MapsActivity::class.java)
            intent.putExtra("datamaps", title2)
            intent.putExtra("datamaps2", title3)
            startActivity(intent)

        }
    }
}