fun main() {
    val input = listOf(3, 6, 2, 1, 4, 5, 7, 8, 10, 11)

    val actual = find(input)
    val expected = listOf(9)

    println("actual=$actual expected=$expected")
}

fun find(input: List<Int>): Int {
    val min = input.min()
    val max = input.max()
    for (i in min..max) {
        if (!input.contains(i))
            return i
    }
    throw Exception("list contains all numbers")
}

