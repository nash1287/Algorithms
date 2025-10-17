import androidx.appcompat.widget.WithHint

fun main() {
    val input = listOf(3, 6, 2, 1, 4, 5, 7, 8, 10, 15)

    val actual = find(input)
    val expected = 9

    println("actual=$actual expected=$expected")
}

fun find(input: List<Int>): String {
    var missingNumber = ""
    val sortList = input.sorted()
    sortList.zipWithNext().forEach { (first, second) ->
        if (second - first > 1) {
            missingNumber += first + 1
        }
    }
    return missingNumber
}
//    input.sorted().zipWithNext().forEach { (first, second) ->
//        if (second - first > 1) {
//            return first + 1
//        }
//    }
//    return input.sorted().last()+1
//}
