# ASSIGNMENT 3

## Kotlin Collections Practice Questions

1. **Creating a Custom Collection**

    Create a custom collection class in Kotlin that mimics the behavior of a list but only allows unique elements. Implement methods to add, remove, and check for elements, ensuring that duplicates are not added.

    ```kotlin
    class UniqueList<T> {
        private val elements = mutableListOf<T>()
        
        fun add(element: T): Boolean {
            return if (element !in elements) {
                elements.add(element)
                true
            } else {
                false
            }
        }

        fun remove(element: T): Boolean {
            return elements.remove(element)
        }

        fun contains(element: T): Boolean {
            return element in elements
        }

        override fun toString(): String {
            return elements.toString()
        }
    }

    fun main() {
        val uniqueList = UniqueList<Int>()
        uniqueList.add(1)
        uniqueList.add(2)
        uniqueList.add(2)
        println(uniqueList)
    }
    ```

2. **Filtering and Transforming Collections**

    Given a list of numbers, filter out the odd numbers, double the even numbers, and return the resulting list. Use higher-order functions like `filter` and `map`.

    ```kotlin
    fun transformList(numbers: List<Int>): List<Int> {
        return numbers.filter { it % 2 == 0 }
                      .map { it * 2 }
    }

    fun main() {
        val numbers = listOf(1, 2, 3, 4, 5, 6)
        println(transformList(numbers))
    }
    ```

3. **Grouping and Aggregating**

    Given a list of strings, group them by their first character and create a map where the keys are the first characters and the values are lists of strings starting with that character. Then count the number of strings in each group.

    ```kotlin
    fun groupAndCount(strings: List<String>): Map<Char, Int> {
        return strings.groupBy { it.first() }
                      .mapValues { it.value.size }
    }

    fun main() {
        val strings = listOf("apple", "banana", "apricot", "blueberry", "cherry")
        println(groupAndCount(strings))
    }
    ```

4. **Flattening Nested Collections**

    Given a list of lists of integers, write a function that flattens it into a single list of integers and removes any duplicate values.

    ```kotlin
    fun flattenAndRemoveDuplicates(nestedList: List<List<Int>>): List<Int> {
        return nestedList.flatten().distinct()
    }

    fun main() {
        val nestedList = listOf(listOf(1, 2, 3), listOf(3, 4, 5), listOf(5, 6, 7))
        println(flattenAndRemoveDuplicates(nestedList))
    }
    ```

5. **Frequency Map**

    Write a function that takes a list of integers and returns a map where the keys are the integers and the values are the frequency of each integer in the list.

    ```kotlin
    fun frequencyMap(numbers: List<Int>): Map<Int, Int> {
        return numbers.groupingBy { it }.eachCount()
    }

    fun main() {
        val numbers = listOf(1, 2, 2, 3, 3, 3, 4)
        println(frequencyMap(numbers))
    }
    ```

6. **Sorting Complex Objects**

    Given a list of `Person` objects (each with `name` and `age` properties), sort the list first by age in ascending order and then by name in alphabetical order if ages are equal.

    ```kotlin
    data class Person(val name: String, val age: Int)

    fun sortPersons(persons: List<Person>): List<Person> {
        return persons.sortedWith(compareBy<Person> { it.age }.thenBy { it.name })
    }

    fun main() {
        val persons = listOf(Person("Alice", 30), Person("Bob", 25), Person("Charlie", 25))
        println(sortPersons(persons))
    }
    ```

7. **Partitioning Collections**

    Given a list of integers, partition it into two lists: one containing the even numbers and the other containing the odd numbers. Return both lists.

    ```kotlin
    fun partitionNumbers(numbers: List<Int>): Pair<List<Int>, List<Int>> {
        return numbers.partition { it % 2 == 0 }
    }

    fun main() {
        val numbers = listOf(1, 2, 3, 4, 5, 6)
        val (evens, odds) = partitionNumbers(numbers)
        println("Evens: $evens, Odds: $odds")
    }
    ```

8. **Intersection and Union**

    Write functions to find the intersection and union of two lists of integers. Ensure that the results are unique and sorted.

    ```kotlin
    fun intersection(list1: List<Int>, list2: List<Int>): List<Int> {
        return list1.intersect(list2).toList().sorted()
    }

    fun union(list1: List<Int>, list2: List<Int>): List<Int> {
        return list1.union(list2).toList().sorted()
    }

    fun main() {
        val list1 = listOf(1, 2, 3, 4)
        val list2 = listOf(3, 4, 5, 6)
        println("Intersection: ${intersection(list1, list2)}")
        println("Union: ${union(list1, list2)}")
    }
    ```

9. **Collection Operations with Custom Predicates**

    Given a list of strings, write a function that filters out strings that do not match a given predicate (e.g., strings that do not contain a certain substring or strings that are not of a certain length).

    ```kotlin
    fun filterStrings(strings: List<String>, predicate: (String) -> Boolean): List<String> {
        return strings.filter(predicate)
    }

    fun main() {
        val strings = listOf("apple", "banana", "cherry", "date")
        val filtered = filterStrings(strings) { it.contains("a") }
        println(filtered)
    }
    ```

