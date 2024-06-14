fun flattenAndRemoveDuplicates(nestedList: List<List<Int>>): List<Int> {
        return nestedList.flatten().distinct()
    }

    fun main() {
        val nestedList = listOf(listOf(1, 2, 3), listOf(3, 4, 5), listOf(5, 6, 7))
        println(flattenAndRemoveDuplicates(nestedList)) // Output: [1, 2, 3, 4, 5, 6, 7]
    }