package com.istekno.taskweek3android2arkademy

import java.util.*

fun main () {
    /*
    Q :
    Deteksi palindrom, cek apakah kata tersebut palindrom atau bukan.

    Algoritma :

    */

//    Answer 1
    println("Input word : ")
    val text = readLine().toString().toLowerCase(Locale.ROOT)
    var textNow = ""
    var i = text.length - 1

    while ( i >= 0 ) {
        textNow += text[i].toString()
        i--
    }

    if (textNow == text) {
        println("$text is palindrome")
    } else {
        println("$text is non palindrome")
    }
}