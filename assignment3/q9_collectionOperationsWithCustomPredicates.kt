fun filterStrings(strings: List<String>, predicate: (String) -> Boolean): List<String> {
    return strings.filter(predicate)
}

fun main() {
    val strings = listOf("apple", "banana", "cherry", "date")
    val filtered = filterStrings(strings) { it.contains("a") }
    println(filtered) // Output: [apple, banana, date]
}