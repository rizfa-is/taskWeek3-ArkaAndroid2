package com.istekno.taskweek3android2arkademy

fun main () {
    /*
    Q :
    Deteksi palindrom, cek apakah kata tersebut palindrom atau bukan.

    Algoritma :

    */

//    Utility
    println("Input number : ")
    val form = readLine().toString().trim{it <= '0'}

//    Answer 1
    val str = form.split("0")
    val strNew = mutableListOf<String>()

    for (i in 0 until str.size) {
        strNew.add(str[i].map { it }.sorted().joinToString(""))
    }
    println(strNew.joinToString(""))
}