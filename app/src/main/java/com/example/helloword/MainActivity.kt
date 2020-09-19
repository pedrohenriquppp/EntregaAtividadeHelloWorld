package com.example.helloword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var helloTextView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        helloTextView = findViewById<TextView>(R.id.helloTextView)
        helloTextView!!.text = "Ola mundo, por Guilherme"

        helloTextView!!.setOnClickListener {
            Toast.makeText(applicationContext,
                "Bem vindo",
                Toast.LENGTH_LONG
                ).show()
        }
    }
}