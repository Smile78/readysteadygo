package com.example.readysteadygo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


    lateinit var nextActivityButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        nextActivityButton = findViewById(R.id.b)

        nextActivityButton.setOnClickListener {
            val secondActivInten: Intent = Intent(this, Activity2Second::class.java)
            startActivity(secondActivInten)
        }

        val fab: View = findViewById(R.id.floating_action_button)


    }



}