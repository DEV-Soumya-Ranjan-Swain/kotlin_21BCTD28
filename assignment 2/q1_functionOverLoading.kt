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