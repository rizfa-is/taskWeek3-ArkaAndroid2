import java.util.*

fun main () {
    /*
    Q :
    Deteksi palindrom, cek apakah kata tersebut palindrom atau bukan.

    Algoritma :
    1. Start
    2. Masukkan kata, convert ke lowercase
    3. Buat variabel textNow
    4. Buat variabel i = jumlah huruf - 1
    5. Masuk looping, cek apakah i >= 0
    6. Jika iya, isi textNow dengan huruf ke i dari kata
    7. i dikurangi 1
    8. Lakukan looping nomor 5 - 7 hingga bernilai false
    9. Cek textNow = text
    10. Jika iya, cetak text is palindrome
    11. Jika tidak, cetak text isn't palindrome
    12. Finish

    */

//    Utility
    println("Input word : ")
    val text = readLine().toString().toLowerCase(Locale.ROOT)

//    Answer
    palindrome(text)
}

//    Answer 1
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