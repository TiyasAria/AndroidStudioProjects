package com.example.smartquizez.model

class SoalJawabLevel4 {
    //membuat array untuk pertanyaan
    var pertanyaan = arrayOf(
        "… is for writing.",
        "There is … pencil.",
        "I’m thirsty. I need …. glass of water.",
        "There … three pens in the pencil box.",
        "It is eight o’clock in the morning. We say …."
    )

    //membuat array untuk pilihan jawaban
    private val pilihanJawaban =
        arrayOf(
            arrayOf(
                "Book",
                "Eraser",
                "Pen",
                "Bag"
            ),
            arrayOf("one", "two", "three","four"),
            arrayOf("two", "three", "four","a"),
            arrayOf("Are", "Is", "No", "Was"),
            arrayOf("Good Afternoon", "Good Night", "Good Evening", "Good Morning")
        )

    //membuat array untuk jawaban benar
    private val jawabanBenar = arrayOf(
        "Pen",
        "one",
        "a",
        "Are",
        "Good Morning"
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