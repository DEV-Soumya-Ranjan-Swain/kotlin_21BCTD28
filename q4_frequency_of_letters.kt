fun main() {
    val str = "hello world"
    val frequency = mutableMapOf<Char, Int>()
    for (char in str) {
        if (char.isLetter()) {
            frequency[char] = frequency.getOrDefault(char, 0) + 1
        }
    }
    for ((char, count) in frequency) {
        println("$char: $count")
    }
}
