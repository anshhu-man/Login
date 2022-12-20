package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Log.i("My Text","SecondActivity : OnCreate")
            val greetingTextView = findViewById<TextView>(R.id.tvOfferName)
            val userName = intent.getStringExtra("USERNAME");
            val userPasswd =intent.getStringExtra("USERPASSWD")
            greetingTextView.text = "Hello $userName, you will get access to all the content for 1 month"
    }
    override fun onStart() {
        super.onStart()
        Log.i("My Text","SecondActivity : OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("My Text","SecondActivity : OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("My Text","SecondActivity : OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("My Text","SecondActivity : OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("My Text","SecondActivity : OnDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("My Text","SecondActivity : OnRestart")
    }
}