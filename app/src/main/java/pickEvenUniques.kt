fun main() {
    val input = listOf(7, 2, 4, 3, 4, 10, 9, 8, 2, 6, 1)

    val actual = pickEvenUniques(input)
    val expected = listOf(2, 4, 6, 8, 10)

    println("actual=$actual expected=$expected")
}

fun pickEvenUniques(input:List<Int>):List<Int> {
    val sortedList = input.sorted().distinct()
    val listUnique = mutableListOf<Int>()
    sortedList.forEach {
        if (!listUnique.contains(it)&& it%2 ==0) {
            listUnique.add(it)
        }
    }
    return listUnique
}