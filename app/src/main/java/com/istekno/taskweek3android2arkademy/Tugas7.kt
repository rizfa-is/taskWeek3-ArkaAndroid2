import java.lang.Exception
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
    try {
        println("Input year : ")
        val input = readLine()

        if (input != "") {
            val year = input!!.toInt()
//    Answer
            leapYear(year)
        } else if (input == "") {
            println("Field couldn't be empty!")
        }
    } catch (e: Exception) {
        println("Please, input positive integer only!")
    }
}

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

//    Answer 2
fun leapYear2(year: Int) {
    val startDate = Date("1/1/$year").time
    val endDate = Date("12/31/$year").time
    val sum = (TimeUnit.DAYS.convert((endDate - startDate), TimeUnit.MILLISECONDS)).toInt() + 1
    if (sum == 366) println("$year tahun kabisat") else println("$year bukan tahun kabisat")
}