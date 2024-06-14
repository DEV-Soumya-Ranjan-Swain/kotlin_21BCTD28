fun getStringLength(str: String?): Int {
    return str?.length ?: -1
}

fun main() {
    println(getStringLength("hello")) // Output: 5
    println(getStringLength(null)) // Output: -1
}