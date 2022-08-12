package com.example.helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
//PreWork
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Button 1 : user taps the button to change the color of the text
        //1. add button
        //2. click the button
        //3. then change the color of the text

        //getting ref to the button form the xml file

        findViewById<Button>(R.id.button).setOnClickListener{
            //this is where you write what happens to the button
            //Log acts like a breakpoint
            Log.i("Smrithy", "Button1 clicked")

            //getting ref to text then change the color

            //using textview
            findViewById<TextView>(R.id.textView).setTextColor(resources.getColor(R.color.white))


        }

        //Button 2: user taps the button to change the color of the background
        findViewById<Button>(R.id.button2).setOnClickListener {
            Log.i("Smrithy", "Button2 clicked")
            findViewById<android.support.constraint.ConstraintLayout>(R.id.background).setBackgroundColor(resources.getColor(R.color.pink))
        }
        //Button 3: user taps the button to change the text
        findViewById<Button>(R.id.button3).setOnClickListener {
            Log.i("Smrithy", "Button3 clicked")
            //findViewById<TextView>(R.id.textView).setText("Andriod is Awesome!")
            var t = findViewById<EditText>(R.id.edit).text
            findViewById<TextView>(R.id.textView).setText(t)

        }

        //tap background to reset all the settings
        findViewById<android.support.constraint.ConstraintLayout>(R.id.background).setOnClickListener {
            Log.i("Smrithy", "Background tapped")

            findViewById<TextView>(R.id.textView).setTextColor(resources.getColor(R.color.darkblue))
            //findViewById<EditText>(R.id.edit).setTextColor(resources.getColor(R.color.black))

            findViewById<android.support.constraint.ConstraintLayout>(R.id.background).setBackgroundColor(resources.getColor(R.color.blue_purple))

            findViewById<TextView>(R.id.textView).setText("Hello from Smrithy")
            findViewById<EditText>(R.id.edit).setText("")
        }

        //edit text




    }
}