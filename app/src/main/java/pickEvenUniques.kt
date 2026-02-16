import androidx.core.app.PictureInPictureModeChangedInfo

fun main() {
    val input = listOf(7, 2, 4, 3, 4, 10, 9, 8, 2, 6, 1)

    val actual = pickEvenUniques(input)
    val expected = listOf(2, 4, 6, 8, 10)

    println("actual=$actual expected=$expected")
}

fun pickEvenUniques(input:List<Int>): List<Int> {
    val sortList = input.sorted()
    val isEvenList = mutableListOf<Int>()
    sortList.forEach {
        if(it%2==0) {
            isEvenList.add(it)
        }
    }
    return isEvenList.distinct()
}

//fun pickEvenUniques(input: List<Int>): List<Int> {
//    val listEvent = mutableListOf<Int>()
//    input
//        .sorted()
//        .forEach { number ->
//        if (number % 2 ==0 ) {
//            listEvent.add(number)
//        }
//    }
//    return listEvent.distinct()
//}


//fun pickEvenUniques(input: List<Int>): List<Int> {
//    val isEvenList = mutableListOf<Int>()
//    input.forEach { number ->
//        if (number % 2 == 0) {
//            isEvenList.add(number)
//        }
//    }
//    return isEvenList.distinct().sorted()
//}


//fun pickEvenUniques(input:List<Int>):List<Int> {
//    val sortedUniqueList = input.sorted().distinct()
//    val evenNumbers = mutableListOf<Int>()
//    sortedUniqueList.forEach {
//        if (it%2 ==0) {
//            evenNumbers.add(it)
//        }
//    }
//    return evenNumbers
//}