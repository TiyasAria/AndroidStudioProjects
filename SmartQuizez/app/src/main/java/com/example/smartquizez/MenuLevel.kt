package com.example.smartquizez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu_level.*

class MenuLevel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_menu_level)

        cdv_level1.setOnClickListener{
            startActivity(Intent(this, Level1Activity::class.java))
            finish()
        }

        cdv_level2.setOnClickListener{
            startActivity(Intent(this, Level2Activity::class.java))
            finish()
        }

        cdv_level3.setOnClickListener{
            startActivity(Intent(this, Level3Activity::class.java))
            finish()
        }
    }
}

