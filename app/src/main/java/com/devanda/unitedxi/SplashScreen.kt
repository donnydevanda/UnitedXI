package com.devanda.unitedxi

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        var splashImage: ImageView = findViewById(R.id.splashImage)
        Glide.with(this)
            .load(R.drawable.unitedlogo)
            .apply(RequestOptions())
            .into(splashImage)

        Handler().postDelayed(Runnable {
            var splashIntent = Intent(this@SplashScreen, MainActivity::class.java)
            startActivity(splashIntent)
            finish()
        }, 2000)
    }
}