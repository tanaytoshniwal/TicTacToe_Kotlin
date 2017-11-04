package com.example.alphabat69.tic_tac_toekt

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar

class Activity1 : AppCompatActivity() {
    private var imageView: ImageView? = null
    private var progressBar: ProgressBar? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)
        imageView = findViewById<ImageView>(R.id.imageView)
        progressBar = findViewById<ProgressBar>(R.id.progressBar)
        val handler = Handler()
        handler.postDelayed({
            imageView!!.visibility = View.VISIBLE
            handler.postDelayed({
                progressBar!!.visibility = View.VISIBLE
                handler.postDelayed({
                    startActivity(Intent(this, Activity2::class.java))
                    finish()
                }, 500)
            }, 500)
        }, 1000)
    }
}
