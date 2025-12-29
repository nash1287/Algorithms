fun main() {
    val input = listOf(1, 2, 3, 2, 4, 3)
    val actual = findDuplicates(input)
    val expected = listOf(2, 3)
    println("actual=$actual expected=$expected")
}

fun findDuplicates(input: List<Int>): List<Int> {
    val listDublicates = mutableListOf<Int>()
    val listUnique = mutableListOf<Int>()
    val sortInput = input.sorted()
    sortInput.forEach { number ->
        if (listUnique.contains(number)) {
            listDublicates.add(number)
        } else {
            listUnique.add(number)
        }
    }
    return listDublicates
}

//fun findDuplicates(input: List<Int>): List<Int> {
//    val uniqueList = mutableListOf<Int>()
//    val dublicatesList = mutableListOf<Int>()
//    input.forEach { number ->
//        if (uniqueList.contains(number)) {
//            dublicatesList.add(number)
//        } else {
//            uniqueList.add(number)
//        }
//    }
//    return dublicatesList
//}