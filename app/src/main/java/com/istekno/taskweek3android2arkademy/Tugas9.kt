package com.istekno.taskweek3android2arkademy

fun main () {
    /*
    Q :
    Buat fungsi membuat segitiga terbalik dimana barisnya sesuai dengan input angka

    Algoritma :
    1. Start
    2. Masukkan sejumlah angka
    3. Buat variabel numb = jumlah angka
    4. Masuk for loop.
    5. Buat variabel a = iterator
    6. Buat variabel b = 1
    7. Masuk looping, cek apakah a > 0
    8. Jika iya, cetak b
    9. a dikurangi 1, b ditambah 1
    10. Lakukan looping nomor 7 - 9 hingga bernilai false
    11. Cetak line baru
    13. Lakukan looping nomor 4 - 11 hingga bernilai false
    14. Finish

    */

//    Utility
    println("Input number : ")
    val numb = readLine()!!.toInt()

//    Answer 1
    for (i in numb downTo 1) {
        var a = i
        var b = 1
        while (a > 0) {
            print(b)
            a--
            b++
        }
        println()
    }

//    Answer 2
    for (i in numb downTo 1) {
        for (a in 1 until i + 1) {
            print(a)
        }
        println()
    }

//    Answer 3
    var i = numb
    while (i > 0) {
        var a = 1
        do {
            print(a)
            a++
        } while ( a < i + 1)
        println()
        i--
    }

}