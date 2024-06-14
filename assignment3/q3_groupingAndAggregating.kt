  fun groupAndCount(strings: List<String>): Map<Char, Int> {
        return strings.groupBy { it.first() }
                      .mapValues { it.value.size }
    }

    fun main() {
        val strings = listOf("apple", "banana", "apricot", "blueberry", "cherry")
        println(groupAndCount(strings)) // Output: {a=2, b=2, c=1}
    }