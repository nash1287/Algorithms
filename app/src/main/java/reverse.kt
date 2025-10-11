fun main() {
    val input = "HelloAQAEngineer"
    val actual = reverse(input)
    val expected = "reenignEAQAolleH"
    println("actual=$actual expected=$expected")
}

fun reverse(input: String): String {
    return input.reversed()
}
