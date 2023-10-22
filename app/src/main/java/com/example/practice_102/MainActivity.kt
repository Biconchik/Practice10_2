package com.example.practice_102

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.linelayout)
        setTitle("LinearLayout")

    }

    fun Click(view: View){
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)
        var text1 = findViewById<TextView>(R.id.textView2)
        var text2 = findViewById<TextView>(R.id.textView4)
        button1.setOnClickListener { text1.text = "Вертикальная" }
        button2.setOnClickListener { text2.text = "По левой границе" }
        button3.setOnClickListener { text1.text = "Горизонтальная" }
        button4.setOnClickListener { text2.text = "По центру" }
        button5.setOnClickListener { text1.text = "Вертикальная" }
        button6.setOnClickListener { text2.text = "По правой границе" }
    }

}