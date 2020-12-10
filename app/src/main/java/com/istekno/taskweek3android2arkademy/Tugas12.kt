fun main () {

    println("Input sentence : ")
    val str = readLine().toString()
    val split = str.split(" ").size

    reverseSentence(str, split)
}

fun reverseSentence(str: String, split: Int) {
    var i = str.length - 1
    var count: Int
    var last = i + 1
    var result = ""

    if (str != " " && split >= 2) {
        while (i >= 0) {
            if (str[i] == ' ' || i == 0) {
                count = if (i == 0) i else i + 1

                while (count < last) {
                    result += str[count++]
                }
                result += " "
                last = i
            }
            i--
        }
        println(result)
    } else {
        println("Minimum 2 words")
    }
}

fun reverseSentence2(str: String, split: Int) {
    if (str != " " && split >= 2) {
        val newStr = str.split(" ").reversed().joinToString(" ")
        println(newStr)
    } else {
        println("Minimum 2 words")
    }
}
