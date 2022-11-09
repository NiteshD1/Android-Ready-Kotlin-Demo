package com.androidready.kotlin_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        kotlinDemo()
    }

    private fun kotlinDemo() {
        print("Hello world")
        Log.d("TAG", "kotlinDemo: ")
    }
}