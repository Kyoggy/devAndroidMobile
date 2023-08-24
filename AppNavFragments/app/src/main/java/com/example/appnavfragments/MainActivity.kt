package com.example.appnavfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.commit
import androidx.fragment.app.replace


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun mostrarSegundo(view: View){
        supportFragmentManager.commit{
            replace<SegundoFragment>(R.id.fragmentContainerView)
        }
    }
    fun mostrarPrimeiro(view: View){
        supportFragmentManager.commit{
            replace<PrimeiroFragment>(R.id.fragmentContainerView)
        }
    }
    fun mostrarTerceiro(view: View){
        supportFragmentManager.commit{
            replace<TerceiroFragment>(R.id.fragmentContainerView)
        }
    }
}