import android.os.Build
import androidx.annotation.RequiresApi
import java.lang.Exception
import java.time.LocalDateTime
import java.util.*

@RequiresApi(Build.VERSION_CODES.O)
fun main () {
    /*
    Q :
    Buat fungsi menghitung umur dengan input parameter berupa tahun lahir

    Algoritma :
    1. Start
    2. Masukkan tahun lahir
    3. Buat variabel dengan nilai tahun sekarang
    4. Tahun sekarang - tahun lahir
    5. Cetak hasil pengurangan, "Age hasil years old"
    6. Finish

    */

//    Utility
    try {
        println("Input year of birth : ")
        val number = readLine()

        if (number != "") {
            val numb = number!!.toInt()
//    Answer
            println("Age : ${checkAge(numb)} years old")
        } else if (number == "") {
            println("Field couldn't be empty!")
        }
    } catch (e: Exception) {
        println("Please, input positive integer only!")
    }
}

//    Answer 1 (Required Min. API Level 26 for accessing now())
@RequiresApi(Build.VERSION_CODES.O)
fun checkAge(yearOfBirth: Int) : Int {
    val nowYear = LocalDateTime.now().year
    return nowYear - yearOfBirth
}

//    Answer 2 (manually update for current year)
fun checkAge2(yearOfBirth: Int) : Int = 2020 - yearOfBirth

//    Answer 3 (automatically update for current year)
@RequiresApi(Build.VERSION_CODES.N)
fun checkAge3(yearOfBirth: Int) : Int {
    val nowYear = Calendar.getInstance().weekYear
    return nowYear - yearOfBirth
}