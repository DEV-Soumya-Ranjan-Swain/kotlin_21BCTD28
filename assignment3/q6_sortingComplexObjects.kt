data class Person(val name: String, val age: Int)

fun sortPersons(persons: List<Person>): List<Person> {
    return persons.sortedWith(compareBy<Person> { it.age }.thenBy { it.name })
}

fun main() {
    val persons = listOf(Person("Alice", 30), Person("Bob", 25), Person("Charlie", 25))
    println(sortPersons(persons)) // Output: [Person(name=Bob, age=25), Person(name=Charlie, age=25), Person(name=Alice, age=30)]
}