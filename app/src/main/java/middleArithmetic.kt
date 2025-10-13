fun main() {
    val list = listOf(46, 48, 49, 50, 49, 46, 47, 48, 500, 47, 48, 50)

    val actual = middleArithmetic(list)

    val expected = 85.66667f

    println("actual=$actual, expected=$expected")

}

fun middleArithmetic(input: List<Int>): Float {
    var sum = 0
    for (i in 0..input.lastIndex) {
        val number = input.get(i)
        sum += number
    }
    return sum / input.size.toFloat()
}