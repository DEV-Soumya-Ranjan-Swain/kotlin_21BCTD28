fun printUpperCase(str: String?) {
    str?.let {
        println(it.uppercase())
    } ?: println("String is null")
}

fun main() {
    printUpperCase("hello") // Output: HELLO
    printUpperCase(null) // Output: String is null
}