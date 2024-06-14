fun intersection(list1: List<Int>, list2: List<Int>): List<Int> {
    return list1.intersect(list2).toList().sorted()
}

fun union(list1: List<Int>, list2: List<Int>): List<Int> {
    return list1.union(list2).toList().sorted()
}

fun main() {
    val list1 = listOf(1, 2, 3, 4)
    val list2 = listOf(3, 4, 5, 6)
    println("Intersection: ${intersection(list1, list2)}") // Output: [3, 4]
    println("Union: ${union(list1, list2)}") // Output: [1, 2, 3, 4, 5, 6]
}