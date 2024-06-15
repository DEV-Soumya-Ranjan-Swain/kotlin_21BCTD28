
fun sortByAge(people: List<Pair<String, Int>>): List<Pair<String, Int>> {
    return people.sortedBy { it.second }
}
