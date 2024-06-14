fun filterStrings(list: List<Any>): List<String> {
    return list.mapNotNull { it as? String }
}

fun main() {
    val mixedList = listOf(1, "hello", 3.14, "world", true)
    println(filterStrings(mixedList)) // Output: [hello, world]
}