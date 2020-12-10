import java.lang.Exception

fun main () {

    try {
        println("Input number: ")
        val number = readLine()

        if (number != "") {
            val numb = number!!.toInt()

            println(checkOddEven(numb))
        } else if (number == "") {
            println("Field couldn't be empty!")
        }
    } catch (e: Exception) {
        println("Please, input positive integer only!")
    }
}

fun checkOddEven(numb: Int) = if (numb % 2 == 0) println("$numb is even") else println("$numb is odd")

val checkOddEven2: (numb: Int) -> Unit = {
    if (it % 2 == 0) println("$it is even")
    else println("$it is odd")
}