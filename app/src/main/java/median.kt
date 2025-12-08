fun main() {

    val list = listOf(46, 10, 49, 50, 49, 46, 47, 16, 500, 48, 19, 50, 100)
    val actual = median(list)
    val expected = 48
    println("actual=$actual, expected=$expected")

}

fun median(input: List<Int>): Int {
    val sortList = input.sorted()
    val middleSize = sortList.size/2
    val middle = sortList.get(input.lastIndex/2)
    val isEven = middleSize % 2 ==0
    if(isEven) {
        return middle
    } else {
        return (middle+1+middle)/2
    }
}
//fun median(input: List<Int>): Int {
//    val sortInput = input.sorted()
//    val isEven = sortInput.size % 2 == 0
//    if (isEven) {
//        return sortInput.get((sortInput.lastIndex/2)+1)+(sortInput.lastIndex/2)
//    } else {
//        return sortInput.get(sortInput.lastIndex/2)
//    }
//
//}
//fun median(input: List<Int>): Int {
//    val sortedList = input.sorted()
//    println(sortedList)
//    val isEven = (sortedList.size % 2) == 0
//    val middleIndex = sortedList.lastIndex / 2
//    if (isEven) {
//        return (sortedList.get(middleIndex) + sortedList.get(middleIndex + 1)) / 2
//    } else {
//        return sortedList.get(middleIndex)
//    }
//
//}



