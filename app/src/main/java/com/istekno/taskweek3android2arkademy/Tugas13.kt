package com.istekno.taskweek3android2arkademy

fun main () {
    /*
    Q :
    Buat fungsi mengurutkan deret, dimana 0 adalh pemisah antar deret

    Algoritma :
    1. Start
    2. Masukkan deret angka
    3. Buat variabel str yg berisi hasil split deret berdasarkan 0
    4. Buat variabel strNew
    5. Lakukan looping dengan str.size sebagai limit
    6. Susun ulang deret ke i dengan map
    7. Urutkan dari kecil ke besar
    8. Jadikan bentuk string
    9. Isikan string tersebut ke strNew
    10. Lakukan looping 5 - 9 hingga bernilai false
    11. Jadikan strNew ke bentuk string
    12. Cetak strNew
    13. Finish

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