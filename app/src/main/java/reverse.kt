fun main() {
    val input = "HelloAQAEngineer"
    val actual = reverse(input)
    val expected = "reenignEAQAolleH"
    println("actual=$actual expected=$expected")
}

fun reverse(input: String): String {
    var result = ""
    for (i in input.lastIndex downTo  0) {
        val char = input.get(i)
        result += char
    }

    return result
}
