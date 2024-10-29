package com.nawaf.latihan_25okt

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.GridView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.nawaf.latihan_25okt.adapter.adaptergambar

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //splashscreen
        Handler(Looper.getMainLooper()).postDelayed({
            //untuk pindah ke page selanjutnya
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
            finish() //kill the activity
        }, 3000)


    }
}