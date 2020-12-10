import java.lang.Exception

fun main () {

    try {
        println("Input base : ")
        val numb1 = readLine()
        println("Input height : ")
        val numb2 = readLine()

        if (numb1 != "" || numb2 != "") {
            val base = numb1!!.toDouble()
            val height = numb2!!.toDouble()

            println("Circle area is ${triangleArea(base, height)}")
        } else if (numb1 == "" || numb2 == "") {
            println("Field couldn't be empty!")
        }
    } catch (e: Exception) {
        println("Please, input positive fraction/integer only!")
    }
}

fun triangleArea(base: Double, height: Double) : Double = 0.5 * base * height