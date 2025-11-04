fun main() {
    val text = "ababa ABaBa aBa"
    val pattern = "aba"

    val actual = findOccurrences(text, pattern)
    val expected = listOf(0, 2, 6, 8, 12)

    println("actual=$actual expected=$expected")
}

fun findOccurrences (input: String, pattern: String): List<Int> {
    val list = mutableListOf<Int>()
    val inputLowerCase = input.lowercase()
    var pattern = ""

    for (i in 0..inputLowerCase.lastIndex) {
        val char = inputLowerCase.get(i)
        if (char=='a'||char=='b') {
            pattern+=char
            println(pattern)
        }
    }
    val aba = pattern.split()
    println(aba)

    return list
}