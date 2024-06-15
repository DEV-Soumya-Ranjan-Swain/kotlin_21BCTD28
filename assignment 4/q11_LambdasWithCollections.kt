
fun processStrings(strings: List<String>, letter: Char): List<String> {
    return strings.filter { it.startsWith(letter) }
                  .map { it.uppercase() }
                  .sorted()
}