10. **Combining Collections**

    Given two lists of integers, create a new list that alternates elements from each list. If one list is longer, append the remaining elements at the end.

    ```kotlin
    fun alternateCombine(list1: List<Int>, list2: List<Int>): List<Int> {
        val maxLength = maxOf(list1.size, list2.size)
        val result = mutableListOf<Int>()
        for (i in 0 until maxLength) {
            if (i < list1.size) result.add(list1[i])
            if (i < list2.size) result.add(list2[i])
        }
        return result
    }

    fun main() {
        val list1 = listOf(1, 3, 5)
        val list2 = listOf(2, 4, 6, 8, 10)
        println(alternateCombine(list1, list2))
    }
    ```

## Kotlin Null Safety Practice Questions

1. **Safe Calls and Elvis Operator**

    Write a function that takes a nullable string and returns its length if it is not null or -1 if it is null. Use the safe call operator (?.) and the Elvis operator (?:).

    ```kotlin
    fun getStringLength(str: String?): Int {
        return str?.length ?: -1
    }

    fun main() {
        println(getStringLength("hello"))
        println(getStringLength(null))
    }
    ```

2. **Safe Casting with as?**

    Given a list of `Any` type, write a function that filters out all elements that are not strings and returns a list of strings. Use safe casting (`as?`).

    ```kotlin
    fun filterStrings(list: List<Any>): List<String> {
        return list.mapNotNull { it as? String }
    }

    fun main() {
        val mixedList = listOf(1, "hello", 3.14, "world", true)
        println(filterStrings(mixedList))
    }
    ```

3. **Nullability and Collections**

    Given a list of nullable integers, write a function that returns a list of non-null integers. Use the `filterNotNull` function.

    ```kotlin
    fun filterNonNullIntegers(numbers: List<Int?>): List<Int>
    {
        return numbers.filterNotNull()
    }

    fun main() {
        val numbers = listOf(1, null, 3, null, 5)
        println(filterNonNullIntegers(numbers))
    }
    ```

4. **Optional Type Wrapping**

    Create a function that wraps a given value in an `Optional` type (or a similar custom wrapper) if it is not null and returns an empty wrapper if it is null.

    ```kotlin
    class Optional<T>(private val value: T?) {
        fun isPresent(): Boolean = value != null
        fun get(): T? = value
    }

    fun <T> wrapInOptional(value: T?): Optional<T> {
        return Optional(value)
    }

    fun main() {
        val wrapped = wrapInOptional("hello")
        println(wrapped.isPresent())
        println(wrapped.get())

        val emptyWrapped = wrapInOptional(null)
        println(emptyWrapped.isPresent())
        println(emptyWrapped.get())
    }
    ```

5. **Handling Null with let**

    Write a function that takes a nullable string and prints its uppercase version if it is not null; otherwise, prints “String is null”. Use the `let` function.

    ```kotlin
    fun printUpperCase(str: String?) {
        str?.let {
            println(it.uppercase())
        } ?: println("String is null")
    }

    fun main() {
        printUpperCase("hello")
        printUpperCase(null)
    }
    ```

6. **Null Safety with Higher-Order Functions**

    Given a list of nullable integers, write a function that doubles the non-null values and returns a list of these doubled values. Use `mapNotNull`.

    ```kotlin
    fun doubleNonNullValues(numbers: List<Int?>): List<Int> {
        return numbers.mapNotNull { it?.times(2) }
    }

    fun main() {
        val numbers = listOf(1, null, 3, null, 5)
        println(doubleNonNullValues(numbers))
    }
    ```

7. **Elvis Operator in Expressions**

    Write a function that takes two nullable integers and returns their sum if both are not null or -1 if any of them is null. Use the Elvis operator.

    ```kotlin
    fun sumNullable(a: Int?, b: Int?): Int {
        return if (a != null && b != null) a + b else -1
    }

    fun main() {
        println(sumNullable(3, 4))
        println(sumNullable(null, 4))
    }
    ```

8. **Null Safety in Data Classes**

    Define a data class `User` with nullable properties `name` and `email`. Write a function that prints “Incomplete User” if any property is null; otherwise, prints the user’s details.

    ```kotlin
    data class User(val name: String?, val email: String?)

    fun printUser(user: User) {
        if (user.name == null || user.email == null) {
            println("Incomplete User")
        } else {
            println("User(name=${user.name}, email=${user.email})")
        }
    }

    fun main() {
        val user1 = User("Alice", "alice@example.com")
        val user2 = User(null, "bob@example.com")
        printUser(user1)
        printUser(user2)
    }
    ```

9. **Chaining Safe Calls**

    Given a class `Person` with a nullable property `address` which is another class with a nullable property `city`, write a function that returns the city name if it exists or “Unknown City” if it does not.

    ```kotlin
    class Address(val city: String?)
    class Person(val address: Address?)

    fun getCityName(person: Person): String {
        return person.address?.city ?: "Unknown City"
    }

    fun main() {
        val person1 = Person(Address("New York"))
        val person2 = Person(null)
        println(getCityName(person1))
        println(getCityName(person2))
    }
    ```

10. **Scope Functions and Nullability**

    Write a function that takes a nullable list of integers and if it is not null sorts it and prints the sorted list. Use the `run` function for this.

    ```kotlin
    fun sortAndPrintList(numbers: List<Int>?) {
        numbers?.run {
            sorted().forEach { println(it) }
        }
    }

    fun main() {
        sortAndPrintList(listOf(3, 1, 4, 1, 5, 9))
        sortAndPrintList(null)
    }
    ```
