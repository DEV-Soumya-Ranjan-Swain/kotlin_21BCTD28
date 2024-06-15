
val factorial: (Int) -> Int = { n ->
    (1..n).fold(1) { acc, i -> acc * i }
}

fun computeFactorial(n: Int): Int {
    return factorial(n)
}
