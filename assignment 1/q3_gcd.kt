fun main() {
    var a = 56
    var b = 98
    while (b != 0) {
        val t = b
        b = a % b
        a = t
    }
    println("GCD is $a")
}
