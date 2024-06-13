tailrec fun factorial(n: Int, accumulator: Long = 1): Long {
    return if (n <= 1) accumulator else factorial(n - 1, accumulator * n)
}

fun main() {
    println("Factorial of 5: ${factorial(5)}")
    println("Factorial of 20: ${factorial(20)}")
}