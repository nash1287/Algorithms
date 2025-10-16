fun main() {

    val list = listOf(46, 10, 49, 50, 49, 46, 47, 16, 500, 48, 19, 50, 100)
    val actual = median(list)
    val expected = 48
    println("actual=$actual, expected=$expected")

}

fun median(input: List<Int>): Int {
    val sortedList = input.sorted()
    println(sortedList)
    val isEven = (sortedList.size % 2) == 0
    val middleIndex = sortedList.lastIndex / 2
    if (isEven) {
        return (sortedList[middleIndex] + sortedList.get(middleIndex + 1)) / 2
    } else {
        return sortedList.get(middleIndex)
    }
}



