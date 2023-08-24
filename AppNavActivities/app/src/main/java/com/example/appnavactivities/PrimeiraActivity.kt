package com.example.appnavactivities

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class PrimeiraActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primeira)
    }

    fun vaiPraProxima(view: View){
        val intent = Intent(this, SegundaActivity::class.java)
        startActivity(intent)
    }

}