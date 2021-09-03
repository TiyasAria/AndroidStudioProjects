package com.idn.recycleviewfruit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val nama = arrayOf("Apel", "Anggur", "Jeruk", "Pir", "Strawberry")
    private val gambar = arrayOf(R.drawable.apple, R.drawable.grapes, R.drawable.orange,
            R.drawable.pear,R.drawable.strawberry)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerview.adapter = RecyclerViewAdapter(gambar, nama)
    }
}