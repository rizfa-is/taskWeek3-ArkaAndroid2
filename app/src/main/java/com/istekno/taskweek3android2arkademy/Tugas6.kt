import java.lang.Exception

fun main () {

    try {
        println("Input radius : ")
        val input = readLine()

        if (input != "") {
            val radius = input!!.toDouble()

            println("Round area is ${roundArea(radius)}")
        } else if (input == "") {
            println("Field couldn't be empty!")
        }
    } catch (e: Exception) {
        println("Please, input positive fraction/integer only!")
    }
}

fun roundArea(rad: Double) : Double {
    val phi : Double = if (rad % 7 == 0.0) (22/7).toDouble() else 3.14
    return phi * Math.pow(rad, 2.0)
}