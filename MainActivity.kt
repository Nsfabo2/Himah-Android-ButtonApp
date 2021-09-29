package com.example.helloworld

import android.graphics.Color
import android.graphics.Color.parseColor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import java.lang.Exception

/*
Build an app that uses a Constraint Layout to hold a TextView in the center and a horizontal Linear Layout at the bottom which contains two buttons.
Label the buttons "-" and "+"
The Text View should display the number 0
Add ids to the buttons and the Text View
Add functionality to the UI Elements so that the plus button increases the number and the minus button decreases the number
Make use of lateinit to initialize the UI Elements (mention other ways of doing this)
Write a function that handles button presses to avoid repeating code
Change the color of the number based on its value (positive - green, negative - red, 0 - black)
Have the number move up or down depending on its value
*/

class MainActivity : AppCompatActivity() {
    lateinit var Plus_Button: Button
    lateinit var Minus_Button: Button
    lateinit var Changing_Number: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Plus_Button = findViewById(R.id.PlusButton)
        Minus_Button = findViewById(R.id.MinusButton)
        Changing_Number = findViewById(R.id.NUMBER)

        Plus_Button.setOnClickListener { Increment_Number() }
        Minus_Button.setOnClickListener { Decrment_Number() }
    }//end of the function
    fun Increment_Number(){
        var counter = Changing_Number.getText().toString()!!.toInt() + 1
        if(counter > 0 )
            Changing_Number.setTextColor(Color.parseColor("green"))
        else if(counter == 0)
            Changing_Number.setTextColor(Color.parseColor("black"))
        else
            Changing_Number.setTextColor(Color.parseColor("red"))
        Changing_Number.text ="$counter"
    }//end Increment_Number function

    fun Decrment_Number(){
        var counter = Changing_Number.getText().toString()!!.toInt() - 1
        if(counter > 0 )
            Changing_Number.setTextColor(Color.parseColor("green"))
        else if(counter == 0)
            Changing_Number.setTextColor(Color.parseColor("black"))
        else
            Changing_Number.setTextColor(Color.parseColor("red"))
        Changing_Number.text ="$counter"
    }//end Decrement_Number function
}//end of the class

