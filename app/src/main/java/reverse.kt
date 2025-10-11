fun main() {
    val input = "HelloAQAEngineer"
    val expected = reverse(input)
    println("actual=$input expected=$expected")
}

fun reverse(input: String): String {
    return input.reversed()
}
