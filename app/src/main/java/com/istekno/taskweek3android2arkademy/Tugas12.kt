package com.istekno.taskweek3android2arkademy

fun main () {
    /*
    Q :
    Reverse word, ubah urutan kata dalam kalimat menjadi terbalik

    Algoritma :

    */

//    Utility
    println("Input sentence : ")
    val str = readLine().toString()
    val split = str.split(" ").size

//    Answer 1
    var i = str.length - 1
    var count: Int
    var last = i + 1
    var result = ""

    if (str != " " && split >= 2) {
        while (i >= 0) {
            if (str[i] == ' ' || i == 0) {
                count = if (i == 0) i else i + 1

                while (count < last) {
                    result += str[count++]
                }
                result += " "
                last = i
            }
            i--
        }
        println(result)
    } else {
        println("Minimum 2 words")
    }

//    Answer 2
    if (str != " " && split >= 2) {
        str.split(" ").reversed().joinToString(" ")
        println(str)
    } else {
        println("Minimum 2 words")
    }
}