
fun accessArrayElement(arr: Array<Int>, index: Int): Int? {
    return try {
        arr[index]
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Error: Index out of bounds")
        null
    } finally {
        println("End of operation")
    }
}
