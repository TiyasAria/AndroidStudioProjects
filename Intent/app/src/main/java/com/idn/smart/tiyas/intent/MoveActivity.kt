package com.idn.smart.tiyas.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MoveActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move)
        supportActionBar?.title = "Move"

    }
}