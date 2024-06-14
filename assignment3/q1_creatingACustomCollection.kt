class UniqueList<T> {
    private val elements = mutableListOf<T>()
    
    fun add(element: T): Boolean {
        return if (element !in elements) {
            elements.add(element)
            true
        } else {
            false
        }
    }

    fun remove(element: T): Boolean {
        return elements.remove(element)
    }

    fun contains(element: T): Boolean {
        return element in elements
    }
    
    override fun toString(): String {
        return elements.toString()
    }
}
fun main() {
    val uniqueList = UniqueList<Int>()
    uniqueList.add(1)
    uniqueList.add(2)
    uniqueList.add(2) // Will not be added
    println(uniqueList) // Output: [1, 2]
}