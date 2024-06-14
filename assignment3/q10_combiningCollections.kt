fun alternateCombine(list1: List<Int>, list2: List<Int>): List<Int> {
    val maxLength = maxOf(list1.size, list2.size)
    val result = mutableListOf<Int>()
    for (i in 0 until maxLength) {
        if (i < list1.size) result.add(list1[i])
        if (i < list2.size) result.add(list2[i])
    }
    return result
}

fun main() {
    val list1 = listOf(1, 3, 5)
    val list2 = listOf(2, 4, 6, 8, 10)
    println(alternateCombine(list1, list2)) // Output: [1, 2, 3, 4, 5, 6, 8, 10]
}