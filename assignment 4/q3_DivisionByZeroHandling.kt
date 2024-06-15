
fun divide(a: Int, b: Int): String {
    return try {
        val result = a / b
        "Result: $result"
    } catch (e: ArithmeticException) {
        "Error: Division by zero"
    }
}
