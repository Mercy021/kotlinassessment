package com.example.assessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var tvnumberone = findViewById<TextView>(R.id.tvnumbertwo)
    var tvnumbertwo = findViewById<TextView>(R.id.tvnumbertwo)
    var btnAdd = findViewById<Button>(R.id.btnAdd)
    var btnSubtract = findViewById<Button>(R.id.btnSubtract)
    var btnMultiply = findViewById<Button>(R.id.btnMultiply)
    var btnModulus = findViewById<Button>(R.id.btnModulus)
    var tvresult = findViewById<TextView>(R.id.tvResults)





}