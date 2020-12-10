import java.lang.Exception

fun main () {

    try {
        println("Input number : ")
        val input = readLine()

        if (input != "") {
            val form = input.toString().trim{it <= '0'}

            deretAngka(form)
        } else if (input == "") {
            println("Field couldn't be empty!")
        }
    } catch (e: Exception) {
        println("Please, input integer only!")
    }
}

fun deretAngka(form: String) {
    val str = form.split("0")
    val strNew = mutableListOf<String>()

    for (i in 0 until str.size) {
        strNew.add(str[i].map { it }.sorted().joinToString(""))
    }
    println(strNew.joinToString(""))
}
