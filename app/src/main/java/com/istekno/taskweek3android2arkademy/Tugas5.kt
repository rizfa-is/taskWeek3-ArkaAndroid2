package com.istekno.taskweek3android2arkademy

fun main () {
    /*
    Q :
    Buat fungsi menghitung luas segitiga dengan input parameter berupa alas dan tinggi

    Algoritma :

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