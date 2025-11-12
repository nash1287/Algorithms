fun main() {
    val text = "ababa ABaBa aBa"
    val pattern = "aba"

    val actual = findOccurrences(text, pattern)
    val expected = listOf(0, 2, 6, 8, 12)

    println("actual=$actual expected=$expected")
}

fun findOccurrences (input: String, pattern: String): List<Int> {
    val result = mutableListOf<Int>()
    var position = 0

    while (true) {
        val index = input.lowercase().indexOf(pattern,position)
        if(index==-1) break
        result.add(index)
        position=index+1
    }
    return result
}