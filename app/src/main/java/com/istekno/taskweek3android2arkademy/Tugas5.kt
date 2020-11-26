package com.istekno.taskweek3android2arkademy

fun main () {
    /*
    Q :
    Buat fungsi menghitung luas segitiga dengan input parameter berupa alas dan tinggi

    Algoritma :
    1. Start
    2. Masukkan nilai alas
    3. Masukkan nilai tinggi
    4. Hitung luas dengan rumus = 1/2 x alas x tinggi
    5. Cetak hasil perhitungan luas segitiga
    6. Finish

    */

//    Utility
    println("Input base : ")
    val base = readLine()!!.toDouble()
    println("Input height : ")
    val height = readLine()!!.toDouble()

//    Answer 1
    fun triangleArea(base: Double, height: Double) : Double = 0.5 * base * height

    println(triangleArea(base, height))
}