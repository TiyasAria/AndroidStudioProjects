package com.example.smartquizez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_score.*

class ScoreActivity : AppCompatActivity(), View.OnClickListener {
    
    private lateinit var tvHasilScore : TextView
    private lateinit var tvHighScore : TextView
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)
        
        tvHasilScore = tv_hasilScore1
        tvHighScore = tv_highscore1

        btn_share.setOnClickListener(this)
        btn_menu.setOnClickListener(this)
        btn_level.setOnClickListener(this)

        set_skor()

    }

    private fun set_skor() {

    }

    override fun onClick(p0: View) {

        when (p0.id) {
            R.id.btn_menu -> {
                val backMenu = Intent(this, MenuLevel::class.java)
                startActivity(backMenu)
            }

            R.id.btn_share -> {

            }

        }
    }
}