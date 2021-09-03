package com.example.smartquizez.model

class SoalJawabLevel1 {
    //membuat array untuk pertanyaan
    var pertanyaan = arrayOf(
        "Siapa nama presiden Indonesia yang pertama ?",
        "Ideologi dasar bagi negara Indonesia adalah ?",
        "Bhinneka Tunggal Ika mempunyai arti ?",
        "Ibukota negara Indonesia saat ini adalah ?",
        "Siapa yang menjajah Indonesia selama 350 tahun ?"
    )

    //membuat array untuk pilihan jawaban
    private val pilihanJawaban =
        arrayOf(
            arrayOf(
                "Ir. Soekarno",
                "Joko Widodo",
                "Susilo Bambang Yudhoyono",
                "Soeharto"
            ),
            arrayOf("UUD 1945", "Pancasila", "Bhinneka Tunggal Ika","Bendera Merah Putih"),
            arrayOf(
                "Berbeda-beda tetapi tetap satu",
                "Bersama selamanya",
                "Bersatu teguh bercerai runtuh",
                "Bersama-sama Kita Bisa"
            ),
            arrayOf("Semarang", "Surabaya", "Jakarta", "Jogjakarta"),
            arrayOf("Jepang", "Belanda", "Malaysia", "Perancis")
        )

    //membuat array untuk jawaban benar
    private val jawabanBenar = arrayOf(
        "Ir. Soekarno",
        "Pancasila",
        "Berbeda-beda tetapi tetap satu",
        "Jakarta",
        "Belanda"
    )

    //membuat getter untuk mengambil pertanyaan
    fun getPertanyaan(x: Int): String? {
        return pertanyaan[x]
    }

    //membuat getter untuk mengambil pilihan jawaban 1
    fun getPilihanJawaban1(x: Int): String? {
        return pilihanJawaban[x][0]
    }

    //membuat getter untuk mengambil pilihan jawaban 2
    fun getPilihanJawaban2(x: Int): String? {
        return pilihanJawaban[x][1]
    }

    //membuat getter untuk mengambil pilihan jawaban 3
    fun getPilihanJawaban3(x: Int): String? {
        return pilihanJawaban[x][2]
    }

    //membuat getter untuk mengambil pilihan jawaban 4
    fun getPilihanJawaban4(x: Int): String? {
        return pilihanJawaban[x][3]
    }


    //membuat getter untuk mengambil jawaban benar
    fun getJawabanBenar(x: Int): String? {
        return jawabanBenar[x]
    }
}