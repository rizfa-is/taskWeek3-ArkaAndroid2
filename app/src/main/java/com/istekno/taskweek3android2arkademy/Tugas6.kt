package com.istekno.taskweek3android2arkademy

fun main () {
    /*
    Q :
    Buat fungsi menghitung luas lingkaran dengan input parameter berupa jari-jari

    Algoritma :
    1. Start
    2. Masukkan nilai jari-jari
    3. Cek apakah jari-jari habis dibagi 7
    4. Jika iya, gunakan phi = 22/7
    5. Jika tidak, gunakan phi = 3.14
    6. Hitung luas dengan rumus = phi x jari-jari x jari-jari
    7. Cetak hasil perhitungan luas
    8. Finish

    */

//    Utility
    println("Input radius : ")
    val radius = readLine()!!.toDouble()

//    Answer 1
    val phi : Double = if (radius % 7 == 0.0) (22/7).toDouble() else 3.14
    fun roundArea(rad: Double) : Double = phi * Math.pow(rad, 2.0)

    println(roundArea(radius))
}