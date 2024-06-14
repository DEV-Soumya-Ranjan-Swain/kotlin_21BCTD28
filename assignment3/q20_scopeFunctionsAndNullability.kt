fun sortAndPrintList(numbers: List<Int>?) {
    numbers?.run {
        sorted().forEach { println(it) }
    }
}

fun main() {
    sortAndPrintList(listOf(3, 1, 4, 1, 5, 9)) // Output: 1, 1, 3, 4, 5, 9
    sortAndPrintList(null) // No output
}