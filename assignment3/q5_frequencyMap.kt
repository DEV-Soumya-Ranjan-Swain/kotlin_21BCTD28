fun frequencyMap(numbers: List<Int>): Map<Int, Int> {
    return numbers.groupingBy { it }.eachCount()
}

fun main() {
    val numbers = listOf(1, 2, 2, 3, 3, 3, 4)
    println(frequencyMap(numbers)) // Output: {1=1, 2=2, 3=3, 4=1}
}