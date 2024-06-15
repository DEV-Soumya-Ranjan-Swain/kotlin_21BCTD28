
class InvalidAgeException(message: String): Exception(message)

fun checkAge(age: Int) {
    if (age < 18) {
        throw InvalidAgeException("Age must be 18 or older")
    }
    println("Age is valid")
}
