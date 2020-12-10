import java.lang.Exception

fun main () {

    try {
        println("Input number : ")
        val input = readLine()

        if (input != "") {
            val numb = input!!.toInt()

            triangle(numb)
        } else if (input == "") {
            println("Field couldn't be empty!")
        }
    } catch (e: Exception) {
        println("Please, input positive integer only!")
    }

}

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

fun triangle2(numb: Int) {
    for (i in numb downTo 1) {
        for (a in 1 until i + 1) {
            print(a)
        }
        println()
    }
}

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
