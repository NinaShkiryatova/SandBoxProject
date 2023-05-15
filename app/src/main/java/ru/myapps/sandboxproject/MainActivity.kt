package ru.myapps.sandboxproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    val number = 136
    lateinit var text: TextView
    lateinit var background: ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text = findViewById(R.id.text)
        background = findViewById(R.id.background)
        text.setText("Hello, $number!")
        background.setBackgroundColor(getResources().getColor(R.color.red))
    }



}