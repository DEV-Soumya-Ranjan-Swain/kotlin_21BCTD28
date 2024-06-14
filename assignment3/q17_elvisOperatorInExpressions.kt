fun sumNullable(a: Int?, b: Int?): Int {
    return if (a != null && b != null) a + b else -1
}

fun main() {
    println(sumNullable(3, 4)) // Output: 7
    println(sumNullable(null, 4)) // Output: -1
}