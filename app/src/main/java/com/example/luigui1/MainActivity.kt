// Autor: luigui alexander huanca capira
// Fecha creación: 2024-09-16
// Fecha última modificación: 2024-09-16

package com.example.luigui1


import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class MainActivity : Activity() {
    private lateinit var spinner: Spinner
    private lateinit var btnNext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinner = findViewById(R.id.spinnerImages)
        btnNext = findViewById(R.id.btnNext)

        // Lista fija de 4 imágenes
        val imageNames = arrayOf("imagen1", "imagen2", "imagen3", "imagen4")

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, imageNames)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        btnNext.setOnClickListener {
            val intent = Intent(this, ImageDetailActivity::class.java)
            intent.putExtra("selectedImage", spinner.selectedItem.toString())
            startActivity(intent)
        }
    }
}