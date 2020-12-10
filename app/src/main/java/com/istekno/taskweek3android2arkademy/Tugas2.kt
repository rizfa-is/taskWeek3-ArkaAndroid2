fun main () {
    var x = 10
    var y = 20

    println("Nilai x sebelum ditukar : $x")
    println("Nilai y sebelum ditukar : $y")

    x = x - y
    y = x + y
    x = y - x

    println("=============================")
    println("Nilai x sesudah ditukar : $x")
    println("Nilai y sesudah ditukar : $y")
    println("========++++++++++++=========")

    var x2 = 10
    var y2 = 20

    println("Nilai x2 sebelum ditukar : $x2")
    println("Nilai y2 sebelum ditukar : $y2")

    x2 = y2.also { y2 = x2 }

    println("=============================")
    println("Nilai x2 sesudah ditukar : $x2")
    println("Nilai y2 sesudah ditukar : $y2")
    println("========++++++++++++=========")

    var x3 = 10
    var y3 = 20

    println("Nilai x3 sebelum ditukar : $x3")
    println("Nilai y3 sebelum ditukar : $y3")

    with(x3) {
        x3 = y3
        y3 = this
    }

    println("============================")
    println("Nilai x3 sesudah ditukar : $x3")
    println("Nilai y3 sesudah ditukar : $y3")
    println("========++++++++++++=========")
}