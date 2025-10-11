fun main() {
    val input = listOf(2, 5, 6)
    val expected = listOf("2@2", "5@5", "6@6")
    val actual = convertIntsToIntsWithChar(input)
    println("actual=$actual expected=$expected")
}

fun convertIntsToIntsWithChar(input: List<Int>): String {
    for (i in 0..input.lastIndex) {
        val _char = input.get(i)
        val expected = _char.toString()
        val resultat = expected + "+@$_char"

    }

    return "actual"
}