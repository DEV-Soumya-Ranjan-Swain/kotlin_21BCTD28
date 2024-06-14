fun doubleNonNullValues(numbers: List<Int?>): List<Int> {
    return numbers.mapNotNull { it?.times(2) }
}

fun main() {
    val numbers = listOf(1, null, 3, null, 5)
    println(doubleNonNullValues(numbers)) // Output: [2, 6, 10]
}