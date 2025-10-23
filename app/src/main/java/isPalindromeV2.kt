fun main() {
    val input = "а роза упала на лапу азора" // пофиг что русские буквы
    val actual = isPalindromeV2(input)
    val expected = true
    println("actual=$actual expected=$expected")
}

fun isPalindromeV2(input: String): Boolean {
    val inputIsNotWhite = input.filterNot { it.isWhitespace() }
    val palindrome = inputIsNotWhite.reversed()
    if (palindrome == inputIsNotWhite) {
        return true
    } else {
        return false
    }
}

