package com.istekno.taskweek3android2arkademy

fun main () {
/*
       Q :
       Buat fungsi menampilkan huruf vokal dan konsonan sesuai contoh

       Algoritma :

       Features :
       1. Implement handling lower/upper case in all function.
       2. Normal.
       3. Handle word/sentence.
       4. Handle sorting ascendingly for vowel & consonant before print by default

       Attention :
       1. In fourth features, you migth be found any unsorting letter cause it sorted by upper/lower case not alphabet

       */

//    Utility
    println("Input word : ")
    val form = readLine().toString()
    val vowel = arrayOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')

//    Answer 1
    println("=== Answer 1 ===")
    printWords(form, vowel)
    println()

//    Answer 2
    println("=== Answer 2 ===")
    printWords2(form, vowel)
    println()

//    Answer 3
    println("=== Answer 3 ===")
    printWords3(form, vowel)
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
        if (!vowel.contains(word[i])){
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
        if (!vowel.contains(word[i])){
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
        if (!vowel.contains(word[i])){
            str3.add(word[i])
        }
    }
    str3.sorted().forEach {
        println(it)
    }
}
