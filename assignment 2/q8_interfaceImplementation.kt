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