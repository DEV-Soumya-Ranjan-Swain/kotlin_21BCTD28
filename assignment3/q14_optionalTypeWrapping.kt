class Optional<T>(private val value: T?) {
    fun isPresent(): Boolean = value != null
    fun get(): T? = value
}

fun <T> wrapInOptional(value: T?): Optional<T> {
    return Optional(value)
}

fun main() {
    val wrapped = wrapInOptional("hello")
    println(wrapped.isPresent()) // Output: true
    println(wrapped.get()) // Output: hello
    val emptyWrapped = wrapInOptional(null)
    println(emptyWrapped.isPresent()) // Output: false
    println(emptyWrapped.get()) // Output: null
}