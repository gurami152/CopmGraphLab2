package com.example.lab2

import android.opengl.GLSurfaceView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

private lateinit var gLView: GLSurfaceView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gLView = MyGLSurfaceView(this)
        setContentView(gLView)



    }
}