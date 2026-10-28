package com.example.alsaifapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // إنشاء الزر التفاعلي
        val myButton = Button(this).apply {
            text = "اضغط هنا لإظهار الرسالة"
            setOnClickListener {
                // إظهار رسالة Toast السريعة عند الضغط
                Toast.makeText(this@MainActivity, "مرحباً بك! تم الضغط على الزر بنجاح 🎉", Toast.LENGTH_LONG).show()
            }
        }
        
        // عرض الزر في الشاشة
        setContentView(myButton)
    }
}
