package com.example.call

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    val toast = "Activity3"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
    }

    override fun onResume() {
        super.onResume()
        Toast(this,"onResume Activity 3")
        Log.d(toast, "onResume: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast(this,"onDestroy Activity 3")
        Log.d(toast, "onDestroy: ")
    }

    fun Toast(context: Context, state:String)
    {
        Toast.makeText(context,state, Toast.LENGTH_LONG).show()
    }
}