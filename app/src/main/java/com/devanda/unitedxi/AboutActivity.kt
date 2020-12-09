package com.devanda.unitedxi

import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        supportActionBar?.setDisplayHomeAsUpEnabled(true);
        supportActionBar?.title = ("About Me")

        var aboutName: TextView = findViewById(R.id.about_name)
        var aboutEmail: TextView = findViewById(R.id.about_email)
        var aboutImage: ImageView = findViewById(R.id.about_image)

        aboutName.text = "Muhammad Donny Devanda"
        aboutEmail.text = "devandadonny@gmail.com"

        Glide.with(this)
            .load("https://donnydevanda.com/assets/pic.webp")
            .apply(RequestOptions())
            .into(aboutImage)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return super.onOptionsItemSelected(item)
    }
}