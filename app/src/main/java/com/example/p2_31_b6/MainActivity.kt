package com.example.p2_31_b6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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
    }

    override fun onResume() {
        super.onResume()
        displaymessage("OnResume Called")
    }

    override fun onPause() {
        super.onPause()
        displaymessage("OnPause Called")
    }

    override fun onStop() {
        super.onStop()
        displaymessage("OnStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        displaymessage("OnDestroy Called")
    }

    override fun onRestart() {
        displaymessage("OnRestart Called")
        super.onRestart()
    }

    fun displaymessage(msg:String){
        Toast.makeText(this,"This is $msg",Toast.LENGTH_LONG).show();
        Log.i("MainActivity","This is log message")
    }
//    fun displaysnack(msg: String){
//        Snackbar.make(findViewById(R.id.))
//    }

}
