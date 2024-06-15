
fun transformList(strings: List<String>, transform: (String) -> String): List<String> {
    return strings.map(transform)
}
