package com.example.uas_mc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val Music = intent.getParcelableExtra<Music>("Music")
        if (Music != null) {
            val imageView: ImageView = findViewById(R.id._imageDetail)
            val textViewTitle: TextView = findViewById(R.id.imageTitle)
            val textViewDesc: TextView = findViewById(R.id.imageDesc)

            imageView.setImageResource(Music.imageSource)
            textViewTitle.text = Music.imageTitle
            textViewDesc.text = Music.imageDecs
        }
    }
}