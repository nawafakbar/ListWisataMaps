package com.nawaf.latihan_25okt

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.nawaf.latihan_25okt.adapter.adaptergambar

class HomePage : AppCompatActivity() {
    private val a1 = arrayOf(
        R.drawable.icon3,
        R.drawable.icon1
    )
    private val aa = arrayOf("Jam Gadang Bukittinggi", "Ulun Danu Beratan")
    private val ab = arrayOf("Bukittinggi, Sumatera Barat", "Bali")
    private val deskripsi = arrayOf("Bangunan menara Jam Gadang ini memiliki ukuran dasar 6.5 m x 6.5 m, dan juga ukuran tangga 4 meter. Jadi, secara keseluruhan, menara ini berukuran 6.5 meter x 10.5 meter.", "Pura Ulun Danu Beratan sebagai salah satu Pura Khayangan Jagat di Bali, menjadi tempat pemujaan umat Hindu. Meski begitu, Pura Ulun Danu Beratan juga menjadi destinasi wisata budaya di Pulau Dewata.")
    private val a2 = arrayOf(-0.305432, -8.3016057)
    private val a3 = arrayOf(100.368383, 115.1582668)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home_page)
        val gridView = findViewById<GridView>(R.id.rv_gambar)
        val adapter = adaptergambar(this, a1, aa, ab)
        gridView.adapter = adapter

        gridView.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, Detail_Gambar::class.java)
            intent.putExtra("data", a1[position])
            intent.putExtra("data11", aa[position])
            intent.putExtra("data22", ab[position])
            intent.putExtra("data33", deskripsi[position])
            intent.putExtra("data1", a2[position])
            intent.putExtra("data2", a3[position])
            startActivity(intent)
        }
    }
}