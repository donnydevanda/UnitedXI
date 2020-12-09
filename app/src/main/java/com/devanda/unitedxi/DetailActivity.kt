package com.devanda.unitedxi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DESCRIPTION = "extra_description"
        const val EXTRA_IMAGE = "extra_image"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        var playerName: TextView = findViewById(R.id.detail_name)
        var playerDescription: TextView = findViewById(R.id.detail_description)
        var playerPhoto: ImageView = findViewById(R.id.detail_image)

        val name = intent.getStringExtra(EXTRA_NAME)
        val description = intent.getStringExtra(EXTRA_DESCRIPTION)
        val image = intent.getStringExtra(EXTRA_IMAGE)

        playerName.text = name
        playerDescription.text = description
        Glide.with(this)
            .load(image)
            .apply(RequestOptions())
            .into(playerPhoto)

    }
}