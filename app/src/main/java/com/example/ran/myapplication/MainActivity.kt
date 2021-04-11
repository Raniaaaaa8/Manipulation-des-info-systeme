package com.example.ran.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Build.MODEL
import android.os.Build




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

fun getDeviceName(): String {
    val manufacturer = Build.MANUFACTURER
    val model = Build.MODEL
    return if (model.startsWith(manufacturer)) {
        model
    } else "$manufacturer $model"
}
