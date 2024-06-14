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
    printUser(user1) // Output: User(name=Alice, email=alice@example.com)
    printUser(user2) // Output: Incomplete User
}