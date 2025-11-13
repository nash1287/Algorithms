fun main() {
    val input = "hello world hello"
    val actual = wordCount(input)
    val expected = mapOf("hello" to 2, "world" to 1)
    println("actual=$actual expected=$expected")
}

fun wordCount(input: String): Map<String, Int> {
    val splitInput = input.split(" ")
    var map = mutableMapOf<String, Int>()
    for (word in splitInput) {
        val number = map.get(word)
        if (number == null) {
            map.put(word, 1)
        } else {
            map.put(word, number + 1)
        }
    }
    return map
}