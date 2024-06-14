fun partitionNumbers(numbers: List<Int>): Pair<List<Int>, List<Int>> {
    return numbers.partition { it % 2 == 0 }
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val (evens, odds) = partitionNumbers(numbers)
    println("Evens: $evens, Odds: $odds") // Output: Evens: [2, 4, 6], Odds: [1, 3, 5]
}