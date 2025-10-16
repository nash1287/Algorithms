fun main() {
    val input = listOf(3, 6, 2, 1, 4, 5, 7, 8, 10, 11)

    val actual = find(input)
    val expected = 9

    println("actual=$actual expected=$expected")
}

fun find(input: List<Int>): Int {
    input.sorted().zipWithNext().forEach { (first, second) ->
        if (second - first > 1) {
            return first + 1
        }
    }
    return input.sorted().last()+1
}
