import java.util.*

fun main () {

    println("Input word : ")
    val text = readLine().toString().toLowerCase(Locale.ROOT)

    palindrome(text)
}

fun palindrome(text: String) {
    var textNow = ""
    var i = text.length - 1

    while ( i >= 0 ) {
        textNow += text[i].toString()
        i--
    }

    if (textNow == text) {
        println("$text is palindrome")
    } else {
        println("$text isn't palindrome")
    }
}