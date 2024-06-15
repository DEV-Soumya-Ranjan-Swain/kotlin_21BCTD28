# ASSIGNMENT 4

## Coding Questions on Coroutines in Kotlin

### 1. Basic Coroutine Example

```kotlin
import kotlinx.coroutines.*

fun main() = runBlocking {
    launch {
        println("Hello")
        delay(1000L)
        println("World")
    }
}
```

### 2. Coroutine with Exception Handling

```kotlin
import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch {
        try {
            riskyTask()
        } catch (e: Exception) {
            println("Caught exception: ${e.message}")
        }
    }
    job.join()
}

suspend fun riskyTask() {
    delay(500L)
    throw RuntimeException("Something went wrong")
}
```

### 3. Basic try-catch Example

#### Division by Zero Handling

```kotlin
fun divide(a: Int, b: Int): String {
    return try {
        val result = a / b
        "Result: $result"
    } catch (e: ArithmeticException) {
        "Error: Division by zero"
    }
}
```

#### Custom Exception: InvalidAgeException

```kotlin
class InvalidAgeException(message: String): Exception(message)

fun checkAge(age: Int) {
    if (age < 18) {
        throw InvalidAgeException("Age must be 18 or older")
    }
    println("Age is valid")
}
```

#### Array Access with Finally Block

```kotlin
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
```

### 4. Coroutine with Timeout

```kotlin
import kotlinx.coroutines.*

fun main() = runBlocking {
    try {
        withTimeout(2000L) {
            longRunningTask()
        }
    } catch (e: TimeoutCancellationException) {
        println("Task timed out")
    }
}

suspend fun longRunningTask() {
    delay(3000L)
    println("Task completed")
}
```

### Advanced Coding Questions on Lambdas in Kotlin

#### 1. Lambda for Sorting

```kotlin
fun sortByAge(people: List<Pair<String, Int>>): List<Pair<String, Int>> {
    return people.sortedBy { it.second }
}
```

#### 2. Functional Programming: map, filter, reduce

```kotlin
fun processNumbers(numbers: List<Int>): Int {
    return numbers.map { it * it }
                  .filter { it % 2 != 0 }
                  .reduce { acc, i -> acc + i }
}
```

#### 3. Lambda with Closures

```kotlin
fun adder(x: Int): (Int) -> Int {
    return { y -> x + y }
}
```

#### 4. Lambda with Higher-Order Functions

```kotlin
fun transformList(strings: List<String>, transform: (String) -> String): List<String> {
    return strings.map(transform)
}
```

#### 5. Lambdas with Collections

```kotlin
fun processStrings(strings: List<String>, letter: Char): List<String> {
    return strings.filter { it.startsWith(letter) }
                  .map { it.uppercase() }
                  .sorted()
}
```

#### 6. Lambda with Return Type Inference: Factorial

```kotlin
val factorial: (Int) -> Int = { n ->
    (1..n).fold(1) { acc, i -> acc * i }
}

fun computeFactorial(n: Int): Int {
    return factorial(n)
}
```
