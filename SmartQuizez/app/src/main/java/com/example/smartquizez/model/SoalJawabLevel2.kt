package com.example.smartquizez.model

class SoalJawabLevel2 {
    //membuat array untuk pertanyaan
    var pertanyaan2 = arrayOf(
        "10 + 3 x 4 : 2  =  ?",
        " Putri membutuhkan 750 gram cokelat dan gula 15 jam untuk pesta ulang tahun. Saat ditimbang, beratnya … kg?",
        "Ayah mulai belajar pada jam 7:00 malam dan berakhir pada jam 9:35 malam Jadi ayah belajar … menit?",
        "Tinggi segitiga 14cm. Jika area dasar adalah 26 cm, area adalah … cm?",
        "Hasil 30 x 40 – 750 + 300 adalah?"
    )

    //membuat array untuk pilihan jawaban
    private val pilihanJawaban2 =
        arrayOf(
            arrayOf(
                "15",
                "16",
                "17",
                "18"
            ),
            arrayOf("2", "2,20", "2,25","2,5"),
            arrayOf("150", "155", "160","165"),
            arrayOf("180", "182", "282", "364"),
            arrayOf("700", "750", "800", "850")
        )

    //membuat array untuk jawaban benar
    private val jawabanBenar2 = arrayOf(
        "16",
        "2,25",
        "155",
        "182",
        "750"
    )

    //membuat getter untuk mengambil pertanyaan
    fun getPertanyaanlevel2(x: Int): String? {
        return pertanyaan2[x]
    }

    //membuat getter untuk mengambil pilihan jawaban 1
    fun getPilihanJawaban1level2(x: Int): String? {
        return pilihanJawaban2[x][0]
    }

    //membuat getter untuk mengambil pilihan jawaban 2
    fun getPilihanJawaban2level2(x: Int): String? {
        return pilihanJawaban2[x][1]
    }

    //membuat getter untuk mengambil pilihan jawaban 3
    fun getPilihanJawaban3level2(x: Int): String? {
        return pilihanJawaban2[x][2]
    }

    //membuat getter untuk mengambil pilihan jawaban 4
    fun getPilihanJawaban4level2(x: Int): String? {
        return pilihanJawaban2[x][3]
    }


    //membuat getter untuk mengambil jawaban benar
    fun getJawabanBenarlevel2(x: Int): String? {
        return jawabanBenar2[x]
    }
}