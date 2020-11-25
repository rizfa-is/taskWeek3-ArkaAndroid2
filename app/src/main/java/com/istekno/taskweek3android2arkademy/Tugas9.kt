package com.istekno.taskweek3android2arkademy

fun main () {
    /*
       Q :
       Buat fungsi membuat segitiga terbalik dimana barisnya sesuai dengan input angka

       Algoritma :

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