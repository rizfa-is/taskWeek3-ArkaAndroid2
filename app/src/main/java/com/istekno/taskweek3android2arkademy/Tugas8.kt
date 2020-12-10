import java.lang.Exception

fun main () {

    try {
        println("Input MTK value : ")
        val input1 = readLine()
        println("Input Indonesian value : ")
        val input2 = readLine()
        println("Input English value : ")
        val input3 = readLine()
        println("Input Science value : ")
        val input4 = readLine()

        if (input1 != "" || input2 != "" || input3 != "" || input4 != "") {
            val mtk = input1!!.toInt()
            val ind = input2!!.toInt()
            val eng = input3!!.toInt()
            val sci = input4!!.toInt()

            val average = listOf(mtk, ind, eng, sci).average().toInt()
            grade(average)
        } else if (input1 == "" || input2 == "" || input3 == "" || input4 == "") {
            println("Field couldn't be empty!")
        }
    } catch (e: Exception) {
        println("Please, input positive fraction/integer only!")
    }
}

fun grade(value: Int) = when (value) {
    in 90..100 -> println("Your average is $value and grade is A")
    in 80..89 -> println("Your average is $value and grade is B")
    in 70..79 -> println("Your average is $value and grade is C")
    in 60..69 -> println("Your average is $value and grade is D")
    else -> println("Your average is $value and grade is E")
}