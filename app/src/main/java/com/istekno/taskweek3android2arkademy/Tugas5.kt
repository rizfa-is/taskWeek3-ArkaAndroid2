import java.lang.Exception

fun main () {
    /*
    Q :
    Buat fungsi menghitung luas segitiga dengan input parameter berupa alas dan tinggi

    Algoritma :
    1. Start
    2. Masukkan nilai alas
    3. Masukkan nilai tinggi
    4. Hitung luas dengan rumus = 1/2 x alas x tinggi
    5. Cetak hasil perhitungan luas segitiga
    6. Finish

    */

//    Utility
    try {
        println("Input base : ")
        val numb1 = readLine()
        println("Input height : ")
        val numb2 = readLine()

        if (numb1 != "" || numb2 != "") {
            val base = numb1!!.toDouble()
            val height = numb2!!.toDouble()
//    Answer
            println("Circle area is ${triangleArea(base, height)}")
        } else if (numb1 == "" || numb2 == "") {
            println("Field couldn't be empty!")
        }
    } catch (e: Exception) {
        println("Please, input positive fraction/integer only!")
    }
}

//    Answer 1
fun triangleArea(base: Double, height: Double) : Double = 0.5 * base * height