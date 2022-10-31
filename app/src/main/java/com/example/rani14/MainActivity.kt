package com.example.rani14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val TPFL = findViewById<Button>(R.id.fragmentTPFL)
        val TO = findViewById<Button>(R.id.fragmentTO)
        val PPLG = findViewById<Button>(R.id.fragmentPPLG)
        val Busana = findViewById<Button>(R.id.fragmentBusana)
        val Kuliner = findViewById<Button>(R.id.fragmentKuliner)

        TPFL.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, TPFL())
            fragmentTransaction.commit()
        }

        TO.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, TO())
            fragmentTransaction.commit()
        }

        PPLG.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, PPLG())
            fragmentTransaction.commit()
        }

        Busana.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, Busana())
            fragmentTransaction.commit()
        }

        Kuliner.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, Kuliner())
            fragmentTransaction.commit()
        }
    }
}


