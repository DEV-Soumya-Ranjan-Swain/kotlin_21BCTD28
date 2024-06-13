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