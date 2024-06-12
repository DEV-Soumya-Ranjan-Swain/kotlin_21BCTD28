fun main() {
    val number = 153
    var temp = number
    var digits = 0
    while (temp != 0) {
        temp /= 10
        digits++
    }
    temp = number
    var sum = 0
    while (temp != 0) {
        val remainder = temp % 10
        sum += Math.pow(remainder.toDouble(), digits.toDouble()).toInt()
        temp /= 10
    }
    if (sum == number) println("$number is an Armstrong number") else println("$number is not an Armstrong number")
}
