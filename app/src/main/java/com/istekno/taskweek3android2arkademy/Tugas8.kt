package com.istekno.taskweek3android2arkademy

fun main () {
    /*
    Q :
    Buat fungsi menghitung rata-rata nilai dan menentukan grade nya

    Algoritma :

    */

//    Utility
    println("Input MTK value : ")
    val mtk = readLine()!!.toInt()
    println("Input Indonesian value : ")
    val ind = readLine()!!.toInt()
    println("Input English value : ")
    val eng = readLine()!!.toInt()
    println("Input Science value : ")
    val sci = readLine()!!.toInt()

//    Answer 1
    val average = listOf(mtk, ind, eng, sci).average().toInt()
    fun grade(value: Int) = when (value) {
        in 90..100 -> println("Grade A")
        in 80..89 -> println("Grade B")
        in 70..79 -> println("Grade C")
        in 60..69 -> println("Grade D")
        else -> println("Grade E")
    }
    grade(average)
}