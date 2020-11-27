import java.lang.Exception

fun main () {
    /*
    Q :
    Buat fungsi menampilkan huruf vokal dan konsonan sesuai contoh

    Algoritma :
    1. Start
    2. Masukkan kata atau kalimat
    3. Buat array/list huruf vokal, lower dan upper case
    4. Buat mutable list
    5. Lakukan looping untuk mengisi list dengan huruf dari kata/kalimat
    6. Lakukan looping untuk cek apakah list huruf vokal mengandung huruf dalam list kata
    7. Jika iya cetak hurufnya
    8. Jika tidak, lanjut cek hingga false.
    9. Lakukan looping untuk cek apakah list huruf vokal tidak mengandung huruf dalam list kata
    10. Jika iya cetak hurufnya
    11. Jika tidak, lanjut cek hingga false.
    12. Finish

    Features :
    1. Implement handling lower/upper case in all function.
    2. Normal.
    3. Handle word/sentence.
    4. Handle sorting ascendingly for vowel & consonant before print by default

    Attention :
    1. In fourth features, you migth be found any unsorting letter cause it sorted by upper/lower case not alphabet

    */

//    Utility
    try {
        println("Input text : ")
        val input = readLine().toString()
        val vowel = arrayOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')

        if (input != "") {

//    Answer
            println("=== Answer 1 ===")
            printWords3(input, vowel)
        } else if (input == "") {
            println("Field couldn't be empty!")
        }
    } catch (e: Exception) {
        println("Please, input string only!")
    }

//    Utility


}

//    Answer 1 (Normal)
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

//    Answer 2
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

//    Answer 3
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
