package com.example.camerakitbasic

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class CameraViewActivity : AppCompatActivity(R.layout.activity_camera_view) {

    companion object {
        const val LENS_GROUP_ID = "INSERT ID HERE"
        const val LENS_ID = "INSERT ID HERE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}