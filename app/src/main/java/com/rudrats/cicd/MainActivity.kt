package com.rudrats.cicd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      var  versionTV = findViewById<TextView>(R.id.tvLable)

        val version =
            "App BUILD_TYPE : " + BuildConfig.BUILD_TYPE + "\n"  +"Version Name : " + BuildConfig.VERSION_NAME + "\n" + "Version Code : " + BuildConfig.VERSION_CODE.toString()

        // on below line we are setting version
        // name and code to our text view.
        versionTV.text = version
    }
}