fun main() {
    val input = "А роза упала на лапу Азора" // пофиг что русские буквы
    val actual = isPalindromeV2(input)
    val expected = true
    println("actual=$actual expected=$expected")
}

fun isPalindromeV2(input: String): Boolean {
    val inputWithoutWhitespaces = input.lowercase().filterNot { it.isWhitespace() }
    val reversed = inputWithoutWhitespaces.reversed()
    if (reversed == inputWithoutWhitespaces) {
        return true
    } else {
        return false
    }
}

