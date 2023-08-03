package com.example.p2_31_b6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val TAG = "MainActivity"

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        displaymessage("OnStart Called")
        displays("Onstart called")
    }

    override fun onResume() {
        super.onResume()
        displaymessage("OnResume Called")
        displays("OnResume called")
    }

    override fun onPause() {
        super.onPause()
        displaymessage("OnPause Called")
        displays("OnPause called")
    }

    override fun onStop() {
        super.onStop()
        displaymessage("OnStop Called")
        displays("OnStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        displaymessage("OnDestroy Called")
        displays("OnDestroy called")
    }

    override fun onRestart() {
        displaymessage("OnRestart Called")
        displays("OnRestart called")
        super.onRestart()
    }

    fun displaymessage(msg:String){
        Toast.makeText(this,"This is $msg",Toast.LENGTH_LONG).show();
        Log.i("MainActivity","This is log message")
    }
   fun displays(msg: String){
       val myLayout = findViewById<View>(R.id.mylayout)
       Snackbar.make(myLayout, "This is $msg", Snackbar.LENGTH_LONG).show()
}
}
