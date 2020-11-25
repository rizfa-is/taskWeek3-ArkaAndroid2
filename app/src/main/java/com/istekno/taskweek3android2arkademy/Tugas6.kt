package com.istekno.taskweek3android2arkademy

fun main () {
    /*
    Q :
    Buat fungsi menghitung luas lingkaran dengan input parameter berupa jari-jari

    Algoritma :

    */

//    Utility
    println("Input radius : ")
    val radius = readLine()!!.toDouble()

//    Answer 1
    val phi : Double = if (radius % 7 == 0.0) (22/7).toDouble() else 3.14
    fun roundArea(rad: Double) : Double = phi * Math.pow(rad, 2.0)

    println(roundArea(radius))
}