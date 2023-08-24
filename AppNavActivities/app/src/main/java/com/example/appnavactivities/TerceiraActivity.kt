package com.example.appnavactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class TerceiraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terceira)
    }

    fun vaiPraProxima(view: View){
        val intent = Intent(this, PrimeiraActivity::class.java)
        startActivity(intent)
    }
}