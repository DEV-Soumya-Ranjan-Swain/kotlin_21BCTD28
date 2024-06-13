# ASSIGNMENT 1

### 1. Print the pattern

```kotlin
fun main() {
    val n = 5

    for (i in 1..n) {
        for (j in 1..n - i) {
            print(" ")
        }
        for (k in 1..(2 * i - 1)) {
            print("*")
        }
        println()
    }


    for (i in n - 1 downTo 1) {
        for (j in 1..n - i) {
            print(" ")
        }
        for (k in 1..(2 * i - 1)) {
            print("*")
        }
        println()
    }
}
```

### 2. Check if the number is Armstrong number or not

```kotlin
fun main() {
    val number = 153
    var temp = number
    var digits = 0
    while (temp != 0) {
        temp /= 10
        digits++
    }
    temp = number
    var sum = 0
    while (temp != 0) {
        val remainder = temp % 10
        sum += Math.pow(remainder.toDouble(), digits.toDouble()).toInt()
        temp /= 10
    }
    if (sum == number) 
        println("$number is an Armstrong number") 
    else 
        println("$number is not an Armstrong number")
}
```

### 3. Find the GCD of two numbers using Euclidean method

```kotlin
fun main() {
    var a = 56
    var b = 98
    while (b != 0) {
        val t = b
        b = a % b
        a = t
    }
    println("GCD is $a")
}
```

### 4. Find the frequency of letters in a string

```kotlin
fun main() {
    val str = "hello world"
    val frequency = mutableMapOf<Char, Int>()
    for (char in str) {
        if (char.isLetter()) {
            frequency[char] = frequency.getOrDefault(char, 0) + 1
        }
    }
    for ((char, count) in frequency) {
        println("$char: $count")
    }
}
```

### 5. Check if a number is a duck number or not

```kotlin
fun main() {
    val number = "1023"
    if (number.contains('0') && number[0] != '0') 
        println("$number is a Duck number") 
    else 
        println("$number is not a Duck number")
}
```
