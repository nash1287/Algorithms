fun main() {
    val actual = factorial(5)
    val expected = 120

    println("actual=$actual expected=$expected")
}

fun factorial(number: Int): Long {
    require(number >= 0)
    var factorial = 1L
    for (i in 1..number) {
        factorial *= i
    }
    return factorial
}