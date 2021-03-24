package com.example.uicredential

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.util.Log
import android.view.View
import android.widget.TextView

const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"

class MainActivity : AppCompatActivity() {
    val tag= "mainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    Log.d(tag,"onCreate")

        /** Called when the user taps the Send button */

    }

    fun sendMessage(view: View) {
        val txtView = findViewById<TextView>(R.id.textView2)
        val message = txtView.text
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(com.example.uicredential.EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }




    override fun onStart() {
        Log.d(tag,"onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(tag,"onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(tag,"onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(tag,"onStop")
        super.onStop()
    }

    override fun onRestart() {
        Log.d(tag,"onRestart")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.d(tag,"onDestroy")
                super.onDestroy()
    }










}