package com.example.mycalculator

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var tilNumber: Number
    lateinit var etNumber: Number
    lateinit var btnButtonAdd: Button
    lateinit var btnButtonSubtract: Button
    lateinit var btnButtonMultiply: Button
    lateinit var btnButtonModulus: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tilNumber=findViewById(R.id.tilNumber1)
        etNumber=findViewById(R.id.etNumber2)






    }
    fun addNumbers() {
        var Number1 = findViewById<EditText>(R.id.tilNumber1)
        var Number2=findViewById<EditText>(R.id.etNumber2)
        var button = findViewById<Button>(R.id.btnButton)
        button.setOnClickListener {
            var add = Number1.text.toString().toInt()
            var add2 = Number2.text.toString().toInt()
            var output = add - add2
            Toast.makeText(this, "$output", Toast.LENGTH_SHORT).show()
        }
    }

    fun subNumbers() {
        var Number1 = findViewById<EditText>(R.id.tilNumber1)
        var Number2=findViewById<EditText>(R.id.etNumber2)
        var button = findViewById<Button>(R.id.btnButton)
        button.setOnClickListener {
            var sub = Number1.text.toString().toInt()
            var sub2 = Number2.text.toString().toInt()
            var output = sub - sub2
            Toast.makeText(this, "$output", Toast.LENGTH_SHORT).show()
        }
    }

    fun  Multiply() {
        var Number1 = findViewById<EditText>(R.id.tilNumber1)
        var Number2=findViewById<EditText>(R.id.etNumber2)
        var button = findViewById<Button>(R.id.btnButton)
        button.setOnClickListener {
            var multiply = Number1.text.toString().toInt()
            var multioly2 = Number2.text.toString().toInt()
            var output = multiply - multiply
            Toast.makeText(this, "$output", Toast.LENGTH_SHORT).show()

//
        }
    }
    fun Modulus() {
        var Number1 = findViewById<EditText>(R.id.tilNumber1)
        var Number2=findViewById<EditText>(R.id.etNumber2)
        var button = findViewById<Button>(R.id.btnButton)
        button.setOnClickListener {
            var modulus = Number1.text.toString().toInt()
            var modulus2 = Number2.text.toString().toInt()
            var output = modulus - modulus2
            Toast.makeText(this, "$output", Toast.LENGTH_SHORT).show()
        }
    }

}

