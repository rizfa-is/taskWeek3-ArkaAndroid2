package com.istekno.taskweek3android2arkademy

fun main () {
    /*
    Q :
    Buat sebuah fungsi cek ganjil genap

    Algoritma :
    1. Start
    2. Masukkan sejumlah angka
    3. Cek, apakah angka habis dibagi 2
    4. Jika iya, cetak "angka is even"
    5. Jika tidak, cetak "angka is odd"
    6. Finish


    */

//    Utility
    println("Input number: ")
    val numb = readLine()!!.toInt()

//    Answer 1
    fun checkOddEven() = if (numb % 2 == 0) println("$numb is even") else println("$numb is odd")

//    Answer 2
    val checkOddEven2 = {
        if (numb % 2 == 0) println("$numb is even")
        else println("$numb is odd")
    }
    println(checkOddEven())
}