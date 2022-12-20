package com.example.myapplication

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("My Text","MAinActivity : OnCreate")
            val greetingTextView = findViewById<TextView>(R.id.tvHello)
            val inputName = findViewById<EditText>(R.id.etName)
            val inputPasswd = findViewById<EditText>(R.id.etPassword)
            val submitButton = findViewById<Button>(R.id.btnSubmit)
            val offersButton = findViewById<Button>(R.id.btnOffers)
            var enteredName = ""
            var enteredPasswd = ""
            submitButton.setOnClickListener {
                enteredName = inputName.text.toString()
                enteredPasswd = inputPasswd.text.toString()
                if (enteredName == "") {
                    greetingTextView.text = ""
                    offersButton.visibility = INVISIBLE
                    Toast.makeText(
                        this@MainActivity,
                        "Please enter a name",
                        Toast.LENGTH_LONG
                    ).show()
                } else {
                    if (enteredPasswd == "12345") {
                        inputName.text.clear()
                        inputPasswd.text.clear()
                        greetingTextView.text = "Welcome ${enteredName}"
                        greetingTextView.setTextColor(Color.rgb(0, 140, 140))
                        offersButton.visibility = VISIBLE
                    } else {
                        inputPasswd.text.clear()
                        greetingTextView.text = "Wrong Password"
                        greetingTextView.setTextColor(Color.rgb(255, 0, 0))
                        offersButton.visibility = INVISIBLE
                    }
                }
            }
            offersButton.setOnClickListener {
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("USERNAME", enteredName)
                intent.putExtra("USERPASSWD", enteredPasswd)
                startActivity(intent)
            }
    }

    override fun onStart() {
        super.onStart()
        Log.i("My Text","MAinActivity : OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("My Text","MAinActivity : OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("My Text","MAinActivity : OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("My Text","MAinActivity : OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("My Text","MAinActivity : OnDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("My Text","MAinActivity : OnRestart")
    }
}