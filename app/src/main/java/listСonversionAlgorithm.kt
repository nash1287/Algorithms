fun main() {
    val input = listOf(1, 3, 7)
    val expected = listOf(2, 4, 8)
    val actual = listСonversionAlgorithm(input)
    println("$actual$expected")
}

fun listСonversionAlgorithm(input: List<Int>): List<Int> {
    var result = mutableListOf<Int>()
    for (i in 0..input.lastIndex) {
        var number = input.get(i)
        result.add(number+1)
    }

    return result
}
