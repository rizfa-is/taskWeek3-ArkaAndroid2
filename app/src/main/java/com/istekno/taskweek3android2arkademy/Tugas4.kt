import android.os.Build
import androidx.annotation.RequiresApi
import java.lang.Exception
import java.time.LocalDateTime
import java.util.*

@RequiresApi(Build.VERSION_CODES.O)
fun main () {

    try {
        println("Input year of birth : ")
        val number = readLine()

        if (number != "") {
            val numb = number!!.toInt()

            println("Age : ${checkAge(numb)} years old")
        } else if (number == "") {
            println("Field couldn't be empty!")
        }
    } catch (e: Exception) {
        println("Please, input positive integer only!")
    }
}

@RequiresApi(Build.VERSION_CODES.O)
fun checkAge(yearOfBirth: Int) : Int {
    val nowYear = LocalDateTime.now().year
    return nowYear - yearOfBirth
}

fun checkAge2(yearOfBirth: Int) : Int = 2020 - yearOfBirth

@RequiresApi(Build.VERSION_CODES.N)
fun checkAge3(yearOfBirth: Int) : Int {
    val nowYear = Calendar.getInstance().weekYear
    return nowYear - yearOfBirth
}