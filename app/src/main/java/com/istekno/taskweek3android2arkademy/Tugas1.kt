package com.istekno.taskweek3android2arkademy

fun main () {
    /*
    Q :
    Buat 2 variabel x = 10, y = 20. Kemudian tukarkan isi variabel tsb menjadi output x = 20, y = 10

    Algoritma :
    1. Start
    2. Buat variabel x = 10, y = 20
    3. Buat variabel ketiga, z = x
    4. Print x & y sebelum ditukar
    5. Ganti nilai x dengan nilai y
    6. Ganti nilai y dengan nilai z
    7. Print x & y sesudah ditukar
    8. Finish

    */

//    Answer
    var x = 10
    var y = 20
    val z = x

    println("Nilai x sebelum ditukar : $x")
    println("Nilai y sebelum ditukar : $y")

    x = y
    y = z

    println("============================")
    println("Nilai x sesudah ditukar : $x")
    println("Nilai y sesudah ditukar : $y")
    println("=============================")

//    Answer 2
    var x2 = 10
    var y2 = 20

    println("Nilai x2 sebelum ditukar : $x2")
    println("Nilai y2 sebelum ditukar : $y2")

    run { val a = x2; x2 = y2; y2 = a }

    println("=============================")
    println("Nilai x2 sesudah ditukar : $x2")
    println("Nilai y2 sesudah ditukar : $y2")
}