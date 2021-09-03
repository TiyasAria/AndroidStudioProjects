package com.example.smartquizez.model

class SoalJawabLevel3 {
    //membuat array untuk pertanyaan
    var pertanyaan = arrayOf(
        "Penghubung antar tulang yang satu dengan tulang lainnya yang menyebabkan tulang dapat digerakkan disebut?",
        "Sendi yang ada di antara tulang telapak tangan dan juga pada pangkal ibu jari, adalah jenis sendi?",
        "Tulang yang terdapat pada leher manusia dapat diputar ke kiri dan juga ke kanan. Hal tersebut karena adanya?",
        "Bagian-bagian mata yang bertugas untuk menyerap cahaya yang datang adalah?",
        "Bagian dari akar yang bertugas menyerap air serta mineral dari tanah ke tanaman yaitu?"
    )

    //membuat array untuk pilihan jawaban
    private val pilihanJawaban =
        arrayOf(
            arrayOf(
                "kulit",
                "sendi",
                "tulang",
                "otot"
            ),
            arrayOf(
                "Peluru",
                "Pelana",
                "Engsel",
                "Geser"
            ),
            arrayOf(
                "sendi pelana",
                "sendi peluru",
                "sendi engsel",
                "sendi putar"
            ),
            arrayOf(
                "Kelopak",
                "Iris",
                "Selaput bening",
                "Retina"
            ),
            arrayOf(
                "Akar",
                "Tudung akar",
                "Rambut akar",
                "Inti akar"
            )
        )

    //membuat array untuk jawaban benar
    private val jawabanBenar = arrayOf(
        "sendi",
        "Pelana",
        "sendi putar",
        "Retina",
        "Rambut akar"
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