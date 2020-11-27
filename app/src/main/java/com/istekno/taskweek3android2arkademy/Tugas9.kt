import java.lang.Exception

fun main () {
    /*
    Q :
    Buat fungsi membuat segitiga terbalik dimana barisnya sesuai dengan input angka

    Algoritma :
    1. Start
    2. Masukkan sejumlah angka
    3. Buat variabel numb = jumlah angka - 1
    4. Masuk for loop.
    5. Buat variabel a = iterator
    6. Buat variabel b = 1
    7. Masuk looping, cek apakah a >= 0
    8. Jika iya, cetak b
    9. a dikurangi 1, b ditambah 1
    10. Lakukan looping nomor 7 - 9 hingga bernilai false
    11. Cetak line baru
    13. Lakukan looping nomor 4 - 11 hingga bernilai false
    14. Finish

    */

//    Utility
    try {
        println("Input number : ")
        val input = readLine()

        if (input != "") {
            val numb = input!!.toInt()
//    Answer
            triangle(numb)
        } else if (input == "") {
            println("Field couldn't be empty!")
        }
    } catch (e: Exception) {
        println("Please, input positive integer only!")
    }

}

//    Answer 1
fun triangle(numb: Int) {
    for (i in numb - 1 downTo 0) {
        var a = i
        var b = 1
        while (a >= 0) {
            print(b)
            a--
            b++
        }
        println()
    }
}

//    Answer 2
fun triangle2(numb: Int) {
    for (i in numb downTo 1) {
        for (a in 1 until i + 1) {
            print(a)
        }
        println()
    }
}


//    Answer 3
fun triangle3(numb: Int) {
    var i = numb - 1
    while (i >= 0) {
        var a = 1
        do {
            print(a)
            a++
        } while ( a <= i + 1)
        println()
        i--
    }
}
