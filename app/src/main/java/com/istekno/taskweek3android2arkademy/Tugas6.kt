import java.lang.Exception

fun main () {
    /*
    Q :
    Buat fungsi menghitung luas lingkaran dengan input parameter berupa jari-jari

    Algoritma :
    1. Start
    2. Masukkan nilai jari-jari
    3. Cek apakah jari-jari habis dibagi 7
    4. Jika iya, gunakan phi = 22/7
    5. Jika tidak, gunakan phi = 3.14
    6. Hitung luas dengan rumus = phi x jari-jari x jari-jari
    7. Cetak hasil perhitungan luas
    8. Finish

    */

//    Utility
    try {
        println("Input radius : ")
        val input = readLine()

        if (input != "") {
            val radius = input!!.toDouble()
//    Answer
            println("Round area is ${roundArea(radius)}")
        } else if (input == "") {
            println("Field couldn't be empty!")
        }
    } catch (e: Exception) {
        println("Please, input positive fraction/integer only!")
    }
}

//    Answer 1
fun roundArea(rad: Double) : Double {
    val phi : Double = if (rad % 7 == 0.0) (22/7).toDouble() else 3.14
    return phi * Math.pow(rad, 2.0)
}