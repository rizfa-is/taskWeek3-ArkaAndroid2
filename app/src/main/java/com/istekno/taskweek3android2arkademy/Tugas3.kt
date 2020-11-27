import java.lang.Exception

fun main () {
    /*
    Q :
    Buat sebuah fungsi cek ganjil genap

    Algoritma :
    1. Start
    2. Masukkan sejumlah angka
    3. Cek, apakah angka habis dibagi 2
    4. Jika iya, cetak "angka is even"
    5. Jika tidak, cetak "angka is odd"
    6. Finish


    */

//    Utility
    try {
        println("Input number: ")
        val number = readLine()

        if (number != "") {
            val numb = number!!.toInt()
//    Answer
            println(checkOddEven(numb))
        } else if (number == "") {
            println("Field couldn't be empty!")
        }
    } catch (e: Exception) {
        println("Please, input positive integer only!")
    }
}

//    Answer 1
fun checkOddEven(numb: Int) = if (numb % 2 == 0) println("$numb is even") else println("$numb is odd")

//    Answer 2
val checkOddEven2: (numb: Int) -> Unit = {
    if (it % 2 == 0) println("$it is even")
    else println("$it is odd")
}