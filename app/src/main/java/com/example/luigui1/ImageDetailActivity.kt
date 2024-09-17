// Autor: luigui alexander huanca capira
// Fecha creación: 2024-09-16
// Fecha última modificación: 2024-09-16

package com.example.luigui1

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.luigui1.R

class ImageDetailActivity : Activity() {
    private lateinit var imageView: ImageView
    private lateinit var textViewImageName: TextView
    private lateinit var btnBack: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_display)

        imageView = findViewById(R.id.imageView)
        textViewImageName = findViewById(R.id.textViewImageName)
        btnBack = findViewById(R.id.btnBack)

        val selectedImage = intent.getStringExtra("selectedImage") ?: "imagen1"
        textViewImageName.text = selectedImage

        // Cargar la imagen correspondiente
        val resourceId = when (selectedImage) {
            "imagen1" -> R.drawable.imagen1
            "imagen2" -> R.drawable.imagen2
            "imagen3" -> R.drawable.imagen3
            "imagen4" -> R.drawable.imagen4
            else -> R.drawable.imagen1 // Imagen por defecto en caso de error
        }
        imageView.setImageResource(resourceId)

        btnBack.setOnClickListener {
            finish()
        }
    }
}