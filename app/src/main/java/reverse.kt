fun main() {
    val input = "HelloAQAEngineer"
    val actual = reverse(input)
    val expected = "reenignEAQAolleH"
    println("actual=$actual expected=$expected")
}

fun reverse(stroka: String): String {
    var result = ""
    for (i in stroka.lastIndex downTo 0) {
        val char = stroka.get(i)
        result += char
    }

    return result
}
