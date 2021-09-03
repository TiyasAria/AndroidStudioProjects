package com.example.smartquizez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.smartquizez.model.SoalJawabLevel2
import com.example.smartquizez.model.SoalJawabLevel3
import kotlinx.android.synthetic.main.activity_level1_.*

class Level3Activity : AppCompatActivity(), View.OnClickListener {

    private lateinit var tvScore : TextView
    private lateinit var tvSoal : TextView
    private lateinit var rgSoal : RadioGroup
    private lateinit var rbJawabanA: RadioButton
    private lateinit var rbJawabanB: RadioButton
    private lateinit var rbJawabanC: RadioButton
    private lateinit var rbJawabanD: RadioButton
    private lateinit var btnNext : Button
    private lateinit var btnMenu : Button
    private var skor = 0
    private var arr = 0 // untuk menampung nilai panjang aray
    private var x = 0  // untuk menunjukan konten sekarang
    private var jawaban : String? = null

    // variabel untuk cek halaman
    // private var hitungSoal = 0
    // private var  jumlahSoal = 0



    //memuat objeck dari kelas SoaljawabLevel1

    private var soalPG : SoalJawabLevel3 =
        SoalJawabLevel3()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level3)
        tvScore = tv_score
        tvSoal = tv_soal
        rgSoal = rg_soal1
        rbJawabanA = radioButton
        rbJawabanB = radioButton2
        rbJawabanC = radioButton3
        rbJawabanD = radioButton4
        btnNext = btn_next
        btnMenu = btn_menu
        btn_next.setOnClickListener(this)
        btn_menu.setOnClickListener(this)

        //set konten
        tvScore.text = ("" + skor)
        setKonten()
    }

    private fun setKonten() {
        rgSoal.clearCheck()
        arr = soalPG.pertanyaan.size
        if (x >= arr) { //jika nilai x melebihi nilai arr(panjang array) maka akan pindah activity (kuis selesai)
            val jumlahSkor = skor.toString() //menjadikan skor menjadi string
            val i = Intent(this@Level3Activity, MenuLevel::class.java)
            //waktu pindah activity, sekalian membawa nilai jumlahSkor yang ditampung dengan inisial skorAkhir
            //singkatnya skorAkhir = jumlahSkor
            i.putExtra("skorAkhir", jumlahSkor)
            i.putExtra("activity", "PilihanGanda")
            startActivity(i)

        } else {
            //setting text dengan mengambil text dari method getter di kelas SoalJawabLevel2
            tvSoal.text = soalPG.getPertanyaan(x)
            rbJawabanA.text = soalPG.getPilihanJawaban1(x)
            rbJawabanB.text = soalPG.getPilihanJawaban2(x)
            rbJawabanC.text = soalPG.getPilihanJawaban3(x)
            rbJawabanD.text = soalPG.getPilihanJawaban4(x)
            jawaban = soalPG.getJawabanBenar(x)
        }
        x++
    }

    override fun onClick(p0: View?) {
        cekJawaban()
        btn_menu.setOnClickListener {
            startActivity(Intent(this, MenuLevel::class.java))
            finish()
        }

    }

    private fun cekJawaban() {
        if (rbJawabanA.isChecked) { //jika radio button 1 diklik
            //jika text yang tertulis di radio button tsb = nilai dari var jawaban
            if (rbJawabanA.text.toString() == jawaban) {
                skor += 10
                tvScore.text = ("" + skor)    //mtvSkor diset nilainya = var skor
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT)
                    .show() //keluar notifikasi "Jawaban Benar"
                setKonten() //update next konten
            } else {
                tvScore.text = ("" + skor)
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show()
                setKonten()
            }
        } else if (rbJawabanB.isChecked) {
            //jika text yang tertulis di radio button tsb = nilai dari var jawaban
            if (rbJawabanB.text.toString() == jawaban) {
                skor += 10
                tvScore.text = ("" + skor)    //mtvSkor diset nilainya = var skor
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT)
                    .show() //keluar notifikasi "Jawaban Benar"
                setKonten() //update next konten
            } else {
                tvScore.text = ("" + skor)
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show()
                setKonten()
            }
        } else if (rbJawabanC.isChecked) {
            //jika text yang tertulis di radio button tsb = nilai dari var jawaban
            if (rbJawabanC.text.toString() == jawaban) {
                skor += 10
                tvScore.text = ("" + skor)    //mtvSkor diset nilainya = var skor
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show() //keluar notifikasi "Jawaban Benar"
                setKonten() //update next konten
            } else {
                tvScore.text = ("" + skor)
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show()
                setKonten()
            }
        } else if (rbJawabanD.isChecked) {
            //jika text yang tertulis di radio button tsb = nilai dari var jawaban
            if (rbJawabanD.text.toString() == jawaban) {
                skor += 10
                tvScore.text = ("" + skor)    //mtvSkor diset nilainya = var skor
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show() //keluar notifikasi "Jawaban Benar"
                setKonten() //update next konten
            } else {
                tvScore.text = ("" + skor)
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show()
                setKonten()
            }
        } else {
            Toast.makeText(this, "Silahkan pilih jawaban dulu!", Toast.LENGTH_SHORT).show()
        }
    }
}