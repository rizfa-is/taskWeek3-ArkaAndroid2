import java.lang.Exception

fun main () {
    /*
    Q :
    Buat fungsi mengurutkan deret, dimana 0 adalh pemisah antar deret

    Algoritma :
    1. Start
    2. Masukkan deret angka
    3. Buat variabel str yg berisi hasil split deret berdasarkan 0
    4. Buat variabel strNew
    5. Lakukan looping dengan str.size sebagai limit
    6. Susun ulang deret ke i dengan map
    7. Urutkan dari kecil ke besar
    8. Jadikan bentuk string
    9. Isikan string tersebut ke strNew
    10. Lakukan looping 5 - 9 hingga bernilai false
    11. Jadikan strNew ke bentuk string
    12. Cetak strNew
    13. Finish

// Notice  = tointegerornull ?
    */

//    Utility
    try {
        println("Input number : ")
        val input = readLine()

        if (input != "") {
            val form = input.toString().trim{it <= '0'}
//    Answer 1
            deretAngka(form)
        } else if (input == "") {
            println("Field couldn't be empty!")
        }
    } catch (e: Exception) {
        println("Please, input integer only!")
    }
}

//    Answer 1
fun deretAngka(form: String) {
    val str = form.split("0")
    val strNew = mutableListOf<String>()

    for (i in 0 until str.size) {
        strNew.add(str[i].map { it }.sorted().joinToString(""))
    }
    println(strNew.joinToString(""))
}
