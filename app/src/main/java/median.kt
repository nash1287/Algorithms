fun main() {

    val list = listOf(20, 10, 8, 2)
    val actual = median(list)
    val expected = 10
    println("actual=$actual, expected=$expected")

}

fun median(input: List<Int>): Int {
    val sortedList = input.sorted()
    val isEven = sortedList.size % 2 == 0
    val middleIndex = sortedList.lastIndex/2
    if (!isEven) {
        return sortedList.get(middleIndex)
    } else {
        return (sortedList.get(middleIndex)+sortedList.get(middleIndex+1))/2
    }
}
//fun median(input: List<Int>): Int {
//    val inputSorted = input.sorted()
//    val middleValue = inputSorted.get(input.lastIndex/2)
//    val isEven = inputSorted.size % 2 == 0
//    if (!isEven) {
//        return middleValue
//    } else {
//        return (middleValue+1)/2
//    }
//}


//fun median(input: List<Int>): Int {
//    val sortList = input.sorted()
//    val middleSize = sortList.size/2
//    val middle = sortList.get(input.lastIndex/2)
//    val isEven = middleSize % 2 ==0
//    if(isEven) {
//        return (middle+1+middle)/2
//    } else {
//        return middle
//    }
//}
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



