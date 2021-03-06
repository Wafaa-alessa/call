package com.example.call

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    val toast = "Activity2"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val myButton = findViewById<Button>(R.id.toast_button2)
        myButton.setOnClickListener{
            val intent = Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        Toast(this,"onResume Activity 2")
        Log.d(toast, "onResume: ")
    }

    override fun onStop() {
        super.onStop()
        Toast(this,"onStop Activity 2")
        Log.d(toast, "onStop: ")
    }
    override fun onDestroy() {
        super.onDestroy()
        Toast(this,"onDestroy Activity 2")
        Log.d(toast, "onDestroy: ")
    }

    fun Toast(context: Context, state:String)
    {
        Toast.makeText(context,state, Toast.LENGTH_LONG).show()
    }
}