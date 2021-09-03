package com.idn.listviewcontact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val nama = arrayOf("Tiyas", "Asma", "Astri", "Ummi", "Rifdah")
    private val notelp = arrayOf("081329750536", "08123456789", "081554326775",
    "081723459765", "082435678976")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listview.adapter = listViewAdapter(nama, notelp)
    }
}