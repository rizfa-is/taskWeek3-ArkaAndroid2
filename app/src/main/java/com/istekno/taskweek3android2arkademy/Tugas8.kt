package com.istekno.taskweek3android2arkademy

fun main () {
    /*
    Q :
    Buat fungsi menghitung rata-rata nilai dan menentukan grade nya

    Algoritma :
    1. Start
    2. Masukkan semua nilai
    3. Hitung rata-rata nya
    4. Cek nilai rata-rata, masuk ke kelompok nilai mana
    5. Jika masuk kelompok 90 - 100, cetak "Grade A"
    6. Jika masuk kelompok 80 - 89, cetak "Grade B"
    7. Jika masuk kelompok 70 - 79, cetak "Grade C"
    8. Jika masuk kelompok 60 - 69, cetak "Grade D"
    9. Jika masuk kelompok < 60, cetak "Grade E"
    10. Finish

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