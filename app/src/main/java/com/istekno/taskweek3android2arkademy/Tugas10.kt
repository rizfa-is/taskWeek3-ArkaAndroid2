import java.lang.Exception

fun main () {

    try {
        println("Input text : ")
        val input = readLine().toString()
        val vowel = arrayOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')

        if (input != "") {

            println("=== Answer 1 ===")
            printWords3(input, vowel)
        } else if (input == "") {
            println("Field couldn't be empty!")
        }
    } catch (e: Exception) {
        println("Please, input string only!")
    }
}

fun printWords(string: String, vowel: Array<Char>) {
    val word = mutableListOf<Char>()
    for (element in string) {
        word.add(element)
    }

    for (i in 0 until word.size) {
        if (vowel.contains(word[i])){
            println(word[i])
        }
    }

    for (i in 0 until word.size) {
        if (!(vowel.contains(word[i]))){
            println(word[i])
        }
    }
}

fun printWords2(string: String, vowel: Array<Char>) {
    val str = string.replace("\\s".toRegex(), "")
    val word = mutableListOf<Char>()
    for (element in str) {
        word.add(element)
    }

    for (i in 0 until word.size) {
        if (vowel.contains(word[i])){
            println(word[i])
        }
    }

    for (i in 0 until word.size) {
        if (!(vowel.contains(word[i]))){
            println(word[i])
        }
    }
}

fun printWords3(string: String, vowel: Array<Char>) {
    val str = string.replace("\\s".toRegex(), "")
    val str2 = mutableListOf<Char>()
    val str3 = mutableListOf<Char>()
    val word = mutableListOf<Char>()
    for (element in str) {
        word.add(element)
    }

    for (i in 0 until word.size) {
        if (vowel.contains(word[i])){
            str2.add(word[i])
        }
    }
    str2.sorted().forEach {
        println(it)
    }

    for (i in 0 until word.size) {
        if (!(vowel.contains(word[i]))){
            str3.add(word[i])
        }
    }
    str3.sorted().forEach {
        println(it)
    }
}
