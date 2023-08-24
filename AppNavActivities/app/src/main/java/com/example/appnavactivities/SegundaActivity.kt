package com.example.appnavactivities

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class SegundaActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)
    }

    fun vaiPraProxima(view: View){
        val intent = Intent(this, TerceiraActivity::class.java)
        startActivity(intent)
    }
}