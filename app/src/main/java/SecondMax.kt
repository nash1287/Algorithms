fun main() {
    val input = listOf(3, 5, 1, 5, 2)
    val actual = secondMax(input)
    val expected = 3
    println("actual=$actual expected=$expected")
}

fun secondMax(input: List<Int>): Int {
    val inputDistinctSorted = input.distinct().sorted()
    return inputDistinctSorted.get(inputDistinctSorted.lastIndex-1)
}

//fun secondMax(input: List<Int>): Int {
//    val sortInput = input.distinct().sorted()
//    println(sortInput)
//    val secondMaxValue = sortInput.get(sortInput.lastIndex-1)
//    return secondMaxValue
//}
