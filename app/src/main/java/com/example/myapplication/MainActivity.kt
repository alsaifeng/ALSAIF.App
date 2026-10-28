package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val button = Button(this).apply {
            text = "Click Me"
            setOnClickListener {
                Toast.makeText(this@MainActivity, "Hello World!", Toast.LENGTH_SHORT).show()
            }
        }
        
        setContentView(button)
    }
}
