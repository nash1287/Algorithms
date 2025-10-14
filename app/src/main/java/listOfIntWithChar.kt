fun main() {
    val input = listOf("!", "2", "g")
    val exptected = listOf("-!", "-2", "-g")
    val actual = listOfIntWithChar(input)

    println("actual=$actual")
    println("exptected=$exptected")
}

fun listOfIntWithChar(input: List<String>): List<String> {
    val list = mutableListOf<String>()
    for (i in 0..input.lastIndex) {
        val text = input.get(i)
        list.add("-$text")
    }
    return list
}