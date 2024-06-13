fun String.isPalindrome(): Boolean {
    return this == this.reversed()
}

fun main() {
    println("madam".isPalindrome())
    println("hello".isPalindrome())
}