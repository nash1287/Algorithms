fun main() {
    val input = listOf(3, 6, 2, 1, 4, 5, 7, 8, 10, 15)

    val actual = find(input)
    val expected = listOf(0, 9, 11, 12, 13, 14)

    println("actual=$actual expected=$expected")
}

fun find(input: List<Int>): List<Int> {
    val uniqueValue = mutableListOf<Int>()
    val sortList = input.sorted()
    for (number in 0..input.last()) {
        if (!sortList.contains(number)) (
            uniqueValue.add(number)
        )
    }
        return uniqueValue
}

//fun find(input: List<Int>): Int {
//    val min = input.min()
//    val max = input.max()
//    for (i in min..max) {
//        if (!input.contains(i))
//            return i
//    }
//    throw Exception("list contains all numbers")
//}

