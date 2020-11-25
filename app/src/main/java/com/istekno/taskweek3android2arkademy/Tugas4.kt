package com.istekno.taskweek3android2arkademy

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime
import java.util.*

@RequiresApi(Build.VERSION_CODES.O)
fun main () {
    /*
    Q :
    Buat fungsi menghitung umur dengan input parameter berupa tahun lahir

    Algoritma :

    */

//    Utility
    println("Masukkan tahun lahir: ")
    val numb = readLine()!!.toInt()

//    Answer 1 (Required Min. API Level 26 for accessing now())
    fun checkAge(yearOfBirth: Int) : Int {
        val nowYear = LocalDateTime.now().year
        return nowYear - yearOfBirth
    }

//    Answer 2 (manually update for current year)
    fun checkAge2(yearOfBirth: Int) : Int = 2020 - yearOfBirth

//    Answer 3 (automatically update for current year)
    fun checkAge3(yearOfBirth: Int) : Int {
        val nowYear = Calendar.getInstance().weekYear
        return nowYear - yearOfBirth
    }

    println("Age : ${checkAge3(numb)} years old")
}