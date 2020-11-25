package com.istekno.taskweek3android2arkademy

import java.util.*
import java.util.concurrent.TimeUnit

fun main () {
    /*
    Q :
    Buat fungsi menentukan tahun kabisat dengan input parameter berupa tahun

    Algoritma :

    */

//    Utility
    println("Input year : ")
    val year = readLine()!!.toInt()

//    Answer 1
    fun leapYear(year: Int) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    println("Tahun kabisat")
                } else {
                    println("Bukan tahun kabisat")
                }
            } else {
                println("Tahun kabisat")
            }
        } else {
            println("Bukan tahun kabisat")
        }
    }
    leapYear(year)

//    Answer 2
    val startDate = Date("1/1/$year").time
    val endDate = Date("12/31/$year").time
    val sum = (TimeUnit.DAYS.convert((endDate - startDate), TimeUnit.MILLISECONDS)).toInt() + 1
    fun leapYear2(year: Int) = if (sum == 366) println("Tahun kabisat") else println("Bukan tahun kabisat")
//    leapYear2(year)
}