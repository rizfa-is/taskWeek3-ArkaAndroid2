fun main () {
    var x = 10
    var y = 20
    val z = x

    println("Nilai x sebelum ditukar : $x")
    println("Nilai y sebelum ditukar : $y")

    x = y
    y = z

    println("============================")
    println("Nilai x sesudah ditukar : $x")
    println("Nilai y sesudah ditukar : $y")
    println("=============================")

    var x2 = 10
    var y2 = 20

    println("Nilai x2 sebelum ditukar : $x2")
    println("Nilai y2 sebelum ditukar : $y2")

    run { val a = x2; x2 = y2; y2 = a }

    println("=============================")
    println("Nilai x2 sesudah ditukar : $x2")
    println("Nilai y2 sesudah ditukar : $y2")
}