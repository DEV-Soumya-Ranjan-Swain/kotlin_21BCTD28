
# ASSIGNMENT 2

## Basic Programming Questions on Functions

### 1. Function Overloading

```kotlin
fun calculateArea(length: Double, breadth: Double): Double {
    return length * breadth
}

fun calculateArea(radius: Double): Double {
    return Math.PI * radius * radius
}

fun main() {
    println("Area of Rectangle: ${calculateArea(5.0, 3.0)}")
    println("Area of Circle: ${calculateArea(2.5)}")
}
```

### 2. Higher-Order Functions

```kotlin
fun operation(a: Int, b: Int, func: (Int, Int) -> Int): Int {
    return func(a, b)
}

fun main() {
    val sum = operation(5, 3) { x, y -> x + y }
    val product = operation(5, 3) { x, y -> x * y }
    
    println("Sum: $sum")
    println("Product: $product")
}
```

### 3. Extension Functions

```kotlin
fun String.isPalindrome(): Boolean {
    return this == this.reversed()
}

fun main() {
    println("madam".isPalindrome())
    println("hello".isPalindrome())
}
```

### 4. Recursive Functions

```kotlin
tailrec fun factorial(n: Int, accumulator: Long = 1): Long {
    return if (n <= 1) accumulator else factorial(n - 1, accumulator * n)
}

fun main() {
    println("Factorial of 5: ${factorial(5)}")
    println("Factorial of 20: ${factorial(20)}")
}
```

## Advanced Programming Questions on Classes

### 1. Inheritance and Polymorphism

```kotlin
abstract class Shape {
    abstract fun area(): Double
}

class Rectangle(private val length: Double, private val breadth: Double) : Shape() {
    override fun area(): Double {
        return length * breadth
    }

    fun perimeter(): Double {
        return 2 * (length + breadth)
    }
}

class Circle(private val radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }

    fun perimeter(): Double {
        return 2 * Math.PI * radius
    }
}

fun main() {
    val shapes: List<Shape> = listOf(Rectangle(5.0, 3.0), Circle(2.5))

    for (shape in shapes) {
        println("Area: ${shape.area()}")
    }
}
```

### 2. Data Classes and Copy Function

```kotlin
data class Person(val name: String, val age: Int, val address: String)

fun main() {
    val person1 = Person("John", 25, "123 Main St")
    val person2 = person1.copy(age = 30, address = "456 Elm St")
    
    println(person1)
    println(person2)
}
```

### 3. Companion Objects and Factory Methods

```kotlin
class User private constructor(val name: String, val age: Int) {
    companion object {
        fun createUserWithName(name: String): User {
            return User(name, DEFAULT_AGE)
        }

        fun createUser(name: String = DEFAULT_NAME, age: Int = DEFAULT_AGE): User {
            return User(name, age)
        }

        private const val DEFAULT_NAME = "John Doe"
        private const val DEFAULT_AGE = 30
    }
}

fun main() {
    val user1 = User.createUserWithName("Alice")
    println("User 1: Name - ${user1.name}, Age - ${user1.age}")

    val user2 = User.createUser("Bob", 25)
    println("User 2: Name - ${user2.name}, Age - ${user2.age}")

    val user3 = User.createUser()
    println("User 3: Name - ${user3.name}, Age - ${user3.age}")
}

```

### 4. Interface Implementation

```kotlin
interface Drawable {
    fun draw()
    fun resize(factor: Double)
}

class Square(private var side: Double) : Drawable {
    override fun draw() {
        println("Drawing a square with side $side")
    }

    override fun resize(factor: Double) {
        side *= factor
    }
}

class Triangle(private var base: Double, private var height: Double) : Drawable {
    override fun draw() {
        println("Drawing a triangle with base $base and height $height")
    }

    override fun resize(factor: Double) {
        base *= factor
        height *= factor
    }
}

fun main() {
    val square = Square(4.0)
    val triangle = Triangle(3.0, 5.0)

    square.draw()
    triangle.draw()

    square.resize(1.5)
    triangle.resize(2.0)

    square.draw()
    triangle.draw()
}
```

### 5. Singleton Pattern

```kotlin
object DatabaseConnection {
    init {
        println("DatabaseConnection created")
    }

    fun connect() {
        println("Connected to database")
    }
}

fun main() {
    val connection1 = DatabaseConnection
    val connection2 = DatabaseConnection
    
    connection1.connect()
    connection2.connect()
}
```
