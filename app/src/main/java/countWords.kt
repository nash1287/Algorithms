fun main() {
    val input = listOf("Cat", "dog", "cat", "DOG", "bird", "dog")

    val actual = countWords(input)
    val expected = mapOf("bird" to 1, "cat" to 2, "dog" to 3)

    println("actual=$actual expected=$expected")
}


fun countWords(input: List<String>): Map<String, Int> {
    val sortedList = input.sorted().map{it.lowercase()}
    val map = mutableMapOf<String, Int>()
    sortedList.forEach { str->
        val number = map.get(str)
        if (number==null) {
            map.put(str, 1)
        } else {
            map.put(str, number+1)
        }
    }
    return map
}