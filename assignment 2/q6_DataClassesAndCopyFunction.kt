data class Person(val name: String, val age: Int, val address: String)

fun main() {
    val person1 = Person("John", 25, "123 Main St")
    val person2 = person1.copy(age = 30, address = "456 Elm St")
    
    println(person1)
    println(person2)
}