import java.lang.Exception
import java.util.*
import java.util.concurrent.TimeUnit

fun main () {

    try {
        println("Input year : ")
        val input = readLine()

        if (input != "") {
            val year = input!!.toInt()

            leapYear(year)
        } else if (input == "") {
            println("Field couldn't be empty!")
        }
    } catch (e: Exception) {
        println("Please, input positive integer only!")
    }
}

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

fun leapYear2(year: Int) {
    val startDate = Date("1/1/$year").time
    val endDate = Date("12/31/$year").time
    val sum = (TimeUnit.DAYS.convert((endDate - startDate), TimeUnit.MILLISECONDS)).toInt() + 1
    if (sum == 366) println("$year tahun kabisat") else println("$year bukan tahun kabisat")
}