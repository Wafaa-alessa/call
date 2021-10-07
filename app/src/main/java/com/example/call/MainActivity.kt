package com.example.call


import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val toast = "Activity1"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton = findViewById<Button>(R.id.toast_button)
        myButton.setOnClickListener{
                val intent = Intent(this,MainActivity2::class.java)
                startActivity(intent)
            }
    }
    override fun onResume() {
        super.onResume()
        Toast(this,"onResume Activity 1")
        Log.d(toast, "onResume: ")
    }

    override fun onStop() {
        super.onStop()
        Toast(this,"onStop Activity 1")
        Log.d(toast, "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast(this,"onDestroy Activity 1")
        Log.d(toast, "onDestroy: ")
    }

    fun Toast(context: Context,state:String)
    {
        Toast.makeText(context,state,Toast.LENGTH_LONG).show()
    }
}