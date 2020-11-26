package com.istekno.taskweek3android2arkademy

import java.util.*
import java.util.concurrent.TimeUnit

fun main () {
    /*
    Q :
    Buat fungsi menentukan tahun kabisat dengan input parameter berupa tahun

    Algoritma :
    1. Start
    2. Masukkan tahun
    3. Cek apakah tahun habis dibagi 4
    4. Jika tidak, cetak "bukan tahun kabisat"
    5. Jika iya, lanjut cek
    6. Cek apakah tahun habis dibagi 100
    7. Jika tidak, cetak "tahun kabisat"
    8. Jika iya, lanjut cek
    9. Cek apakah tahun habis dibagi 400
    10. Jika tidak, cetak "bukan tahun kabisat"
    11. Jika iya, cetak "tahun kabisat"
    12. Finish

    */

//    Utility
    println("Input year : ")
    val year = readLine()!!.toInt()

//    Answer 1
    fun leapYear(year: Int) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    println("$year tahun kabisat")
                } else {
                    println("$year bukan tahun kabisat")
                }
            } else {
                println("$year tahun kabisat")
            }
        } else {
            println("$year bukan tahun kabisat")
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