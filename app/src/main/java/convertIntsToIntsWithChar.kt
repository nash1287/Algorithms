fun main() {
    val input = listOf(2, 5, 6)
    val expected = listOf("2@2", "5@5", "6@6")
    val actual = convertIntsToIntsWithChar(input)
    println("actual=$actual expected=$expected")
}

fun convertIntsToIntsWithChar(input: List<Int>): List<String> {
    val newList = input.map { "$it@$it" }
    return newList
}


//fun convertIntsToIntsWithChar(input: List<Int>): List<String> {
//    val result = mutableListOf<String>()
//    for (i in 0..input.lastIndex) {
//        val number = input.get(i)
//        result.add("$number@$number")
//    }
//    return result
//}