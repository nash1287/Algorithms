fun main() {
    val input = "pogoda"
    val expected = mapOf('p' to 1, 'o' to 2, 'g' to 1, 'd' to 1, 'a' to 1)
    val actual: Map<Char, Int> = countChars(input)
    println("expected=$expected, actual=$actual")
}

fun countChars(input: String): Map<Char, Int> {
    val result = mutableMapOf<Char, Int>()
    for (i in 0..input.lastIndex) {
        val char = input.get(i)
    }


    return result
}