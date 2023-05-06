package com.example.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class success : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success)

        var button5 = findViewById<Button>(R.id.button5)
        button5.setOnClickListener {
            val intent = Intent(this, Pay::class.java)
            startActivity(intent)
        }
    }
}