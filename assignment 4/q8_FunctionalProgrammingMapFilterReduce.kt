
fun processNumbers(numbers: List<Int>): Int {
    return numbers.map { it * it }
                  .filter { it % 2 != 0 }
                  .reduce { acc, i -> acc + i }
}
