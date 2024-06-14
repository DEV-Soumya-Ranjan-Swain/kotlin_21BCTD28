class Address(val city: String?)
class Person(val address: Address?)

fun getCityName(person: Person): String {
    return person.address?.city ?: "Unknown City"
}

fun main() {
    val person1 = Person(Address("New York"))
    val person2 = Person(null)
    println(getCityName(person1)) // Output: New York
    println(getCityName(person2)) // Output: Unknown City
}